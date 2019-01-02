package application;

import java.util.Scanner;

import util.Calculator;

public class MembrosEstaticos {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Calculator calculator = new Calculator();
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calculator.circumference(radius);	
		
		double v = calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Pi value %.2f%n", calculator.PI);


		
		sc.close();

	}
	
	
	
}
