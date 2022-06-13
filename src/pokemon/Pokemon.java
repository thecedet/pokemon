package pokemon;

import java.util.ArrayList;
import java.util.Random;

import dresseur.Dresseur;
import variable.Variable_Pokemon;

import static Game.Utilisateur.*;

public class Pokemon implements IPokemon {

    private String nom_pokemon;
    private Type type1;
    private Type type2;
    private int exp;
    private float level = 3;
    private Pokemon evolution;
    private int lvl_evo;
    private float hp;
    private float hp_tot;
    private String status = "aucun";
    private float taux_capture;
    private ArrayList<Attaque> attaques;
    public final ArrayList<Attaque> ATTAQUES_DISPO;

    public Pokemon(String nom_pokemon, Type type1, Type type2, int exp, int lvl_evo, float taux_capture, ArrayList<Attaque> attaques_dispo) {
        this.nom_pokemon = nom_pokemon;
        this.type1 = type1;
        this.type2 = type2;
        this.exp = exp;
        this.lvl_evo = lvl_evo;
        this.taux_capture = taux_capture;
        this.ATTAQUES_DISPO = attaques_dispo;
    }

    public Pokemon(String nom_pokemon, Type type1, Type type2, int exp, float taux_capture, ArrayList<Attaque> attaques_dispo) {
        this.nom_pokemon = nom_pokemon;
        this.type1 = type1;
        this.type2 = type2;
        this.exp = exp;
        this.taux_capture = taux_capture;
        this.ATTAQUES_DISPO = attaques_dispo;
    }

    public Pokemon() {
        ATTAQUES_DISPO = new ArrayList<>();
    }

    public void setEvolution(Pokemon evolution) {
        this.evolution = evolution;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNom_pokemon() {
        return nom_pokemon;
    }

    public float getHp() {
        return hp;
    }

    public float getHp_tot() {
        return hp_tot;
    }

    public String getStatus() {
        return status;
    }

    public float getTaux_capture() {
        return taux_capture;
    }

    public ArrayList<Attaque> getAttaques() {
        return attaques;
    }

    public String toString() {
        String pokemon = nom_pokemon + " Lv." + (int) level;
        if(!status.equals("aucun")) {
            pokemon += "  " + status;
        }
        return pokemon;
    }

    public String fiche_detail_pokemon() {
        StringBuilder liste_attaques = new StringBuilder("\n");
        for(Attaque attack : attaques) {
            liste_attaques.append("\n    ").append(attack);
        }
        return hashtag +
                "\n" +
                "\n    Pokemon : " + nom_pokemon + "        Types : " + type1 + " / " + type2 +
                "\n" +
                "\n    Exp : " + exp + "        Level : " + level +
                "\n" +
                "\n    HP : " + hp + "/" + hp_tot + "        Status : " + status +
                "\n" +
                "\n    Attaques : " + liste_attaques +
                "\n" +
                hashtag;
    }

    public void evolution() {
        System.out.println("\n" + nom_pokemon + " a évolué en " + evolution + " !");
        nom_pokemon = evolution.nom_pokemon;
        type1 = evolution.type1;
        type2 = evolution.type2;
        evolution = evolution.evolution;
        lvl_evo = evolution.lvl_evo;
        taux_capture = evolution.taux_capture;
    }

    public boolean attaque_dmg(Attaque attack, Pokemon receveur) {
        if(attack.getPoint_de_pouvoir() != 0) {
            float degat;
            int chance_stat = new Random().nextInt(100);
            System.out.println("\n" + nom_pokemon + " utilise " + attack.NOM_ATTAQUE + " !");
            String efficace;
            if((attack.TYPE_ATTAQUE.FORT.contains(receveur.type1)) && (attack.TYPE_ATTAQUE.FORT.contains(receveur.type2))) {
                degat = attack.DMG * (level / 10) * 4;
                efficace = "\nC'est super efficace !";
            } else if((attack.TYPE_ATTAQUE.FAIBLE.contains(receveur.type1)) && (attack.TYPE_ATTAQUE.FAIBLE.contains(receveur.type2))) {
                degat = (float) Math.floor((attack.DMG * (level / 10)) / 4);
                efficace = "\nCe n'est pas très efficace...";
            } else if((attack.TYPE_ATTAQUE.INEFFICACE.contains(receveur.type1)) || (attack.TYPE_ATTAQUE.INEFFICACE.contains(receveur.type2))) {
                degat = 0;
                chance_stat = 100;
                efficace = "\nL'attaque n'a aucun effet.";
            } else if(((attack.TYPE_ATTAQUE.FORT.contains(receveur.type1)) && (attack.TYPE_ATTAQUE.FAIBLE.contains(receveur.type2))) || ((attack.TYPE_ATTAQUE.FAIBLE.contains(receveur.type1)) && (attack.TYPE_ATTAQUE.FORT.contains(receveur.type2)))) {
                degat = attack.DMG * (level / 10);
                efficace = "";
            } else if((attack.TYPE_ATTAQUE.FORT.contains(receveur.type1)) || (attack.TYPE_ATTAQUE.FORT.contains(receveur.type2))) {
                degat = attack.DMG * (level / 10) * 2;
                efficace = "\nC'est super efficace !";
            } else if((attack.TYPE_ATTAQUE.FAIBLE.contains(receveur.type1)) || (attack.TYPE_ATTAQUE.FAIBLE.contains(receveur.type2))) {
                degat = (float) Math.floor((attack.DMG * (level / 10)) / 2);
                efficace = "\nCe n'est pas très efficace...";
            } else {
                degat = attack.DMG * (level / 10);
                efficace = "";
            }
            receveur.hp -= (degat - (degat % 1));
            attack.setPoint_de_pouvoir(attack.getPoint_de_pouvoir() - 1);
            System.out.println(efficace);
            if(receveur.hp < 0) {
                receveur.hp = 0;
            } else {
                if((chance_stat < 10) && (attack.STATUS != null)) {
                    receveur.status = attack.STATUS;
                }
            }
            return true;
        }
        return false;
    }

    public boolean attaque_status(Attaque attack, Pokemon receveur) {
        if((attack.getPoint_de_pouvoir() != 0) && (!receveur.status.equals(attack.STATUS))) {
            System.out.println("\n" + nom_pokemon + " utilise " + attack.NOM_ATTAQUE + " !");
            receveur.status = attack.STATUS;
            attack.setPoint_de_pouvoir(attack.getPoint_de_pouvoir() - 1);
            return true;
        }
        return false;
    }

    public void gain_exp(Pokemon receveur) {
        if(level < 15) {
            int xp = (int) (100 * receveur.level);
            exp += xp;
            System.out.println("\n" + nom_pokemon + " a gagné " + xp + " exp !");
        }
    }

    public void level_up() {
        if(exp >= (level * 1000)) {
            level++;
            System.out.println("\n" + nom_pokemon + " est monté au niveau " + level + " !");
            hp_tot += 30;
            if(level == 15) {
                exp = 0;
            } else {
                exp -= ((level-1) * 1000);
            }
            apprendre_attaque();
            if(level == lvl_evo) {
                evolution();
            }
        }
    }

    public boolean isKO() {
        if(hp == 0) {
            status = "KO";
            return true;
        } else {
            return false;
        }
    }

    public boolean isStatus() {
        if ((status.equals("brule")) || (status.equals("poison"))) {
            hp -= hp_tot / 10;
            if (hp < 0) {
                hp = 0;
            }
            return true;
        } else {
            return false;
        }
    }

    public void apprendre_attaque() {
        if((level == 4) || (level == 6) || (level == 8)) {
            attaques.add(ATTAQUES_DISPO.get((int) (level - 2)/2));
        } else if((level == 10) || (level > 11)) {
            StringBuilder learn = new StringBuilder(nom_pokemon + " veut apprendre l'attaque ");
            Attaque new_attack = switch ((int) level) {
                case 10 -> ATTAQUES_DISPO.get(4);
                case 12 -> ATTAQUES_DISPO.get(5);
                case 13 -> ATTAQUES_DISPO.get(6);
                case 14 -> ATTAQUES_DISPO.get(7);
                case 15 -> ATTAQUES_DISPO.get(8);
                default -> null;
            };
            learn.append(new_attack).append(" !").append("\n").append("\nSouhaitez-vous remplacer l'une des attaques suivantes ? :").append("\n");
            for(int i = 0; i < 4; i++) {
                learn.append("\n[").append(i + 1).append("] - ").append(attaques.get(i));
            }
            learn.append("\n\n[0] - Aucune");
            System.out.println(learn);
            int choix = entree_user();
            if((choix > 4) || (choix < 0)) {
                System.out.println(comique);
                apprendre_attaque();
            } else {
                System.out.println("\nValidez-vous le choix ? (y/n)");
                boolean valider = yes_no();
                if(valider && (choix == 0)) {
                    System.out.println("\n" + nom_pokemon + " n'a pas appris " + new_attack + "...");
                } else if(valider) {
                    System.out.println("\n" + nom_pokemon + " a oublié " + attaques.get(choix-1) + " et a appris " + new_attack + " !");
                    attaques.remove(choix-1);
                    attaques.add(new_attack);
                } else {
                    System.out.println("\nVous avez changé de décision ?");
                    apprendre_attaque();
                }
            }
        }
    }

    public Pokemon generate_starter(int i) {
        Pokemon pokemon = switch (i) {
            case 1 -> new Variable_Pokemon().tortipouss();
            case 2 -> new Variable_Pokemon().ouisticram();
            case 3 -> new Variable_Pokemon().tiplouf();
            default -> null;
        };
        assert pokemon != null;
        pokemon.level = 3;
        pokemon.hp_tot = 90;
        pokemon.hp = pokemon.hp_tot;
        pokemon.status = "aucun";
        ArrayList<Attaque> pokemon_attack = new ArrayList<>();
        pokemon_attack.add(pokemon.ATTAQUES_DISPO.get(0));
        pokemon.attaques = pokemon_attack;
        return pokemon;
    }

    public Pokemon generate_pokemon_faible() {
        Pokemon pokemon = new Variable_Pokemon().pokemon_faible().get(new Random().nextInt(new Variable_Pokemon().pokemon_faible().size()));
        pokemon.level = new Random().nextInt(2,5);
        pokemon.hp_tot = 30 * pokemon.level;
        pokemon.hp = pokemon.hp_tot;
        pokemon.status = "aucun";
        ArrayList<Attaque> pokemon_attack = new ArrayList<>();
        pokemon_attack.add(pokemon.ATTAQUES_DISPO.get(0));
        if(pokemon.level == 4) {
            pokemon_attack.add(pokemon.ATTAQUES_DISPO.get(1));
        }
        pokemon.attaques = pokemon_attack;
        return pokemon;
    }

    public Pokemon generate_pokemon_moyen() {
        Pokemon pokemon = new Variable_Pokemon().pokemon_moyen().get(new Random().nextInt(new Variable_Pokemon().pokemon_moyen().size()));
        pokemon.level = new Random().nextInt(6,8);
        pokemon.hp_tot = 30 * pokemon.level;
        pokemon.hp = pokemon.hp_tot;
        pokemon.status = "aucun";
        ArrayList<Attaque> pokemon_attack = new ArrayList<>();
        pokemon_attack.add(pokemon.ATTAQUES_DISPO.get(0));
        pokemon_attack.add(pokemon.ATTAQUES_DISPO.get(1));
        pokemon_attack.add(pokemon.ATTAQUES_DISPO.get(2));
        if(pokemon.level == 8) {
            pokemon_attack.add(pokemon.ATTAQUES_DISPO.get(3));
        }
        pokemon.attaques = pokemon_attack;
        return pokemon;
    }

    public Pokemon generate_pokemon_fort() {
        Pokemon pokemon = new Variable_Pokemon().pokemon_fort().get(new Random().nextInt(new Variable_Pokemon().pokemon_fort().size()));
        pokemon.level = new Random().nextInt(12,14);
        pokemon.hp_tot = 30 * pokemon.level;
        pokemon.hp = pokemon.hp_tot;
        pokemon.status = "aucun";
        ArrayList<Attaque> pokemon_attack = new ArrayList<>();
        pokemon_attack.add(pokemon.ATTAQUES_DISPO.get(2));
        pokemon_attack.add(pokemon.ATTAQUES_DISPO.get(3));
        pokemon_attack.add(pokemon.ATTAQUES_DISPO.get(4));
        pokemon_attack.add(pokemon.ATTAQUES_DISPO.get(5));
        if(pokemon.level == 13) {
            pokemon_attack.remove(0);
            pokemon_attack.add(pokemon.ATTAQUES_DISPO.get(6));
        }
        if(pokemon.level == 14) {
            pokemon_attack.remove(0);
            pokemon_attack.remove(1);
            pokemon_attack.add(pokemon.ATTAQUES_DISPO.get(6));
            pokemon_attack.add(pokemon.ATTAQUES_DISPO.get(7));
        }
        pokemon.attaques = pokemon_attack;
        return pokemon;
    }

    public Pokemon generate_pokemon_legendaire() {
        Pokemon pokemon = new Variable_Pokemon().pokemon_legendaire().get(new Random().nextInt(new Variable_Pokemon().pokemon_legendaire().size()));
        pokemon.level = 14;
        pokemon.hp_tot = 30 * pokemon.level;
        pokemon.hp = pokemon.hp_tot;
        pokemon.status = "aucun";
        ArrayList<Attaque> pokemon_attack = new ArrayList<>();
        pokemon_attack.add(pokemon.ATTAQUES_DISPO.get(4));
        pokemon_attack.add(pokemon.ATTAQUES_DISPO.get(5));
        pokemon_attack.add(pokemon.ATTAQUES_DISPO.get(6));
        pokemon_attack.add(pokemon.ATTAQUES_DISPO.get(7));
        pokemon.attaques = pokemon_attack;
        return pokemon;
    }

    public void sauvageKO(Pokemon sauvage) {
        affichage_KO(sauvage);
        gain_exp(sauvage);
        level_up();
    }

    public Pokemon ennemiKO(Pokemon ennemi, Dresseur adversaire) {
        sauvageKO(ennemi);
        adversaire.EQUIPE.remove(0);
        ennemi = adversaire.EQUIPE.get(0);
        System.out.println(adversaire + " a choisi " + ennemi + " !");
        return ennemi;
    }

    public boolean valid_attack() {
        if((status.equals("gel")) || (status.equals("endormi")) || (status.equals("para"))) {
            if(new Random().nextInt(2) == 0) {
                System.out.println("\n" + nom_pokemon + " est " + status + "... Il ne peut pas attaquer.");
                return false;
            }
        }
        return true;
    }

    public boolean use_attack(Pokemon cible, int choix) {
        if((choix > 0) && (choix <= attaques.size())) {
            if(valid_attack()) {
                if(attaques.get(choix-1).DMG == 0) {
                    return !attaque_status(attaques.get(choix - 1), cible);
                } else {
                    return !attaque_dmg(attaques.get(choix - 1), cible);
                }
            }
            return false;
        }
        return true;
    }

    public void ecran_combat(Pokemon cible) {
        System.out.println(hashtag + "\n" + this + "                       " + cible
                + "\n" + (int) hp + " / " + (int) hp_tot + "                            " +
                (int) cible.getHp() + " / " + (int) cible.getHp_tot() + hashtag + "\n");
    }

}
