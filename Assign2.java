
/** Author: Sean Murchison
 * Course: CST8110_301
 * Lab Professor: Anissa Shaddy
 * Assignment #2
 * March 8th 2019
 *
 * Purpose: This program will prompt the user with a calculator.
 * The user will select their math operator choice, from addition to modulus
 * The user will then enter two values, and the math will be calculated.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Assign2 {
	private double num1, num2;
	private int factorialNum;

	public static void main(String[] args) {
		// scanner for calculator menu selection
		Scanner input = new Scanner(System.in);
		// new calculator object
		Assign2 calculator = new Assign2();

		// calculator menu choice variable (1-7)
		int choice = 0;

		do {
			// prompt user with calculator menu
			System.out.println(
					"\nPress:\n" + "1 for Addition (+)\n" + "2 for Subtraction (-)\n" + "3 for Multiplication (*)\n"
							+ "4 for Division (/)\n" + "5 for Factorial (n!)\n" + "6 for Modulus (%)\n" + "7 to Exit");

			choice = input.nextInt();

			// calculator options
			switch (choice) {
			case 1:
				calculator.promptUser();
				calculator.doAddition();
				break;
			case 2:
				calculator.promptUser();
				calculator.doSubtraction();
				break;
			case 3:
				calculator.promptUser();
				calculator.doMultiplication();
				break;
			case 4:
				calculator.promptUser();
				calculator.doDivision();
				break;
			case 5:
				calculator.checkBoundary();
				calculator.doFactorial();
				break;
			case 6:
				calculator.promptUser();
				calculator.doModulus();
				break;
			case 7:
				System.out.println("Exiting application!");
				break;
			default:
				System.out.println("Invalid choice. Please choose 1 of the 7 options.");
			}
		} while (choice != 7);
	}

	// method to prompt user to enter two numbers
	public void promptUser() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first value: ");
		num1 = input.nextDouble();

		System.out.print("Enter second value: ");
		num2 = input.nextDouble();
	}

	// prompt user with boundary restrictions
	public void checkBoundary() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer (between 0 to 10): ");
		factorialNum = input.nextInt();

		while (factorialNum < 0 || factorialNum > 10) {
			System.err.print("Error: Enter an integer between 0 to 10: ");
			factorialNum = input.nextInt();
		}
	}

	// do addition
	public void doAddition() {
		DecimalFormat df = new DecimalFormat("##.##");
		double addition = (num1 + num2);
		String formatAddition = df.format(addition);
		System.out.println(num1 + " + " + num2 + " = " + formatAddition);
	}

	// do subtraction
	public void doSubtraction() {
		DecimalFormat df = new DecimalFormat("##.##");
		double subtraction = (num1 - num2);
		String formatSubtraction = df.format(subtraction);
		System.out.println(num1 + " - " + num2 + " = " + formatSubtraction);
	}

	// do multiplication
	public void doMultiplication() {
		DecimalFormat df = new DecimalFormat("##.##");
		double multiplication = (num1 * num2);
		String formatMultiplication = df.format(multiplication);
		System.out.println(num1 + " * " + num2 + " = " + formatMultiplication);
	}

	// do division
	public void doDivision() {
		DecimalFormat df = new DecimalFormat("##.##");
		double division = (num1 / num2);
		String formatDivision = df.format(division);
		System.out.println(num1 + " / " + num2 + " = " + formatDivision);
	}

	// do factorial
	public void doFactorial() {
		DecimalFormat df = new DecimalFormat("##.##");
		int factorial = 1;
		for (int i = 1; i <= factorialNum; i++) {
			factorial = factorial * i;
		}
		String formatFactorial = df.format(factorial);
		System.out.println("Factorial of " + factorialNum + " is " + formatFactorial);
	}

	// do modulus
	public void doModulus() {
		DecimalFormat df = new DecimalFormat("##.##");
		double modulus = (num1 % num2);
		String formatModulus = df.format(modulus);
		System.out.println(num1 + " % " + num2 + " = " + formatModulus);
	}
}
