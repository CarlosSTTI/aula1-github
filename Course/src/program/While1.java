package program;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		double n = sc.nextDouble();
		
		while (n >= 0.0) {
			double sr = Math.sqrt(n);
			System.out.printf("A raiz quadrada é %.3f%n", sr);
			System.out.println("Enter another number: ");
			n = sc.nextDouble();
		}
		System.out.println("Negative Number");
		sc.close();

	}

}
