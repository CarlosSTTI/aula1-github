package program;

import java.util.Scanner;

public class DoeWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char rep;
		do {
			
		System.out.println("Enter a number:  ");
		double n = sc.nextDouble();
		double sq = Math.sqrt(n);
		System.out.printf("Square root = %.3f%n", sq);
		
		System.out.println("Repeat (y/n)? ");
		rep = sc.next().charAt(0);
	} while (rep != 'n');
	
	sc.close();
		
	}

}
