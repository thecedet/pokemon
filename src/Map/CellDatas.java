package Map;

public enum CellDatas {
	HardT3(6.3f),
	HardT2(6.2f),
	HardT1(6.1f),
	MediumT3(5.3f), 
	MediumT2(5.2f), 
	MediumT1(5.1f),
	EasyT3(4.3f), 
	EasyT2(4.2f), 
	EasyT1(4.1f), 
	Hospital(0, "H"), 
	Shop(1, "B"), 
	Spawn(3, "S"), 
	Obstacle(7, "X");

	private final float value;
	private final String represent;

	private final String representTemplate = "[ ]";
	
	CellDatas(float value, String represent) {
		this.value = value;
		this.represent = this.representTemplate.replace(" ", represent);
	}
	
	CellDatas(float value) {
		this.value = value;
		this.represent = this.representTemplate;
	}

	public float getValue() {
		return this.value;
	}
	public String getRepresent() {
		return this.represent;
	}
	
}
