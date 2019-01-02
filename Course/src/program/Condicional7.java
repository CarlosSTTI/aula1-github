package program;

import java.util.Scanner;

public class Condicional7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double um = sc.nextDouble();
		double imposto;
		if (um <= 2000) {
			imposto = 0.0;
			
		}
		else if (um <= 3000.0) {
			imposto = (um - 2000) * 0.08;
		}
		else if (um <= 4500.0) {
			imposto = (um - 3000.0)* 0.18 + 1000.0 * 0.08;	
		}
		else {
			imposto = (um - 4500.0)* 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
	}

}