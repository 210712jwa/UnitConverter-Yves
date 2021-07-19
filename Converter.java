package main;

import java.util.Scanner;

public class Converter {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/**
		 * Program to allow a user to convert between different units as long as the
		 * user doesn't choose to quit. The possible conversions would be: Cups to
		 * Teaspoon , * Miles to Kilometers, * Gallons to Imperial Gallons
		 * 
		 * @intNum which is the number to convert
		 * @return String representing the conversion result
		 */

		System.out.println("Welcome to Yves Bouele Conversion Program");
		System.out.println();
		System.out.println("This application would allow you to make some units conversions:");
		System.out.println();

		System.out.println("Please Enter ");

		// Building an array that would display the menu

		String[] menus = new String[4];

		menus[0] = "[1] to convert Cups-To-Teaspoons";
		menus[1] = "[2] to convert Miles-to-Kilometers";
		menus[2] = "[3] to convert Gallons-to-Imperial Gallons";
		menus[3] = "or \n" + "[4] to Quit!";

		for (String menu : menus) {
			System.out.println(menu);
		}

		String convStatus = "Convert";

		int intNum; // variable to store which conversion to make.
		intNum = sc.nextInt(); // read and store input

		while (convStatus.equals("Convert")) {

			String convertNext;

			switch (intNum) {
			case 1:
				System.out.println("Converting cups to teaspoons");
				// converting cups to teaspoons
				System.out.println("Enter number to convert: ");
				int numConvert = sc.nextInt(); // read user input then store it
				convertCupsToTeaspoon(numConvert); // calling the class making the conversion from cups to teaspoon
//					System.out.println(numConvert + " cups equals to " + convertCupsToTeaspoon(numConvert) + " teaspoons");
				System.out.println();
				break;

			case 2:
				System.out.println("Converting miles to kilometers");
				// converting miles to kilometers
				System.out.println("Enter number to convert: ");
				double numConvert2 = sc.nextDouble(); // read  user input then store it
				convertMilesToKilometers(numConvert2); // calling the class making the conversion from miles to kilometers
//					System.out.println(numConvert + " Miles equals to " + convertMilesToKilometers(numConvert) + " Kilometers");
				System.out.println();
				break;

			case 3:
				System.out.println("Converting gallons to imperial gallons");
				// converting gallons to imperial gallons
				System.out.println("Enter number to convert: ");
				double numConvert3 = sc.nextDouble(); // read user input then store it
				convertGallonsToImperials(numConvert3); // calling the class making the conversion from gallons to imperial gallons
//					System.out.println(numConvert + " Gallons equals to " + convertGallonsToImperials(numConvert) + " Imperial Gallons");
				System.out.println();
				break;

			default:
				System.out.println("Thank you, the program has ended!");
				return;
			}

			
			System.out.println("Should we convert another number? (y/n)");

			sc.nextLine();
			convertNext = sc.nextLine();

			if (convertNext.equals("n") || convertNext.equals("N")) {

				System.out.println("Should we try another conversion type? (y/n)");

//				sc.nextLine();
				convertNext = sc.nextLine();

				if (convertNext.equals("y") || convertNext.equals("Y")) {

					System.out.println("Please enter one of the number 1, 2, 3, or 4 (to quit)");
					for (String menu : menus) {
						System.out.println(menu);
					}

					intNum = sc.nextInt(); // read and store input
					//break;

				} else if (convertNext.equals("n") || convertNext.equals("N")) {

					System.out.println("Thank you for choosing our service, program closed");
					return;
				}

			}
		}

	}

	// create a classes or functions to do the calculation based on the number entered

	public static int convertCupsToTeaspoon(int numConvert) {
		int teaspoons = numConvert * 48;
		System.out.println(numConvert + " cups equals to " + teaspoons + " teaspoons");
		return teaspoons;
	}

	public static double convertMilesToKilometers(double numConvert) {
		double kilometers = numConvert * 1.60934;
		System.out.println(numConvert + " Miles equals to " + kilometers + " Kilometers");
		return kilometers;
	}

	public static double convertGallonsToImperials(double numConvert) {
		double imperials = numConvert * 0.83267384;
		System.out.println(numConvert + " Gallons equals to " + imperials + " Imperial Gallons");
		return imperials;
	}

}
