package Map;


import java.util.Random;
import java.util.Timer;

import Error.ImpossibleMove;
import dresseur.Dresseur;

public class Map {

	private Cell[][] matrice;
	private SpawnCell[] spawns;
	private final int tailleX;
	private final int tailleY;
	
	public Map() {
		this.tailleX = this.tailleY = 20;
	
		this.matrice = new Cell[this.tailleX][this.tailleY];
		this.spawns = new SpawnCell[2];
		
		int nbrObstacle = 20;
		int nbrZone = 3;
		int nbrSubZone = 3;
		

		this.generate(nbrObstacle, nbrZone, nbrSubZone);
		
		Event event = new Event(this, 50,20,75);
		new Timer().schedule(event, 0,	10*60*1000); // 10min
	}
	
	public Cell[][] getMap() {
		return this.matrice;
	}
	
	private void generate(int nbrObstacle, int nbrZone, int nbrSubZone) {

		for(int z=0; z < nbrSubZone*nbrZone; z+=nbrSubZone) {
			for(int j=0; j < 3; j++) {
				for(int i=0; i < this.tailleX; i++) {
					this.matrice[j+z][i] = new Cell(j+z,i, CellDatas.values()[j+z]);
					this.matrice[i][j+z] = new Cell(i,j+z, CellDatas.values()[j+z]);
					this.matrice[i][this.tailleY-1-j-z] = new Cell(i,this.tailleY-1-j-z, CellDatas.values()[j+z]);
					this.matrice[this.tailleX-1-j-z][i] = new Cell(this.tailleX-1-j-z,i, CellDatas.values()[j+z]);
				}
			}
		}
		
		this.matrice[9][9] = new HospitalCell(9,9);
		this.matrice[9][10] = new ShopCell(9,10);
		this.setSpawn(10, 9);
		this.setSpawn(10, 10);

		this.setRandObstacle(nbrObstacle);
	}
	
	private void setRandObstacle(int nbrObstacle) {
		for(int i=0; i <= nbrObstacle; i++) {
			int randX = new Random().nextInt(this.tailleX);
			int randY = new Random().nextInt(this.tailleY);
			if(this.matrice[randX][randY].getOverride()) {
				int[] coord = this.matrice[randX][randY].getCoord();
				this.matrice[randX][randY] = new ObstacleCell(coord[0], coord[1]);
			}else i--;
		}
	}
	
	private void setSpawn(int x, int y) {
		for(int i=0; i < this.spawns.length; i++) {
			if(this.spawns[i] == null) {
				SpawnCell spawnCell =  new SpawnCell(x,y);
				this.matrice[x][y] = spawnCell;
				this.spawns[i] = spawnCell;
				break;
			}
		}		
	}
	
	public int[] spawnPlayer(Dresseur player) {
		int randIntSpawn = new Random().nextInt(this.spawns.length);
		SpawnCell randSpawn = this.spawns[randIntSpawn];
		randSpawn.addPlayer(player);
		return randSpawn.getCoord();
	}

	public String show(int x, int y) {
		int size = 2; // map de 5x5
		
		int minX = x - size > 0 ? x-size : x-x;
		int minY = y - size > 0 ? y-size : y-y;
		int maxX = x + size < this.tailleX ? x+size : this.tailleX - size + 1;
		int maxY = y + size < this.tailleY ? y+size : this.tailleY - size + 1;

		String result = "";
		
		for(int i=minX; i <= maxX; i++) {
			for(int j=minY; j <= maxY; j++) {
				
				result += (i == x && j == y ? "(.)" : this.matrice[i][j].toString()) + " ";
			}
			result += "\n";
		}
		return result;
	}
	
	public String toFloat() {
		String result = "";
		for(Cell[] Y : this.matrice) {
			for(Cell X : Y) {
				result += (X == null ? "_" : X.toString()) + " ";
			}
			result += "\n";
		}
		return result;
	}
	
	public int getTailleX() {
		return this.tailleX;
	}
	public int getTailleY() {
		return this.tailleY;
	}

	public Cell getCell(int[] coords) {
		return this.matrice[coords[0]][coords[1]];
	}
	
	public void movePlayer(Dresseur player, int[] coords) throws ImpossibleMove {
		Cell nextCell = this.getCell(coords);
		if(!nextCell.getObstacable()) {
			this.getCell(player.getCoord()).removePlayer(player);
			nextCell.addPlayer(player);
			player.setCoord(coords);
			nextCell.on(player);
		}else {
			throw new ImpossibleMove();
		}
	}
	
	
}
