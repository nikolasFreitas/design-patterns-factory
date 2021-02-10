package aircraft.parts.wings;

public enum EFlapStage {
	FLAT(0), SMALL(1), MEDIUM(2), FULL(3);
	private int value;
	private EFlapStage(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public static EFlapStage getFromValue(int number) {
		for (EFlapStage flapStage : EFlapStage.values()) {
			if (flapStage.value == number) {
				return flapStage;
			}
		}
		
		return null;
	}
}
