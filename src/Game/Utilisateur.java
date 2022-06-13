package Game;

import java.util.ArrayList;
import java.util.Scanner;

import Map.Map;
import dresseur.Dresseur;
import objet.Objet;
import pokemon.Pokemon;

public class Utilisateur {

    public static final String saisi_nombre = "\nVeuillez saisir un nombre correct";
    public static final String hashtag = "\n####################################################";
    public final String triple_hashtag = "\n############################################################################################################################################################";
    public static final String fermer = "\n\n[0] -- Fermer";
    public static final String comique = "\nT'es un comique toi ! On réessaie...";
    public static final Scanner sc = new Scanner(System.in);

    public static void affichage_KO(Pokemon ko) {
        System.out.println("\n" + ko.getNom_pokemon() + " est tombé KO !");
    }

    public static int entree_user() {
        while(true) {
            try{
                System.out.print("--> ");
                return Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e) {
                System.out.println(saisi_nombre);
            }
        }
    }

    public void saisir_next() {
        System.out.print("Entrer '' pour la suite :\n-->");
        sc.nextLine();
    }

    public static boolean yes_no() {
        return (sc.nextLine().equals("y"));
    }

    public void bienvenue() {
        System.out.println(hashtag + "\nBienvenue Sur Pokémon Zebi ! " + hashtag);
        saisir_next();
    }

    public Dresseur saisie_nom_joueur(Map map) {

        System.out.println(hashtag + "\n* Vous entrez dans le centre pokémon... *");
        saisir_next();
        System.out.println("\n* BOOOOOOOOOOM *");
        saisir_next();
        System.out.println("\n??? : Excuse moi je n'ai pas regardé devant moi, je ne t'ai pas fais mal j'espère ?");
        saisir_next();
        System.out.print("""

                ??? : Je ne me souviens pas t'avoir déjà vu, tu viens d'arriver j'imagine.
                ??? : Dis moi comment tu t'appelles?
                -->""");
        Dresseur joueur;
        while(true) {
            String rep_sc = sc.nextLine();
            System.out.print("\n??? : Tu t'appelles bien " + rep_sc + " ? (y/n)" + "\n-->");
            if(yes_no()) {
                System.out.println("\n??? :C'est un joli nom ! Oui je dis ça même si ton nom est claqué..." + hashtag);
                ArrayList<Pokemon> equipe = new ArrayList<>();
                ArrayList<Objet> sac = new ArrayList<>();
                joueur = new Dresseur(rep_sc,equipe,sac,1000, map);
                break;
            } else {
                System.out.print("""

                        ??? : Euuuhh tu n'es pas sûr de ton nom ..? Allez fais un effort...
                        -->""");
            }
        }
        saisir_next();
        System.out.println(hashtag + "\n??? : Bon je ne me suis toujours pas présenté !");
        saisir_next();
        System.out.println("""

                Prof UwU : Je suis le professeur UwU, je passe tout mon temps à étudier les pokémons.
                Prof UwU : D'ailleurs si tu as des questions sur tes pokémons n'hésite pas à venir me voir !""");
        saisir_next();
        System.out.println("""

                Prof UwU : Comment ça tu n'as pas de pokémon ? Voilà une nouvelle bien triste.
                Prof UwU : Il se trouve que j'ai avec moi 3 pokémons qui souhaitent rencontrer un dresseur.""");
        saisir_next();
        System.out.println("\nProf UwU : Je pense que t'en confier un est une bonne idée." + hashtag);
        saisir_next();
        return joueur;
    }

    public void regles() {
        System.out.println(triple_hashtag +
                "\nJe te souhaite la bienvenue dans ce merveilleux monde !" +
                "\nOui je te dis ça comme si tu venais de naître alors que tu as sûrement plus de 9 ans..." +
                "\nTu vas avoir la chance de te faire de nombreux amis que l'on appelle Pokémon !" +
                "\nEn réalité tu vas juste les séquestrer et les faire combattre pour de l'argent et de la gloire..." +
                triple_hashtag +
                "\n" +
                triple_hashtag +
                "\nBon laisse moi t'expliquer les règles de ce jeu :" +
                "\n" +
                "\n - Tu pourras constituer une équipe de 6 pokémons maximum, les autres seront stockés dans un pc." +
                "\n - Les pokémons gagnent des points d'expériences ce qui leur permet de monter en niveau et pour certains d'évoluer." +
                "\n - Le niveau maximal des pokémons est 15." +
                "\n - Chaque pokémon et attaque possède un ou 2 types, cela influe sur les dégâts." +
                "\n" +
                "\n - Ensuite tu pourras explorer une carte où tu rencontreras différents types de zone :" +
                "\n     ¤ Zone de combat : ici tu rencontreras des dresseurs prêts à te racketter... Euh à te combattre avec leurs pokémons !" +
                "\n     ¤ Zone de chasse : ici tu rencontreras des pokémons que tu pourras combattre ou capturer." +
                "\n     ¤ Zone de loot : ici tu pourras récupérer un objet aléatoire." +
                "\n - Tu pourras te déplacer dans les 4 directions pour arriver dans une nouvelle zone." +
                "\n - En plus des 4 zones, tu pourras aller dans 2 lieux particuliers :" +
                "\n     ¤ Le centre pokémon : ici tu pourras soigner l'ensemble de ton équipe et accéder à ton pc." +
                "\n     ¤ La boutique : ici tu pourras faire le plein d'objets contre de l'argent ou vendre les tiens." +
                "\n" +
                "\nVoilà tout ce dont tu as besoin de savoir pour le mode solo." +
                "\nQuand ton équipe sera assez forte, tu pourras jouer en multioueur contre un autre joueur." +
                "\nMais il est maintenant temps de commencer ton aventure !" +
                triple_hashtag);
        saisir_next();
    }

    public void choix_starter(Dresseur dresseur) {
        System.out.print(hashtag +
                "\nProf UwU : Voilà les 3 pokémons dont je t'ai parlé :\n" +
                "\n - [1] -- Tortipouss --- [PLANTE]" +
                "\n - [2] -- Ouisticram --- [FEU]" +
                "\n - [3] -- Tiplouf    --- [EAU]" +
                "\n\nProf UwU : Lequel veux-tu choisir ?\n");
        while(true) {
            int choix = entree_user();
            if((choix > 0) && (choix < 4)) {
                System.out.print("""

                        Prof UwU : Tu en sûr ? (y/n)
                        -->\s""");
                if(yes_no()) {
                    dresseur.EQUIPE.add(new Pokemon().generate_starter(choix));
                    System.out.println("\n" + dresseur.EQUIPE.get(0).getNom_pokemon() + " rejoint ton équipe !");
                    break;
                } else {
                    System.out.println("\nProf UwU : Lequel veux-tu choisir dans ce cas ?\n");
                }
            }
        }
        saisir_next();
        System.out.println("""

                Prof UwU : Oh je crois qu'il t'aime déjà !
                Prof UwU : Je compte sur toi pour prendre soin de lui.""");
        saisir_next();
        System.out.println("\nProf UwU : Bon je dois m'eclipser à présent, ce fut un plaisir." +
                "\nProf UwU : A une prochaine fois je l'espère !" + hashtag);
        saisir_next();
    }
}
