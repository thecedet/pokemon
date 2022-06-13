package Map;

public class SpawnCell extends Cell {

	public SpawnCell(int x, int y) {
		super(x,y);
		this.override = false;
		this.celldatas = CellDatas.Spawn;
	}
	
}