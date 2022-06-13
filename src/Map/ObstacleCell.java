package Map;

public class ObstacleCell extends Cell {

	
	
	public ObstacleCell(int x, int y) {
		super(x,y);
		this.obstacable = true;
		this.celldatas = CellDatas.Obstacle;
		this.override = false;
	}
	
}