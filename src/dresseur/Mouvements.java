package dresseur;

public enum Mouvements {
	UP("z","monter") {

		@Override
		int[] execute(int x, int y, int tailleX, int tailleY) {
			return x - 1 >= 0 ? new int[] {x-1,y} : new int[] {x,y};
		}

	},
	DOWN("s","descendre") {

		@Override
		int[] execute(int x, int y, int tailleX, int tailleY) {
			return x + 1 < tailleX ? new int[] {x+1,y} : new int[] {x,y};
		}
		
	},
	LEFT("q", "aller a gauche") {

		@Override
		int[] execute(int x, int y, int tailleX, int tailleY) {
			return y - 1 >= 0 ? new int[] {x,y-1} : new int[] {x,y};
		}
		
	},
	RIGHT("d", "aller a droite") {

		@Override
		int[] execute(int x, int y, int tailleX, int tailleY) {
			return y + 1 < tailleY ? new int[] {x,y+1} : new int[] {x,y};
		}
		
	};
	
	private final String action;
	private final String message;
	Mouvements(String action, String message) {
		this.action = action;
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "["+this.action+"] Appuyer pour "+this.message;
	}
	
	abstract int[] execute(int x, int y, int tailleX, int tailleY);	
	
}