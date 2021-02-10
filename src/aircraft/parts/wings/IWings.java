package aircraft.parts.wings;

public interface IWings {
	public int extendsFlaps();
	public int retractFlaps();
	public void fullRetractFlaps();
	public EFlapStage flapStage();
}
