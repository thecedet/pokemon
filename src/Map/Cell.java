package Map;

import java.util.ArrayList;
import java.util.List;

import dresseur.Dresseur;
import pokemon.Pokemon;

public class Cell {

	private final int x;
	private final int y;
	
	private List<Dresseur> players = new ArrayList<Dresseur>();
	private boolean object = false;
	private String bot = null;
	private Pokemon pokemon;
	
	protected CellDatas celldatas;
	protected boolean obstacable = false;
	protected boolean override = true;
	
	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Cell(int x, int y, CellDatas cellDatas) {
		this.x = x;
		this.y = y;
		this.celldatas = cellDatas;
	}

	public void addObject() {
		this.object = true;
	}
	public void removeObject() {
		this.object = false;
	}
	public boolean hasObject() {
		return this.object; 
	}
	
	public void addBot() {
		this.bot = "non";
	}
	public void removeBot() {
		this.bot = null;
	}
	public boolean hasBot() {
		return this.bot != null;
	}
	
	public void addPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	public void removePokemon() {
		this.pokemon = null;
	}
	public boolean hasPokemon() {
		return this.pokemon != null;
	}
	
	public boolean hasPlayer() {
		return this.players.size() != 0;
	}
	
	public int[] getCoord() {
		return new int[] {this.x, this.y};
	}
		
	public void addPlayer(Dresseur player) {
		this.players.add(player);
	}
	
	public boolean removePlayer(Dresseur player) {
		return true;
	}
	
	public boolean getObstacable() {
		return this.obstacable;
	}
	public boolean getOverride() {
		return this.override;
	}
	
	@Override
	public String toString() {
		return celldatas.getRepresent();
	}
	
	public float toFloat() {
		return celldatas.getValue();
	}
	
	public void on(Dresseur player) {
		if(this.hasPokemon()) {
			player.combat_pokemon_sauvage(this.pokemon);
			this.removePokemon();
		}else if(this.hasBot()) {
			System.out.println("un pas sympa...");
			//player.combat_dresseur_bot(this.bot);
			this.removeBot();
		}else if(this.hasObject()) {
			System.out.println("Vous avez trouvé un objet");
			player.objet_trouve();
			this.removeObject();
		}
	}
	
	public Difficulty getDifficulty() {
		if(this.celldatas == CellDatas.EasyT1 || this.celldatas == CellDatas.EasyT2 || this.celldatas == CellDatas.EasyT3) {
			return Difficulty.EASY;
		}else if(this.celldatas == CellDatas.MediumT1 || this.celldatas == CellDatas.MediumT2 || this.celldatas == CellDatas.MediumT3) {
			return Difficulty.MEDIUM;
		}else if(this.celldatas == CellDatas.HardT3){
			return Difficulty.LEGENDARY;
		}else {
			return Difficulty.HARD;
		}
	}


	
}


