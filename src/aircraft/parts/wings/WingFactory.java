package aircraft.parts.wings;

public class WingFactory {
	public static IWings getHeavyWings() {
		return new BigWing();
	}
	
	public static IWings getSmallWings() {
		return new SmallWing();
	}
}
