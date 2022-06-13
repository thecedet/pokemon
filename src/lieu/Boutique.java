package lieu;

import java.util.ArrayList;

import dresseur.Dresseur;
import objet.Objet;

import static Game.Utilisateur.*;


public class Boutique implements IBoutique {

    public void menu_boutique(Dresseur dresseur) {

        System.out.println(hashtag + "\nBienvenue dans la boutique pokémon !\nQue souhaitez-vous faire ?\n\n[1] -- Acheter\n[2] -- Vendre" + fermer + hashtag);
        int choix = entree_user();
        switch(choix) {
            case 1 :
                achat_objet(dresseur);
                break;
            case 2 :
                vente_objet(dresseur);
                break;
            case 0 :
                break;
            default :
                System.out.println(saisi_nombre);
                menu_boutique(dresseur);
                break;
        }
    }

    public void achat_objet(Dresseur dresseur) {
        StringBuilder liste_objet = new StringBuilder(hashtag + "\nQue souhaitez-vous acheter ?\n");
        int index = 0;
        for(Objet objet : Objet.values()) {
            index++;
            liste_objet.append("\n[").append(index).append("] -- ").append(objet);
        }
        liste_objet.append(fermer + hashtag);
        System.out.println(liste_objet);
        int choix = entree_user();
        if((choix > 0) && (choix < 14)) {
            System.out.println(hashtag + "\nQuelle quantité ?");
            int quantite = entree_user();
            if(quantite == 0) {
                System.out.println(comique);
                achat_objet(dresseur);
            } else {
                Objet ajout = Objet.values()[choix-1];
                int cout = ajout.PRIX * quantite;
                System.out.println("\nLe tout vous coûtera " + cout + "\nValidez-vous l'achat ? (y/n)");
                if((yes_no()) && (dresseur.getArgent() >= cout)) {
                    for(int i = 0; i < quantite; i++) {
                        dresseur.SAC.add(ajout);
                    }
                    dresseur.setArgent(dresseur.getArgent() - cout);
                    System.out.println("\nMerci pour votre achat ! Au revoir et à bientôt !" + hashtag);
                    menu_boutique(dresseur);
                } else if((yes_no()) && (dresseur.getArgent() < cout)) {
                    System.out.println("\nMince vous n'avez pas assez d'argent, vous devriez acheter moins.");
                    achat_objet(dresseur);
                } else {
                    System.out.println("\nOn annule alors ! Vous souhaitez autre chose peut-être ?");
                    achat_objet(dresseur);
                }
            }

        } else if(choix == 0) {
            menu_boutique(dresseur);
        } else {
            System.out.println(saisi_nombre);
            achat_objet(dresseur);
        }
    }

    public void vente_objet(Dresseur dresseur) {
        StringBuilder sac = new StringBuilder(hashtag + "\nQue souhaitez-vous vendre ?\n");
        int index = 0;
        ArrayList<Integer> liste_index = new ArrayList<>();
        ArrayList<Integer> liste_nbr_objet = new ArrayList<>();
        for(Objet objet : Objet.values()) {
            index++;
            int nbr_objet = 0;
            for(int i = 0; i < dresseur.SAC.size(); i++) {
                if(dresseur.SAC.get(i) == objet) {
                    nbr_objet++;
                }
            }
            if(nbr_objet > 0) {
                sac.append("\n[").append(index).append("] -- ").append(objet).append(" x ").append(nbr_objet);
                liste_index.add(index);
            }
            liste_nbr_objet.add(nbr_objet);
        }
        sac.append(fermer + hashtag);
        System.out.println(sac);
        int choix = entree_user();
        if(liste_index.contains(choix)) {
            System.out.println(hashtag + "\nQuelle quantité ?");
            int quantite = entree_user();
            if((quantite == 0) || (quantite > liste_nbr_objet.get(choix - 1))) {
                System.out.println(comique);
                vente_objet(dresseur);
            } else {
                int gain = quantite * Objet.values()[choix - 1].PRIX;
                System.out.println("\nLe tout vous donnera " + gain + "\nValidez-vous la vente ? (y/n)");
                if(yes_no()) {
                    for(int i = 0; i < quantite; i++) {
                        dresseur.SAC.remove(Objet.values()[choix - 1]);
                    }
                    dresseur.setArgent(dresseur.getArgent() + gain);
                    System.out.println("\nMerci pour vos ventes ! Au revoir et à bientôt !" + hashtag);
                    menu_boutique(dresseur);
                } else {
                    System.out.println("\nOn annule alors ! Vous souhaitez autre chose peut-être ?");
                    vente_objet(dresseur);
                }
            }
        } else if(choix == 0) {
            menu_boutique(dresseur);
        } else {
            System.out.println(saisi_nombre);
            vente_objet(dresseur);
        }
    }

}
