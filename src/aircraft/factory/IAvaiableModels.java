package aircraft.factory;

import aircraft.parts.wings.WingFactory;

public interface IAvaiableModels {
	public Aircraft getHeavyModel();
	
	public Aircraft getMediumModel();
	
	public Aircraft getSmallModel();
}
