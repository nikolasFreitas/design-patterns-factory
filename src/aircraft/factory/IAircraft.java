package aircraft.factory;

public interface IAircraft {
	public void fly();
	public void takeOff();
	public void approach();
	public void finalApproach();
	public void land();
	public void afterLand();
}
