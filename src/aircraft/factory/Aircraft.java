package aircraft.factory;

import aircraft.parts.gear.ILandingGear;
import aircraft.parts.wings.IWings;

public class Aircraft implements IAircraft {
	private ILandingGear landingGear;
	private IWings wings;
	
	public Aircraft(ILandingGear landingGear, IWings wings) {
		this.landingGear = landingGear;
		this.wings = wings;
	}
	
	@Override
	public void fly() {
		landingGear.retractGear();
		wings.retractFlaps();
	}
	
	@Override
	public void land() {
		System.out.println("Landing...");
	}
	
	@Override
	public void takeOff() {
		System.out.println("\n-- Preparing for taking off --");
		wings.extendsFlaps();
		System.out.println("\n-- Taking off --");
		System.out.println("...ssshhshhshshhhhhhshhHSSHHHHHHHHH VRUUUUUUM!!! (Airplane motor sound)");
	}

	@Override
	public void approach() {
		System.out.println("\n-- Aproaching --");
		wings.extendsFlaps();
	}

	@Override
	public void finalApproach() {
		System.out.println("\n-- Preparing for land --");
		wings.extendsFlaps();
		landingGear.extendGear();
		System.out.println("Ready to landing");
	}

	@Override
	public void afterLand() {
		System.out.println("\n-- After landing --");
		wings.fullRetractFlaps();	
		
		System.out.println("DING DONG (attention)\n"
				+ "(flight attendent voice) - \"Thank you for flying with Java airlines"
				+ " the HAVIEST company in the world."
				+ "\n have a great day\"");
	}
	
}
