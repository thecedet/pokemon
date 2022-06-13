package dresseur;

import Map.CellDatas;
import objet.Objet;
import pokemon.Pokemon;

interface IDresseur {

    /**
     * Permet de tenter de capturer un pokémon sauvage.
     * La réussite de la capture dépend du taux de capture de la ball, du pokémon et du nombre d'HP restant de ce dernier.
     * Un nombre entre 0 et 255 est généré aléatoirement, si ce nombre est plus petit que le seuil total alors le pokémon est capturé.
     * En cas de réussite, si le joueur possède déjà 6 pokémons dans son équipe, le pokémon est envoyé sur le PC du joueur.
     * Dans tous les cas si la méthode est utilisée, la ball correspondante est consommée donc supprimée du sac.
     * Si le joueur n'a pas de ball, il en sera informé.
     * @param pokemon Pokémon sauvage.
     * @param ball Type de ball.
     */
    boolean capturePokemon(Pokemon pokemon, Objet ball);

    /**
     * Permet de générer un dresseur bot possédant uniquement des pokémons faibles.
     * Le dresseur possède 3 tiers qui détermine le nombre de pokémons que possèdera le dresseur bot (entre 1 et 2, 3 et 4 ou 5 et 6).
     * Ce tier est déterminé par l'index de la map sur lequel le joueur tombe.
     * @param index_map Type de Cell qui détermine le nombre de pokémons du dresseur.
     * @return Un dresseur bot qui possède un nombre x de pokémons faibles
     */
    Dresseur generate_dresseur_faible(CellDatas cell);

    /**
     * Permet de générer un dresseur bot possédant uniquement des pokémons moyens.
     * Le dresseur possède 3 tiers qui détermine le nombre de pokémons que possèdera le dresseur bot (entre 1 et 2, 3 et 4 ou 5 et 6).
     * Ce tier est déterminé par l'index de la map sur lequel le joueur tombe.
     * @param index_map Type de Cell qui détermine le nombre de pokémons du dresseur.
     * @return Un dresseur bot qui possède un nombre x de pokémons moyens
     */
    Dresseur generate_dresseur_moyen(CellDatas cell);

    /**
     * Permet de générer un dresseur bot possédant uniquement des pokémons forts.
     * Le dresseur possède 3 tiers qui détermine le nombre de pokémons que possèdera le dresseur bot (entre 1 et 2, 3 et 4 ou 5 et 6).
     * Ce tier est déterminé par l'index de la map sur lequel le joueur tombe.
     * @param index_map Type de Cell qui détermine le nombre de pokémons du dresseur.
     * @return Un dresseur bot qui possède un nombre x de pokémons forts
     */
    Dresseur generate_dresseur_fort(CellDatas cell);

    /**
     * Permet d'ouvrir le menu du joueur.
     * Depuis ce menu il peut accéder à son équipe de pokémon(s) et à son sac.
     * Il pourra aussi arrêter le jeu depuis ce menu.
     */
    void menu_dresseur();

    /**
     * Permet d'ouvrir le menu de l'équipe de pokémons du joueur.
     * Depuis ce menu il peut échanger la position de ses pokémons, inspecter ses pokémons et leurs attaques.
     */
    void menu_equipe();

    /**
     * Permet d'échanger la position de 2 pokémons dans l'équipe du joueur.
     * @param p1 Pokémon 1.
     * @param p2 Pokémon 2.
     */
    void switch_membre(int p1,int p2);

    /**
     * Permet d'ouvrir le menu du sac du joueur.
     * Depuis ce menu il peut utiliser tous les objets qu'il possède hormis les objets de capture, si les conditions sont respéctées.
     */
    void menu_sac();

    /**
     * Le dresseur trouve un objet aléatoire qui est ajouté dans son sac.
     */
    void objet_trouve();

    /**
     * Permet de vérifier si tous les pokémons d'une équipe sont KO.
     * @return True si tous les pokémons du dresseur sont KO, false sinon.
     */
    boolean teamKO();

    /**
     * Alternative à la méthode menu_equipe pour le combat pour ne pas se retrouver dans le menu dresseur.
     * @return True si le joueur a interverti de place 2 pokémons pour passer le tour, false sinon.
     */
    boolean menu_equipe_combat();

    /**
     * Alternative à la méthode menu_sac pour le combat contre pokémon sauvage.
     * Permet d'utiliser tous les objets cette fois y compris les balls.
     * @param sauvage Pokémon sauvage (utile si tentative de capture).
     * @return 1 si un objet a été utilisé, 2 si le pokémon a été capturé.
     */
    int menu_sac_combat_sauvage(Pokemon sauvage);

    /**
     * Force le joueur à prendre un pokémon non KO de son équipe quand son pokémon sur le terrain
     * est mis KO.
     * @param ko Pokémon KO.
     */
    void switch_membre_force(Pokemon ko);

    /**
     * Renvoie le joueur au centre pokémon s'il perd un combat.
     * Il perd aussi un dixième de son argent.
     */
    public void lose();

    /**
     * Permet d'engager un combat contre un pokémon sauvage.
     * La difficulté du pokémon dépend de où se situe le joueur sur la map.
     * Le combat se termine si le joueur bat le pokémon sauvage, le capture, prend la fuite
     * ou si toute son équipe est mise KO.
     * @param sauvage Pokémon sauvage qui apparaît.
     */
    void combat_pokemon_sauvage(Pokemon sauvage);

    /**
     * Alternative à la méthode menu_sac pour le combat contre dresseur bot.
     * Depuis ce menu il peut utiliser tous les objets qu'il possède hormis les objets de capture, si les conditions sont respéctées.
     * @return True si le tour doit être passé.
     */
    boolean menu_sac_combat_dresseur();

    /**
     * Permet d'engager un combat contre un dresseur bot.
     * La difficulté du dresseur dépend de où se situe le joueur sur la map.
     * Le combat se termine si le joueur bat tous les pokémons du dresseur adverse
     * ou si toute son équipe est mise KO.
     * @param adversaire Dresseur bot adversaire.
     */
    void combat_dresseur_bot(Dresseur adversaire);

}
