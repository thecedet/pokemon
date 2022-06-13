package lieu;

import dresseur.Dresseur;
import pokemon.Attaque;
import pokemon.Pokemon;

import static Game.Utilisateur.*;

public class Centre_Pokemon implements ICentre_Pokemon {

    public void menu_cp(Dresseur dresseur) {
        System.out.println(hashtag +
                "\nBienvenue dans le centre pokémon !" +
                "\nQue souhaitez-vous faire ?" +
                "\n" +
                "\n[1] -- Soigner mon équipe" +
                "\n[2] -- Consulter mon PC" +
                fermer + hashtag);
        int choix = entree_user();
        switch(choix) {
            case 1 :
                soin_totale(dresseur);
                break;
            case 2 :
                consulter_pc(dresseur);
                break;
            case 0 :
                break;
            default :
                System.out.println(saisi_nombre);
                menu_cp(dresseur);
                break;
        }
    }

    public void soin_totale(Dresseur dresseur) {
        for(Pokemon pokemon : dresseur.EQUIPE) {
            pokemon.setHp(pokemon.getHp_tot());
            pokemon.setStatus(null);
            for(Attaque attack : pokemon.getAttaques()) {
                attack.setPoint_de_pouvoir(attack.POINT_DE_POUVOIR_TOT);
            }
        }
        System.out.println("\nTous vos pokémons sont maintenant en pleine santé !");
        menu_cp(dresseur);
    }

    public void consulter_pc(Dresseur dresseur) {
        StringBuilder pc = new StringBuilder(hashtag + "\nBienvenue dans votre PC, souhaitez-vous prendre l'un de vos pokémons ?" +
                "\n");
        int index = 0;
        for(Pokemon pokemon : dresseur.PC) {
            index++;
            pc.append("\n[").append(index).append("] -- ").append(pokemon);
        }
        pc.append(fermer + hashtag);
        System.out.println(pc);
        int choix = entree_user();
        if((choix > 0) && (choix <= dresseur.PC.size())) {
            StringBuilder remplacer = new StringBuilder(hashtag + "\nPar quel membre de votre équipe souhaitez-vous le remplacer ?\n");
            int index2 = 0;
            for(Pokemon pokemon : dresseur.EQUIPE) {
                index2++;
                remplacer.append("\n[").append(index2).append("] -- ").append(pokemon);
            }
            remplacer.append(fermer + hashtag);
            System.out.println(remplacer);
            int choix2 = entree_user();
            if((choix2 > 0) && (choix2 <= dresseur.EQUIPE.size())) {
                dresseur.PC.add(dresseur.EQUIPE.get(choix2-1));
                dresseur.EQUIPE.remove(dresseur.EQUIPE.get(choix2-1));
                dresseur.EQUIPE.add(dresseur.PC.get(choix-1));
                dresseur.PC.remove(dresseur.PC.get(choix-1));
                System.out.println("\nVos pokémons ont bien été échangés!");
                menu_cp(dresseur);
            } else {
                consulter_pc(dresseur);
            }
        } else if(choix == 0) {
            menu_cp(dresseur);
        } else {
            System.out.println(saisi_nombre);
            consulter_pc(dresseur);
        }
    }

}
