package aircraft.parts.gear;

// Product of factory
public class HeavyGear implements ILandingGear{
	private boolean retracted;
	int wheels = 8;
	@Override
	public void retractGear() {
		for (int i = 0; i < wheels; i++) {
			if (i == 0) {
				System.out.println("Retracting the front wheel...");		
			} else {
				System.out.println("Retracting the main wheel("+ i +")...");
			}
		}
		retracted = true;
	}

	@Override
	public void extendGear() {
		for (int i = 0; i < wheels; i++) {
			if (i == 0) {
				System.out.println("Extending the front wheel...");
			} else {
				System.out.println("Extending the main wheel("+ i +")...");
			}
		}
		retracted = false;
	}

	@Override
	public boolean isGearRetracted() {
		return retracted;
	}

}
