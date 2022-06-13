package dresseur;

import java.util.ArrayList;
import java.util.Random;

import Error.ImpossibleMove;
import Map.CellDatas;
import Map.Map;
import lieu.Centre_Pokemon;
import objet.Objet;
import pokemon.Attaque;
import pokemon.Pokemon;

import static Game.Utilisateur.*;

public class Dresseur implements IDresseur {

	private final Map map;
	private int[] coord = new int[2];

    public final String NOM_DRESSEUR;
    public final ArrayList<Pokemon> EQUIPE;
    public final ArrayList<Objet> SAC;
    public final ArrayList<Pokemon> PC = new ArrayList<>();
    private int argent;

    public Dresseur(String nom_dresseur, ArrayList<Pokemon> equipe, ArrayList<Objet> sac, int argent, Map map) {
        this.NOM_DRESSEUR = nom_dresseur;
        this.EQUIPE = equipe;
        this.SAC = sac;
        this.argent = argent;
        
        this.map = map;
		this.init();

    }

    public void setArgent(int argent) {
        this.argent = argent;
    }

    public int getArgent() {
        return argent;
    }

    public boolean capturePokemon(Pokemon pokemon, Objet ball) {
        if(SAC.contains(ball)) {
            int tirage = new Random().nextInt(256);
            double seuil_capture;
            if(pokemon.getHp() <= (pokemon.getHp_tot()/4)) {
                seuil_capture = pokemon.getTaux_capture() * 1.5;
            } else if((pokemon.getHp() > (pokemon.getHp_tot()/4)) && (pokemon.getHp() <= (pokemon.getHp_tot()/2))) {
                seuil_capture = pokemon.getTaux_capture() * 1.25;
            } else {
                seuil_capture = pokemon.getTaux_capture();
            }
            seuil_capture += ball.getParametre();
            if(tirage < seuil_capture) {
                if(EQUIPE.size() == 6) {
                    PC.add(pokemon);
                    System.out.println("\nLe " + pokemon.getNom_pokemon() + " sauvage a été capturé ! \n Il est envoyé dans votre PC.");
                } else {
                    EQUIPE.add(pokemon);
                    System.out.println("\nLe " + pokemon.getNom_pokemon() + " sauvage a été capturé !");
                }
                return true;
            } else {
                System.out.println("\nLe " + pokemon.getNom_pokemon() + " sauvage s'est libéré !");
            }
            SAC.remove(ball);
        } else {
            System.out.println("\nVous n'avez pas de ball !");
        }
        return false;
    }

    public Dresseur generate_dresseur_faible(CellDatas cell) {
        ArrayList<Pokemon> equipe = new ArrayList<>();
        int nbr_pokemon = switch (cell) {
            case EasyT1 -> new Random().nextInt(1, 3);
            case EasyT2 -> new Random().nextInt(3, 5);
            case EasyT3 -> new Random().nextInt(5, 7);
            default -> 0;
        };
        for(int i = 0; i < nbr_pokemon; i++) {
            equipe.add(new Pokemon().generate_pokemon_faible());
        }
        return new Dresseur("dresseur",equipe,null,500, this.map);
    }

    public Dresseur generate_dresseur_moyen(CellDatas cell) {
        ArrayList<Pokemon> equipe = new ArrayList<>();
        int nbr_pokemon = switch (cell) {
            case MediumT1 -> new Random().nextInt(1, 3);
            case MediumT2 -> new Random().nextInt(3, 5);
            case MediumT3 -> new Random().nextInt(5, 7);
            default -> 0;
        };
        for(int i = 0; i < nbr_pokemon; i++) {
            equipe.add(new Pokemon().generate_pokemon_moyen());
        }
        return new Dresseur("dresseur",equipe,null,1000, this.map);
    }

    public Dresseur generate_dresseur_fort(CellDatas cell) {
        ArrayList<Pokemon> equipe = new ArrayList<>();
        int nbr_pokemon = switch (cell) {
            case HardT1 -> new Random().nextInt(1, 3);
            case HardT2 -> new Random().nextInt(3, 5);
            case HardT3 -> new Random().nextInt(5, 7);
            default -> 0;
        };
        for(int i = 0;i < nbr_pokemon;i++) {
            equipe.add(new Pokemon().generate_pokemon_fort());
        }
        return new Dresseur("dresseur",equipe,null,2000, this.map);
    }

    public void menu_dresseur() {
        System.out.println(hashtag +
                "\nDans quel menu voulez-vous aller ?" +
                "\n" +
                "\n[1] -- Equipe" +
                "\n[2] -- Sac" +
                "\n[3] -- Quitter le jeu (pas de save)" + fermer + hashtag);
        int choix = entree_user();
        switch(choix) {
            case 1 :
                menu_equipe();
                break;
            case 2 :
                menu_sac();
                break;
            case 3 :
            	sc.close();
                System.exit(0);
            case 0 :
                break;
            default :
                System.out.println(saisi_nombre);
                menu_dresseur();
                break;
        }
    }

    public void menu_equipe() {
        StringBuilder team = new StringBuilder(hashtag + "\nVoici votre équipe !" +
                "\n");
        int index = 0;
        for(Pokemon pokemon : EQUIPE) {
            index++;
            team.append("\n[").append(index).append("] -- ").append(pokemon);
        }
        team.append(fermer + hashtag);
        System.out.println(team);
        int choix = entree_user();
        if((choix > 0) && (choix <= EQUIPE.size())) {
            String action_pokemon = hashtag + "\nQue souhaitez-vous faire ?" +
                    "\n" +
                    "\n[1] -- Changer de place" +
                    "\n[2] -- Inspecter le pokémon" +
                    "\n[3] -- Inspecter les attaques" +
                    fermer + hashtag;
            System.out.println(action_pokemon);
            int choix1 = entree_user();
            switch(choix1) {
                case 1 :
                    String choix_switch = """

                            Avec qui voulez-vous le changer de place ? (reprendre les mêmes chiffres que précédemment)
                            """;
                    System.out.println(choix_switch);
                    int choix2 = entree_user();
                    if((choix2 > 0) && (choix2 != choix) && (choix2 <= EQUIPE.size())) {
                        switch_membre(choix-1,choix2-1);
                    } else {
                        System.out.println(saisi_nombre);
                    }
                    break;
                case 2 :
                    System.out.println((EQUIPE.get(choix-1)).fiche_detail_pokemon());
                    break;
                case 3 :
                    for(Attaque attack : (EQUIPE.get(choix-1)).getAttaques()) {
                        System.out.println(attack.fiche_detail_attaque());
                    }
                case 0 :
                    break;
                default :
                    System.out.println(saisi_nombre);
                    break;
            }
            menu_equipe();
        } else if(choix == 0) {
            menu_dresseur();
        } else {
            System.out.println(saisi_nombre);
            menu_equipe();
        }
    }

    public void switch_membre(int p1,int p2) {
        if(((p1 == 0) && (EQUIPE.get(p2).isKO())) || ((p2 == 0) && (EQUIPE.get(p1).isKO()))) {
            System.out.println("Vous ne pouvez pas mettre un pokémon KO en tête !");
        } else {
            ArrayList<Pokemon> fil_attente = new ArrayList<>();
            fil_attente.add(EQUIPE.get(p1));
            fil_attente.add(EQUIPE.get(p2));
            if(p1 > p2)  {
                EQUIPE.remove(p1);
                EQUIPE.remove(p2);
                EQUIPE.add(p2,fil_attente.get(0));
                EQUIPE.add(p1,fil_attente.get(1));
            } else {
                EQUIPE.remove(p1);
                EQUIPE.remove(p2-1);
                EQUIPE.add(p1,fil_attente.get(1));
                EQUIPE.add(p2,fil_attente.get(0));
            }
            System.out.println("\nVos pokémons ont bien échangé leur place !");
        }
    }

    public void menu_sac() {
        StringBuilder inventaire = new StringBuilder(hashtag + "\nVoici votre sac !" +
                "\n");
        int index = 0;
        for(Objet objet : SAC) {
            index++;
            inventaire.append("\n[").append(index).append("] -- ").append(objet);
        }
        inventaire.append(fermer + hashtag);
        System.out.println(inventaire);
        int choix = entree_user();
        if((choix > 0) && (choix <= SAC.size())) {
            System.out.println(hashtag + "\nQue souhaitez-vous faire ?\n" +
                    "\n[1] -- Utiliser" + fermer + hashtag);
            int choix1 = entree_user();
            switch(choix1) {
                case 1 :
                    if((SAC.get(choix-1).equals(Objet.HYPERBALL)) || (SAC.get(choix-1).equals(Objet.SUPERBALL)) || (SAC.get(choix-1).equals(Objet.POKEBALL))) {
                        System.out.println("\nVous ne pouvez pas utilisez cet objet maintenant.");
                    } else {
                        StringBuilder choix_utilisation = new StringBuilder("""

                                Sur quel membre de votre équipe ?
                                """);
                        int index2 = 0;
                        for(Pokemon pokemon : EQUIPE) {
                            index2++;
                            choix_utilisation.append("\n[").append(index2).append("] -- ").append(pokemon);
                        }
                        System.out.println(choix_utilisation);
                        int choix2 = entree_user();
                        if((choix2 > 0) && (choix2 <= EQUIPE.size())) {
                            if((SAC.get(choix-1).equals(Objet.HYPER_POTION)) || (SAC.get(choix-1).equals(Objet.SUPER_POTION)) || (SAC.get(choix-1).equals(Objet.POTION))) {
                                SAC.get(choix-1).soin(EQUIPE.get(choix2-1),this, SAC.get(choix-1));
                            } else if(SAC.get(choix-1).equals(Objet.RAPPEL)) {
                                SAC.get(choix-1).revive_rappel(EQUIPE.get(choix2-1),this);
                            } else if(SAC.get(choix-1).equals(Objet.MAX_RAPPEL)) {
                                SAC.get(choix-1).revive_max_rappel(EQUIPE.get(choix2-1),this);
                            } else {
                                SAC.get(choix-1).anti_status(EQUIPE.get(choix2-1),this);
                            }
                        }
                    }
                    break;
                case 0 :
                    break;
                default :
                    System.out.println(saisi_nombre);
                    break;
            }
            menu_sac();
        } else if(choix == 0) {
            menu_dresseur();
        } else {
            System.out.println(saisi_nombre);
            menu_sac();
        }
    }

    public void objet_trouve() {
        Objet o = Objet.values()[new Random().nextInt(Objet.values().length)];
        SAC.add(o);
        System.out.println("\nVous avez ramassé : " + o + " !");
    }

    public String apparition(Pokemon pokemon) {
        return "\nUn " + pokemon + " sauvage apparaît !";
    }

    public String match(Dresseur dresseur) {
        return "\nUn " + dresseur + " veut se battre !";
    }

    public boolean teamKO() {
        int nbr_KO = 0;
        for(Pokemon pokemon : EQUIPE) {
            if(pokemon.isKO()) {
                nbr_KO++;
            }
        }
        return nbr_KO == EQUIPE.size();
    }

    public boolean menu_equipe_combat() {
        StringBuilder team = new StringBuilder(hashtag + "\nVoici votre équipe !" +
                "\n");
        int index = 0;
        for(Pokemon pokemon : EQUIPE) {
            index++;
            team.append("\n[").append(index).append("] -- ").append(pokemon);
        }
        team.append(fermer + hashtag);
        System.out.println(team);
        int choix = entree_user();
        if((choix > 0) && (choix <= EQUIPE.size())) {
            String action_pokemon = hashtag + "\nQue souhaitez-vous faire ?" +
                    "\n" +
                    "\n[1] -- Changer de place" +
                    "\n[2] -- Inspecter le pokémon" +
                    "\n[3] -- Inspecter les attaques" +
                    fermer + hashtag;
            System.out.println(action_pokemon);
            int choix1 = entree_user();
            switch(choix1) {
                case 1 :
                    String choix_switch = """

                            Avec qui voulez-vous le changer de place ? (reprendre les mêmes chiffres que précédemment)
                            """;
                    System.out.println(choix_switch);
                    int choix2 = entree_user();
                    if((choix2 > 0) && (choix2 != choix) && (choix2 <= EQUIPE.size())) {
                        switch_membre(choix-1,choix2-1);
                        return true;
                    } else {
                        System.out.println(saisi_nombre);
                        menu_equipe_combat();
                    }
                    break;
                case 2 :
                    System.out.println((EQUIPE.get(choix-1)).fiche_detail_pokemon());
                    menu_equipe_combat();
                    break;
                case 3 :
                    for(Attaque attack : (EQUIPE.get(choix-1)).getAttaques()) {
                        System.out.println(attack.fiche_detail_attaque());
                    }
                    menu_equipe_combat();
                case 0 :
                    menu_equipe_combat();
                    break;
                default :
                    System.out.println(saisi_nombre);
                    menu_equipe_combat();
                    break;
            }
        } else if(choix != 0) {
            System.out.println(saisi_nombre);
            menu_equipe_combat();
        }
        return false;
    }

    public int menu_sac_combat_sauvage(Pokemon sauvage) {
        StringBuilder inventaire = new StringBuilder(hashtag + "\nVoici votre sac !" +
                "\n");
        int index = 0;
        for(Objet objet : SAC) {
            index++;
            inventaire.append("\n[").append(index).append("] -- ").append(objet);
        }
        inventaire.append(fermer + hashtag);
        System.out.println(inventaire);
        int choix = entree_user();
        if((choix > 0) && (choix <= SAC.size())) {
            System.out.println(hashtag + "\nQue souhaitez-vous faire ?\n" +
                    "\n[1] -- Utiliser" + fermer + hashtag);
            int choix1 = entree_user();
            switch(choix1) {
                case 1 :
                    if((SAC.get(choix-1).equals(Objet.HYPERBALL)) || (SAC.get(choix-1).equals(Objet.SUPERBALL)) || (SAC.get(choix-1).equals(Objet.POKEBALL))) {
                        if(capturePokemon(sauvage, SAC.get(choix-1))) {
                            return 2;
                        }
                    } else {
                        StringBuilder choix_utilisation = new StringBuilder("""

                                Sur quel membre de votre équipe ?
                                """);
                        int index2 = 0;
                        for(Pokemon pokemon : EQUIPE) {
                            index2++;
                            choix_utilisation.append("\n[").append(index2).append("] -- ").append(pokemon);
                        }
                        choix_utilisation.append(fermer);
                        System.out.println(choix_utilisation);
                        int choix2 = entree_user();
                        if((choix2 <= 0) || (choix2 > EQUIPE.size())) {
                            return 0;
                        } else {
                            if((SAC.get(choix-1).equals(Objet.HYPER_POTION)) || (SAC.get(choix-1).equals(Objet.SUPER_POTION)) || (SAC.get(choix-1).equals(Objet.POTION))) {
                                SAC.get(choix-1).soin(EQUIPE.get(choix2-1),this, SAC.get(choix-1));
                            } else if(SAC.get(choix-1).equals(Objet.RAPPEL)) {
                                SAC.get(choix-1).revive_rappel(EQUIPE.get(choix2-1),this);
                            } else if(SAC.get(choix-1).equals(Objet.MAX_RAPPEL)) {
                                SAC.get(choix-1).revive_max_rappel(EQUIPE.get(choix2-1),this);
                            } else {
                                SAC.get(choix-1).anti_status(EQUIPE.get(choix2-1),this);
                            }
                            return 1;
                        }
                    }
                    return 1;
                case 0 :
                    break;
                default :
                    System.out.println(saisi_nombre);
                    break;
            }
        } else if(choix != 0) {
            System.out.println(saisi_nombre);
            menu_sac_combat_sauvage(sauvage);
        }
        return 0;
    }

    public void switch_membre_force(Pokemon ko) {
        if((ko.isKO()) && (!teamKO())) {
            affichage_KO(ko);
            StringBuilder p_ko = new StringBuilder("\nVeuillez choisir un autre pokémon !\n");
            int index = 0;
            for(Pokemon restant : EQUIPE) {
                index++;
                p_ko.append("\n[").append(index).append("] -- ").append(restant);
            }
            System.out.println(p_ko);
            int choix = entree_user();
            while((choix <= 1) || (choix > EQUIPE.size()) || (EQUIPE.get(choix-1).isKO())) {
                choix = entree_user();
            }
            ArrayList<Pokemon> fil_attente = new ArrayList<>();
            fil_attente.add(EQUIPE.get(0));
            fil_attente.add(EQUIPE.get(choix-1));
            EQUIPE.remove(0);
            EQUIPE.remove(choix-2);
            EQUIPE.add(0,fil_attente.get(1));
            EQUIPE.add(choix-1,fil_attente.get(0));
            System.out.println("\nVos pokémons ont bien échangé leur place !");
        }
    }

    public void lose() {
        if(teamKO()) {
            System.out.println("\nTous vos pokémons sont KO... Vous courez au Centre Pokémon !" +
                    "\nVous avez perdu " + (argent/10) + " pokédollars.");
            argent -= (argent/10);
            new Centre_Pokemon().soin_totale(this);
            this.coord = new int[] {9,9};
            this.showMap();
        }
    }

    public void combat_pokemon_sauvage(Pokemon sauvage) {
        Pokemon first = EQUIPE.get(0);
        System.out.println(apparition(sauvage));
        int event = 0;
        while((!teamKO()) && (!sauvage.isKO()) && (event == 0)) {
            first.ecran_combat(sauvage);
            boolean reload = true;
            while(reload){
                System.out.println(hashtag + "\n[1] -- Attaque\n[2] -- Equipe\n[3] -- Sac\n[4] -- Fuite" + hashtag);
                int choix = 0;
                while((choix < 1) || (choix > 4)) {
                    choix = entree_user();
                }
                switch (choix) {
                    case 1 :
                        StringBuilder liste_attack = new StringBuilder(hashtag);
                        int index = 0;
                        for(Attaque a : first.getAttaques()) {
                            index++;
                            liste_attack.append("\n[").append(index).append("] -- ").append(a);
                        }
                        liste_attack.append(fermer + hashtag);
                        System.out.println(liste_attack);
                        reload = first.use_attack(sauvage,entree_user());
                        break;
                    case 2 :
                        if(menu_equipe_combat()) {
                            first = EQUIPE.get(0);
                            reload = false;
                        }
                        break;
                    case 3 :
                        int result = menu_sac_combat_sauvage(sauvage);
                        if(result == 1) {
                            reload = false;
                        } else if(result == 2) {
                            event = 1;
                            reload = false;
                        }
                        break;
                    case 4 :
                        event = -1;
                        System.out.println("Vous fuyez le combat...");
                        reload = false;
                        break;
                    default :
                        break;
                }
            }
            if(event == 1) {
                first.gain_exp(sauvage);
                first.level_up();
            } else if(sauvage.isKO()) {
                first.sauvageKO(sauvage);
            } else if(event != -1) {
                sauvage.use_attack(first,new Random().nextInt(sauvage.getAttaques().size()) + 1);
                switch_membre_force(first);
                first = EQUIPE.get(0);
                if(first.isStatus()) {
                    switch_membre_force(first);
                    first = EQUIPE.get(0);
                }
                if(sauvage.isStatus()) {
                    if(sauvage.isKO()) {
                        first.sauvageKO(sauvage);
                    }
                }
            }
        }
        lose();
    }

    public boolean menu_sac_combat_dresseur() {
        StringBuilder inventaire = new StringBuilder(hashtag + "\nVoici votre sac !" +
                "\n");
        int index = 0;
        for(Objet objet : SAC) {
            index++;
            inventaire.append("\n[").append(index).append("] -- ").append(objet);
        }
        inventaire.append(fermer + hashtag);
        System.out.println(inventaire);
        int choix = entree_user();
        if((choix > 0) && (choix <= SAC.size())) {
            System.out.println(hashtag + "\nQue souhaitez-vous faire ?\n" +
                    "\n[1] -- Utiliser" + fermer + hashtag);
            int choix1 = entree_user();
            switch(choix1) {
                case 1 :
                    if((SAC.get(choix-1).equals(Objet.HYPERBALL)) || (SAC.get(choix-1).equals(Objet.SUPERBALL)) || (SAC.get(choix-1).equals(Objet.POKEBALL))) {
                        System.out.println("\nVous ne pouvez pas utilisez cet objet maintenant.");
                    } else {
                        StringBuilder choix_utilisation = new StringBuilder("""

                                Sur quel membre de votre équipe ?
                                """);
                        int index2 = 0;
                        for(Pokemon pokemon : EQUIPE) {
                            index2++;
                            choix_utilisation.append("\n[").append(index2).append("] -- ").append(pokemon);
                        }
                        choix_utilisation.append(fermer);
                        System.out.println(choix_utilisation);
                        int choix2 = entree_user();
                        if((choix2 > 0) && (choix2 <= EQUIPE.size())) {
                            if((SAC.get(choix-1).equals(Objet.HYPER_POTION)) || (SAC.get(choix-1).equals(Objet.SUPER_POTION)) || (SAC.get(choix-1).equals(Objet.POTION))) {
                                SAC.get(choix-1).soin(EQUIPE.get(choix2-1),this, SAC.get(choix-1));
                            } else if(SAC.get(choix-1).equals(Objet.RAPPEL)) {
                                SAC.get(choix-1).revive_rappel(EQUIPE.get(choix2-1),this);
                            } else if(SAC.get(choix-1).equals(Objet.MAX_RAPPEL)) {
                                SAC.get(choix-1).revive_max_rappel(EQUIPE.get(choix2-1),this);
                            } else {
                                SAC.get(choix-1).anti_status(EQUIPE.get(choix2-1),this);
                            }
                            return true;
                        }
                    }
                    break;
                case 0 :
                    break;
                default :
                    System.out.println(saisi_nombre);
                    break;
            }
        } else if(choix != 0) {
            System.out.println(saisi_nombre);
            menu_sac_combat_dresseur();
        }
        return false;
    }

    public void combat_dresseur_bot(Dresseur adversaire) {
        Pokemon first = EQUIPE.get(0);
        Pokemon ennemi = adversaire.EQUIPE.get(0);
        System.out.println(match(adversaire));
        while((!teamKO()) && (!adversaire.teamKO())) {
            first.ecran_combat(ennemi);
            boolean reload = true;
            while(reload){
                System.out.println(hashtag + "\n[1] -- Attaque\n[2] -- Equipe\n[3] -- Sac" + hashtag);
                int choix = entree_user();
                while((choix < 1) || (choix > 3)) {
                    choix = entree_user();
                }
                switch (choix) {
                    case 1 :
                        StringBuilder liste_attack = new StringBuilder(hashtag);
                        int index = 0;
                        for(Attaque a : first.getAttaques()) {
                            index++;
                            liste_attack.append("\n[").append(index).append("] -- ").append(a);
                        }
                        liste_attack.append(fermer + hashtag);
                        System.out.println(liste_attack);
                        reload = first.use_attack(ennemi,entree_user());
                        break;
                    case 2 :
                        if(menu_equipe_combat()) {
                            first = EQUIPE.get(0);
                            reload = false;
                        }
                        break;
                    case 3 :
                        reload = !menu_sac_combat_dresseur();
                        break;
                    default :
                        break;
                }
            }
            if((ennemi.isKO()) && (!adversaire.teamKO())) {
                ennemi = first.ennemiKO(ennemi,adversaire);
            } else if(!adversaire.teamKO()) {
                ennemi.use_attack(first,new Random().nextInt(ennemi.getAttaques().size()) + 1);
                switch_membre_force(first);
                first = EQUIPE.get(0);
                if(first.isStatus()) {
                    switch_membre_force(first);
                    first = EQUIPE.get(0);
                }
                if(ennemi.isStatus()) {
                    if((ennemi.isKO()) && (!adversaire.teamKO())) {
                        ennemi = first.ennemiKO(ennemi,adversaire);
                    }
                }
            }
        }
        lose();
        if(adversaire.teamKO()) {
            affichage_KO(ennemi);
            System.out.println("\nVous avez vaincu le " + adversaire + " !\nVous avez gagné " + adversaire.argent + " pokédollars.");
            argent += adversaire.argent;
        }
    }

    public String toString() {
        return NOM_DRESSEUR;
    }


    public int[] getCoord() {
		return this.coord;
	}
	
	public void setCoord(int[] coord) {
		this.coord = coord;
	}
	
	public void bouger() {
		for(Mouvements mouvement : Mouvements.values()) {
			System.out.println(mouvement.toString());
		}
		System.out.println("Vos coords: "+ this.coord[0]+" "+this.coord[1]);
		System.out.print("Votre choix: ");
		try {
			switch (sc.nextLine()) {
			case "z": {
				this.map.movePlayer(this, Mouvements.UP.execute(this.coord[0], this.coord[1], this.map.getTailleX(), this.map.getTailleY()));
				break;
			}
			case "s": {
				this.map.movePlayer(this, Mouvements.DOWN.execute(this.coord[0], this.coord[1], this.map.getTailleX(), this.map.getTailleY()));
				break;
			}
			case "q": {
				this.map.movePlayer(this, Mouvements.LEFT.execute(this.coord[0], this.coord[1], this.map.getTailleX(), this.map.getTailleY()));
				break;
			}
			case "d": {
				this.map.movePlayer(this, Mouvements.RIGHT.execute(this.coord[0], this.coord[1], this.map.getTailleX(), this.map.getTailleY()));
				break;
			}
			case "menu": { 
				this.menu_dresseur();
				break;
			}
			default:
				break;
			}
		} catch (ImpossibleMove e) {
			System.out.println(e.getMessage());
		}
	}
	


	private void init() {
		this.coord = this.map.spawnPlayer(this);
		System.out.println("[INFO] "+ this.NOM_DRESSEUR + " vient de se connecter -> ("+ this.coord[0]+";"+this.coord[1]+")");
	}
	

	public String showMap() {
		return this.map.show(this.coord[0], this.coord[1]);
	}
    
    
}
