package aircraft.parts.gear;

// Factory
public class WheelFactory {
	
	public static ILandingGear getHeavyGears() {
		return new HeavyGear();
	}
	
	public static ILandingGear getLightGears() {
		return new LighGear();
	}
}
