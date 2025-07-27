package Module4CriticalThinking;

import java.util.Scanner;
import java.util.ArrayList;

public class Module4CriticalThinking {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// Setup variables
		ArrayList<Double> numList = new ArrayList<Double>();
		double total = 0.0;
		double avg = 0.0;
		double max = 0.0;
		double min = 0.0;
		double interest = 0.0;
		
		// Get user input of 5 decimal numbers
		while (true) {
			if (numList.size() == 5) {
				break;
			}
			
			System.out.println("Enter a decimal number:");
			
			try {
				double num = scnr.nextDouble();
				numList.add(num);
			} catch (Exception e) {
				System.out.println("The value entered was not a decimal number");
				scnr.nextLine();
			}
		}
		
		// Perform calculations
		max = numList.get(0);
		min = numList.get(0);
		for (double num : numList) {
			total += num;
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		avg = total / numList.size();
		interest = total * 0.2;
		
		// Output values
		System.out.println("Total: " + total);
		System.out.println("Average: " + avg);
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
		System.out.println("Interest: " + interest);
	}
}
