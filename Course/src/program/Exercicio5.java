package program;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int codigo1 = sc.nextInt();
		int pecas1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		int codigo2 = sc.nextInt();
		int pecas2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		double total = (valor1 * pecas1 + valor2 * pecas2);
		
		System.out.printf("Valor a pagar R$ %.2f%n", total);
		
		sc.close();
		

	}

}
