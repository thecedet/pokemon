package lieu;

import dresseur.Dresseur;

public interface ICentre_Pokemon {

    /**
     * Permet d'ouvrir le menu du centre pokémon.
     * Le joueur peut choisir entre soigner son équipe et consulter son pc.
     * @param dresseur Joueur.
     */
    void menu_cp(Dresseur dresseur);

    /**
     * Permet de rétablir entièrement l'ensemble des pokémons du joueur.
     * Leur santé et leur(s) attaques récupèrent la totalité de leurs points.
     * Leur status redevient null s'il ne l'était pas.
     * @param dresseur Joueur.
     */
    void soin_totale(Dresseur dresseur);

    /**
     * Permet au joueur de consulter son pc.
     * Le joueur peut échanger les pokémons de son équipe avec ceux de son pc.
     * @param dresseur Joueur.
     */
    void consulter_pc(Dresseur dresseur);
}
