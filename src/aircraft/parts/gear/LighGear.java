package aircraft.parts.gear;

public class LighGear implements ILandingGear {
	private boolean retracted;
	int wheels = 3;

	@Override
	public void retractGear() {
		for (int i = 0; i < wheels; i++) {
			if (i == 1) {
				System.out.println("Retracting the front wheel...");		
			} else {
				System.out.println("rectracting the main wheel...");
			}
		}
		retracted = true;
		System.out.println("DONE! \n");
	}

	@Override
	public void extendGear() {
		for (int i = 0; i < wheels; i++) {
			if (i == 1) {
				System.out.println("Extending the front wheel...");		
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				try {
					System.out.println("Extending the main wheel...");
					Thread.sleep(i * 10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		retracted = false;
		System.out.println("DONE! \n");
	}

	@Override
	public boolean isGearRetracted() {
		return retracted;
	}
}
