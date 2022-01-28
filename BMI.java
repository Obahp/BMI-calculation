package week4;

import java.util.Scanner;

import java.lang.Math;

public class BMI {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a person's height in inches:");
		double height = Double.parseDouble(in.nextLine()); 	
		
		System.out.println("Please enter a person's weight in pounds:");
		double weight = Double.parseDouble(in.nextLine()); 	
		
		double h = height * 0.0254;		// converting to meters
		double w = weight * 0.45359237; // converting to kilograms
		
		double d = (double)Math.pow(h,2); // Exponent calculation
		
	    double BMI = w / d;		// calculating the BMI
	    	    
		System.out.print("The person's BMI is: " + BMI + ". The person has a BMI classification of: " );
		
		if (BMI < 18.5) {
			System.out.print("Underweight");
			} else if (BMI >=18.5 && BMI < 24.9)
			System.out.print("Normal");
		    else if (BMI >= 25.0 && BMI <= 29.9)
		    System.out.print("Overweight");
		    else if (BMI > 30.0)
			System.out.print("Obese");
		
		in.close();
	}   
}
