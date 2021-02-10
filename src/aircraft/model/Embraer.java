package aircraft.model;

import aircraft.factory.Aircraft;
import aircraft.factory.IAvaiableModels;
import aircraft.parts.gear.WheelFactory;
import aircraft.parts.wings.WingFactory;

public class Embraer implements IAvaiableModels {
	public Aircraft getHeavyModel() {
		return new Aircraft(WheelFactory.getHeavyGears(),  WingFactory.getHeavyWings());
	}
	
	public Aircraft getMediumModel() {
		return new Aircraft(WheelFactory.getLightGears(),  WingFactory.getHeavyWings());
	}
	
	public Aircraft getSmallModel() {
		return new Aircraft(WheelFactory.getLightGears(),  WingFactory.getHeavyWings());
	}
}
