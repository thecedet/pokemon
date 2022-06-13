package lieu;

import dresseur.Dresseur;

interface IBoutique {

    /**
     * Permet d'ouvrir le menu de la boutique.
     * Le joueur peut choisir entre acheter et/ou vendre des objets.
     * @param dresseur Joueur.
     */
    void menu_boutique(Dresseur dresseur);

    /**
     * Permet d'ouvrir le menu d'achat.
     * Le joueur peut choisir parmi les 13 objets disponibles et en quelle quantité il souhaite d'exemplaire(s).
     * @param dresseur Joueur.
     */
    void achat_objet(Dresseur dresseur);

    /**
     * Permet d'ouvrir le menu de vente.
     * Le joueur peut vendre les objets qu'il possède dans son sac.
     * @param dresseur Joueur.
     */
    void vente_objet(Dresseur dresseur);

}
