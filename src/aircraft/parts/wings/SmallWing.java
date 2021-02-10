package aircraft.parts.wings;

import java.util.Arrays;
import java.util.List;

public class SmallWing implements IWings {
	List<Number> flapOneGrade = Arrays.asList(0, 10, 20.5, 30);
	List<Number> flapTwoGrade = Arrays.asList(0, 10, 20.5, 40);
	
	EFlapStage flapStage = EFlapStage.FLAT;

	@Override
	public int extendsFlaps() {
		if (!flapStage.equals(EFlapStage.FULL)) {
			System.out.println("Extending flaps...");

			int nextStage = flapStage.getValue() + 1;
			flapStage = EFlapStage.getFromValue(nextStage);
			
			System.out.println("flap ONE at grade: " + flapOneGrade.get(flapStage.getValue()));
			System.out.println("flap TWO at grade: " + flapTwoGrade.get(flapStage.getValue()));
		}
		
		return flapStage.getValue();
	}

	@Override
	public int retractFlaps() {
		if (!flapStage.equals(EFlapStage.FLAT)) {
			System.out.println("Retracting flaps... ");

			int nextStage = flapStage.getValue() - 1;
			flapStage = EFlapStage.getFromValue(nextStage);
			
			System.out.println("flap ONE at grade: " + flapOneGrade.get(flapStage.getValue()));
			System.out.println("flap TWO at grade: " + flapTwoGrade.get(flapStage.getValue()));
		}

		return flapStage.getValue();
	}

	@Override
	public EFlapStage flapStage() {
		return flapStage;
	}

	@Override
	public void fullRetractFlaps() {
		flapStage = EFlapStage.FLAT;
		System.out.println("flap ONE at grade: " + flapOneGrade.get(flapStage.getValue()));
		System.out.println("flap TWO at grade: " + flapTwoGrade.get(flapStage.getValue()));
	}
}
