package edu.westga.cs6311.Lab03;

/**
 * Info
 * @author Anna Blood
 * @version 09/06/22
 *
 */
public class RandomManager {

	/**
	 * Application entry point
	 * @param args Not used
	 */
	public static void main(String[] args) {
		
		//Generate and print number of days in rental. 
		double days = Math.ceil((Math.random() * 10));
		int daysInt = (int)(days);
		System.out.println("Total number of days for this rental: " + daysInt);
		
		//Generate and print amount per day. 
		double amount = Math.ceil(10 + (Math.random() * 90));
		int amountInt = (int)(amount);
		System.out.println("Total amout per day for this rental: " + amountInt);
		
		//Calculate and print total cost.
		int total = (daysInt * amountInt);
		System.out.println("Total cost for this rental: " + total);
		
	}
}
