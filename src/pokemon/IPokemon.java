package pokemon;

import dresseur.Dresseur;

interface IPokemon {

    /**
     * Permet d'afficher les informations relatives à un pokémon.
     * @return La carte d'identité du pokémon avec ses données actuelles (ex : HP restants).
     */
    String fiche_detail_pokemon();

    /**
     * Permet de faire évoluer un pokémon.
     * Le pokémon obtient le nom, le(s) type(s) et le cas échéant l'évolution et le niveau d'évolution
     * de son évolution.
     */
    void evolution();

    /**
     * Permet au pokémon de lancer une attaque visant à infliger des dégâts.
     * L'impact de l'attaque dépend de son type et celui du pokémon receveur.
     * @param attack Attaque choisie.
     * @param receveur Pokémon cible.
     * @return True si l'attaque aboutit, false sinon.
     */
    boolean attaque_dmg(Attaque attack, Pokemon receveur);

    /**
     * Permet au pokémon de lancer une attaque visant à infliger un status.
     * Le pokémon receveur reçoit à coup sûr le status.
     * @param attack Attaque choisie.
     * @param receveur Pokémon cible.
     * @return True si l'attaque aboutit, false sinon.
     */
    boolean attaque_status(Attaque attack, Pokemon receveur);

    /**
     * Permet au pokémon de gagner de l'expérience lorsqu'il met un pokémon KO.
     * Arrivé au niveau 15, le pokémon ne gagne pu d'expérience.
     * @param receveur Pokémon cible.
     */
    void gain_exp(Pokemon receveur);

    /**
     * Permet au pokémon de gagner un niveau quand il possède suffisamment d'expérience.
     * Le pokémon ne peut pas monter au-dessus du niveau 15.
     * Si le pokémon atteint son niveau d'évolution alors il évolue.
     * Lorsque le pokémon monte un niveau, il peut parfois apprendre une attaque.
     */
    void level_up();

    /**
     * Permet de savoir si le pokémon est KO ou non.
     * @return True si le pokémon est KO, False sinon.
     */
    boolean isKO();

    /**
     * Permet de savoir si le pokémon est brûlé ou empoisonné.
     * @return True si le pokémon possède le status brule ou poison.
     */
    boolean isStatus();

    /**
     * Permet au pokémon d'apprendre une attaque quand il atteint certains niveaux.
     * Si le pokémon possède moins de 4 attaques, alors il apprend l'attaque.
     * Sinon il doit oublier une de ses 4 attaques pour apprendre la nouvelle.
     */
    void apprendre_attaque();

    /**
     * Permet de générer le pokémon starter choisi par le joueur au début de la partie via le paramètre i.
     * @param i Décide de quel Pokémon sera donné au joueur au début du jeu.
     * @return Le pokémon starter que le joueur choisit.
     */
    Pokemon generate_starter(int i);

    /**
     * Permet de générer un pokémon faible aléatoire.
     * @return Un pokémon faible aléatoire.
     */
    Pokemon generate_pokemon_faible();

    /**
     * Permet de générer un pokémon moyen aléatoire.
     * @return Un pokémon moyen aléatoire.
     */
    Pokemon generate_pokemon_moyen();

    /**
     * Permet de générer un pokémon fort aléatoire.
     * @return Un pokémon fort aléatoire.
     */
    Pokemon generate_pokemon_fort();

    /**
     * Permet de générer un pokémon légendaire aléatoire.
     * @return Un pokémon légendaire aléatoire.
     */
    Pokemon generate_pokemon_legendaire();

    /**
     * Informe que le pokémon ennemi est KO et permet de gagner l'exp et de monter en niveau.
     * @param sauvage Pokémon ennemi KO.
     */
    void sauvageKO(Pokemon sauvage);

    /**
     * Informe que le pokémon ennemi est KO et permet de gagner l'exp et de monter en niveau.
     * Si l'adversaire a encore des pokémons, il prend le prochain dans son équipe.
     * @param ennemi Pokémon ennemi KO.
     * @param adversaire Dresseur adversaire.
     */
    Pokemon ennemiKO(Pokemon ennemi, Dresseur adversaire);

    /**
     * Si le pokémon possède le status gel, para ou endormi, il a une chance sur 2 de réussir son attaque.
     * @return True si le pokémon peut attaquer, false sinon.
     */
    boolean valid_attack();

    /**
     * Permet de choisir le type d'attque que lance le pokémon en fonction des dégâts de l'attaque.
     * @param cible Pokémon ciblé par l'attaque.
     * @param choix Rang dans la liste d'attaques pour le choix d'attaque.
     * @return True si l'attaque n'a plus de PP, true sinon.
     */
    boolean use_attack(Pokemon cible, int choix);

    /**
     * Affiche à chaque tour les 2 pokémons en combat avec leur nom, leur vie et leur level.
     * @param cible Pokémon adversaire durant le combat.
     */
    void ecran_combat(Pokemon cible);
}
