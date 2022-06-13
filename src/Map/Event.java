package Map;

import java.util.Random;
import java.util.TimerTask;

import pokemon.Pokemon;

public class Event extends TimerTask{

	private final int nbrObject;
	private final int nbrBot;
	private final int nbrPokemon;
	
	private final Map map;
	
	private final int tailleX;
	private final int tailleY;
	
	private Cell[] objects;
	private Cell[] bots;
	private Cell[] pokemon;
	
	public Event(Map map, int nbrObject, int nbrBot, int nbrPokemon) {
		this.map = map;
		this.nbrObject = nbrObject;
		this.nbrBot = nbrBot;
		this.nbrPokemon = nbrPokemon;
	
		this.tailleX = map.getTailleX();
		this.tailleY = map.getTailleY();
		
		this.objects = new Cell[nbrObject];
		this.bots = new Cell[nbrBot];
		this.pokemon = new Cell[nbrPokemon];
		
	}
		
	private void setElements() {
		for(int i=0; i < this.nbrObject + this.nbrBot + this.nbrPokemon; i++) {
			
			int randX = new Random().nextInt(this.tailleX);
			int randY = new Random().nextInt(this.tailleY);
			
			Cell targetCell = this.map.getMap()[randX][randY];
			
			if(targetCell.getOverride() && !targetCell.hasPlayer() && !targetCell.hasObject() && !targetCell.hasBot()) {
				
				if(i < this.nbrObject) {
					targetCell.addObject();
					this.objects[i] = targetCell;
				}else if(i < this.nbrObject + this.nbrBot) {
					targetCell.addBot();
					this.bots[i - this.nbrObject] = targetCell;
				}else {
					this.addPokemon(targetCell);
					this.pokemon[i - this.nbrObject - this.nbrBot] = targetCell;
				}
				
			}else i--;
		}
	}
	
	private void addPokemon(Cell cell) {
		Pokemon pokemon = switch (cell.getDifficulty()) {
        case EASY -> new Pokemon().generate_pokemon_faible();
        case MEDIUM -> new Pokemon().generate_pokemon_moyen();
        case HARD -> new Pokemon().generate_pokemon_fort();
        case LEGENDARY -> new Pokemon().generate_pokemon_legendaire();
        default -> null;
		};
		cell.addPokemon(pokemon);
	}
	
	private void clear() {
		if(this.objects[0] != null) {
			for(Cell cell : this.objects) {
				cell.removeObject();
			}
		}
		if(this.bots[0] != null) {
			for(Cell cell : this.bots) {
				cell.removeBot();
			}
		}
		if(this.pokemon[0] != null) {
			for(Cell cell : this.pokemon) {
				cell.removePokemon();
			}
		}
	}
	
	@Override
	public void run() {
		this.clear();
		this.setElements();
	}
	
	
}
