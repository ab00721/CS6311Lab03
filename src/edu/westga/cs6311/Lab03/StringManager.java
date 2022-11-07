package edu.westga.cs6311.Lab03;

import java.util.Scanner;
/**
 * Info
 * @author Anna Blood
 * @version 09/06/22
 */
public class StringManager {

	/**
	 * Application entry point
	 * @param args Not used
	 */
	public static void main(String[] args) {
		//Enter number with comma. Print number without a comma.
		System.out.println("Enter a number between 1,000 and 299,999 - please include the comma.");
		Scanner input = new Scanner(System.in);
		String number1 = input.nextLine();
		System.out.print("User entered number without the comma: ");
		String[] tokens = number1.split(",");
		for (int i = 0; i < tokens.length; i++) 
			System.out.print(tokens[i] + "");
		
		//Enter number without a comma. Print number with a comma.
		System.out.println("\nEnter a number between 1,000 and 299,999 - numbers only, no comma.");
		String number2 = input.nextLine();
		int numberInt = Integer.parseInt(number2);
		System.out.print("User entered number with the comma: ");
		System.out.printf("%,4d", numberInt);
		
		//Replace a letter in a phrase. 
		System.out.println("\nEnter a saying or a sentence:");
		String sentence = input.nextLine();
		System.out.println("Enter a letter to be replaced:");
		String replaceLetter = input.nextLine();
		System.out.println("Enter a letter you want " + replaceLetter + " replaced by:");
		String replaceWith = input.nextLine();
		System.out.println(sentence.replaceAll(replaceLetter, replaceWith));
		
		input.close();
	}
}