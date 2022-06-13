package Map;

import Game.Utilisateur;
import dresseur.Dresseur;
import lieu.Boutique;

public class ShopCell extends Cell {

	public ShopCell(int x, int y) {
		super(x,y);
		this.override = false;
		this.celldatas = CellDatas.Shop;
	}
	
	@Override
	public void on(Dresseur player) {
		System.out.println("Voulez-vous rentrer dans le magazin ? (Y/n): ");
		if(!Utilisateur.sc.nextLine().equalsIgnoreCase("n")) {
			new Boutique().menu_boutique(player);
		}
	}
	
	
}