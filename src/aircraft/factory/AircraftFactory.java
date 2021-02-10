package aircraft.factory;

import aircraft.model.Boeing;
import aircraft.model.Embraer;

public class AircraftFactory {
	public static IAvaiableModels getEmbraer() {
		return new Embraer();
	}
	
	public static IAvaiableModels getBoeing() {
		return new Boeing();
	}
}
