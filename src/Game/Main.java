package Game;

import static Game.Utilisateur.sc;

import Map.Map;
import dresseur.Dresseur;

public class Main {

	public static void main(String[] args){
		Map map = new Map();
		//System.out.println(map.toFloat());
		
		Utilisateur user = new Utilisateur();
        user.bienvenue();
        user.regles();
        Dresseur dresseur = user.saisie_nom_joueur(map);
        user.choix_starter(dresseur);
		
		do {
			System.out.println(dresseur.showMap());
			dresseur.bouger();
		}while(true);
		
		
	}

}
