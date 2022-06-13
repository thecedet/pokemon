package objet;

import dresseur.Dresseur;
import pokemon.Pokemon;

public enum Objet implements IObjet{

    ANTI_BRULE("Anti brule",500,"brule"),
    ANTI_GEL("Anti gel",500,"gel"),
    ANTI_PARA("Anti para",500,"para"),
    ANTIDOTE("Antidote",500,"poison"),
    REVEIL("Reveil",500,"endormi"),
    RAPPEL("Rappel",1000),
    MAX_RAPPEL("Max Rappel",2500),
    POTION("Potion",100,20),
    SUPER_POTION("Super potion",250,50),
    HYPER_POTION("Hyper potion",1000,200),
    POKEBALL("Pokeball",200,25),
    SUPERBALL("Superball",500,50),
    HYPERBALL("Hyperball",1000,75);

    public final String NOM_OBJET;
    public final int PRIX;
    private int parametre;
    private String status;

    Objet(String nom_objet, int prix) {
        this.NOM_OBJET = nom_objet;
        this.PRIX = prix;
    }

    Objet(String nom_objet, int prix, String status) {
        this.NOM_OBJET = nom_objet;
        this.PRIX = prix;
        this.status = status;
    }

    Objet(String nom_objet, int prix, int parametre) {
        this.NOM_OBJET = nom_objet;
        this.PRIX = prix;
        this.parametre = parametre;
    }

    public int getParametre() {
        return parametre;
    }

    public String toString() {
        return NOM_OBJET;
    }

    public void revive_rappel(Pokemon pokemon, Dresseur dresseur) {
        if(pokemon.getStatus().equals("KO")) {
            pokemon.setStatus("aucun");
            pokemon.setHp(pokemon.getHp_tot()/2);
            dresseur.SAC.remove(RAPPEL);
            System.out.println("\nVotre pokémon n'st plus KO et a récupéré la moitié de ses hp !");
        } else {
            System.out.println("\nVous ne pouvez pas utiliser cet objet maintenant.");
        }
    }

    public void revive_max_rappel(Pokemon pokemon, Dresseur dresseur) {
        if(pokemon.getStatus().equals("KO")) {
            pokemon.setStatus("aucun");
            pokemon.setHp(pokemon.getHp_tot());
            dresseur.SAC.remove(this);
            System.out.println("\nVotre pokémon n'est plus KO et a récupéré la totalité de ses hp !");
        } else {
            System.out.println("\nVous ne pouvez pas utiliser cet objet maintenant.");
        }
    }

    public void anti_status(Pokemon pokemon, Dresseur dresseur) {
        if(pokemon.getStatus().equals(status)) {
            pokemon.setStatus("aucun");
            dresseur.SAC.remove(this);
            System.out.println("\nVotre pokémon n'est plus " + status + " !");
        } else {
            System.out.println("\nVous ne pouvez pas utiliser cet objet maintenant.");
        }
    }

    public void soin(Pokemon pokemon, Dresseur dresseur, Objet potion) {
        if(((pokemon.getHp_tot() - pokemon.getHp()) > potion.getParametre()) && (!pokemon.getStatus().equals("KO"))) {
            pokemon.setHp(pokemon.getHp() + potion.getParametre());
            dresseur.SAC.remove(potion);
            System.out.println("Votre pokémon récupère " + potion.getParametre() + "HP !");
        } else if((pokemon.getHp() != pokemon.getHp_tot()) && (!pokemon.getStatus().equals("KO"))) {
            pokemon.setHp(pokemon.getHp_tot());
            dresseur.SAC.remove(potion);
            System.out.println("Votre pokémon récupère " + (pokemon.getHp_tot() - pokemon.getHp()) + "HP !");
        } else {
            System.out.println("\nVous ne pouvez pas utiliser cet objet maintenant.");
        }
    }

}
