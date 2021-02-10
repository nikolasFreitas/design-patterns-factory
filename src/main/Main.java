package main;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import aircraft.factory.Aircraft;
import aircraft.factory.AircraftFactory;
import aircraft.factory.IAvaiableModels;

//Sistema de uso de factory e abstract factory

public class Main {

	public static void main(String[] args) {
		System.out.println("Bem-vindo. Hello world from design patterns factory study");
		showJavaVersion();
		List<String> manufactoryNames = Arrays.asList("Boeing", "Airbus", "Embraer");
		
		System.out.flush();
		Scanner scan = new Scanner(System.in);
		System.out.println("Escolha dentre os modelos disponíveis");
		for (String manufactoryName : manufactoryNames) {
			System.out.println("- "+ manufactoryName);
		}
		StringBuffer manufactory = new StringBuffer();
		while (true) {
			String chosed = scan.next();
			manufactory.replace(0, manufactory.length(), chosed);
			if (manufactoryNames.contains(manufactory.toString())) {
				break;
			}

			System.out.println("Opção " + chosed + " não existe!");
		}
		scan.close();
		
		clearConsole();  
		
		IAvaiableModels aircraftFactory;
		if (manufactory.toString() == "Embraer") {
			 aircraftFactory = AircraftFactory.getEmbraer();
		} else {
			 aircraftFactory = AircraftFactory.getBoeing();
		}
		System.out.println("\n\n ------------- \n");
		System.out.println("Testing heavy airplanes");
		Aircraft heavyModel = aircraftFactory.getHeavyModel();
		heavyModel.takeOff();
		heavyModel.fly();
		heavyModel.approach();
		heavyModel.finalApproach();
		heavyModel.land();
		heavyModel.afterLand();

		System.out.println("\n\n ------------- \n");
		System.out.println("Testing small airplanes");
		
		Aircraft smallModel = aircraftFactory.getSmallModel();
		smallModel.takeOff();
		smallModel.fly();
		smallModel.approach();
		smallModel.finalApproach();
		smallModel.land();
		smallModel.afterLand();
	}
	
	private final static void clearConsole()
	{
	    try
	    {
	        final String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e)
	    {
	        //  Handle any exceptions.
	    }
	}
	
	private static void showJavaVersion() {
		String version = System.getProperty("java.version");
	    if(version.startsWith("1.")) {
	        version = version.substring(2, version.length());
	    }
	    System.out.println("Running with java version: " + version);
	}
}
