package Map;

import Game.Utilisateur;
import dresseur.Dresseur;
import lieu.Centre_Pokemon;

public class HospitalCell extends Cell {

	public HospitalCell(int x, int y) {
		super(x,y);
		this.override = false;
		this.celldatas = CellDatas.Hospital;
	}
	
	@Override
	public void on(Dresseur player) {
		System.out.println("Voulez vous rentrer dans le centre prokemon ? (Y/n)");
		if(!Utilisateur.sc.nextLine().equalsIgnoreCase("n")) {
			new Centre_Pokemon().menu_cp(player);
		}
	}
	
}