package Error;

public class ImpossibleMove extends Exception {

	private static final long serialVersionUID = 1L;
	public ImpossibleMove(String message) {
		super(message);
	}
	public ImpossibleMove() {
		super("Impossible d'aller sur cette case :(");
	}
	
	
	

}
