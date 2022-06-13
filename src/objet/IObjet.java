package objet;

import dresseur.Dresseur;
import pokemon.Pokemon;

interface IObjet {

    /**
     * Permet au joueur d'utiliser un rappel sur un pokémon de son équipe.
     * @param pokemon Pokémon cible.
     * @param dresseur Dresseur qui utilise l'objet.
     */
    void revive_rappel(Pokemon pokemon, Dresseur dresseur);

    /**
     * Permet au joueur d'utiliser un max rappel sur un pokémon de son équipe.
     * @param pokemon Pokémon cible.
     * @param dresseur Dresseur qui utilise l'objet.
     */
    void revive_max_rappel(Pokemon pokemon, Dresseur dresseur);

    /**
     * Permet au joueur de soigner le status d'un pokémon de son équipe.
     * @param pokemon Pokémon cible.
     * @param dresseur Dresseur qui utilise l'objet.
     */
    void anti_status(Pokemon pokemon, Dresseur dresseur);

    /**
     * Permet au joueur d'utiliser un objet de soin sur un pokémon de son équipe.
     * @param pokemon Pokémon cible.
     * @param dresseur Dresseur qui utilise l'objet.
     * @param potion Type de potion utilisé.
     */
    void soin(Pokemon pokemon, Dresseur dresseur, Objet potion);
}
