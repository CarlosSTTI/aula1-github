package program;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name");
		String name1 = sc.nextLine(); // Alex Green
		System.out.println("How many bedrooms are there in your house?");	
		int number = sc.nextInt(); // 3
		System.out.println("Enter product price");
		double product = sc.nextDouble(); // 500.50
		System.out.println("Enter your last name, age and height (same line)");
		String name2 = sc.next(); // Green
		int number2 = sc.nextInt();
		double height = sc.nextDouble(); // 1.73
		
		
		System.out.println(name1);
		System.out.println(number);
		System.out.printf("%.2f%n", product);
		System.out.println(name2);
		System.out.println(number2);
		System.out.printf("%.2f%n",height);
		
		sc.close();
		
		
		

	}

}
