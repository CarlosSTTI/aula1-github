package application;

import java.util.Scanner;

import util.Conversao;

public class Dolar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Conversao conversao = new Conversao ();
		
		System.out.print("Qual o valor do d�lar atual?");
		conversao.dolar = sc.nextDouble();
		System.out.println("Quantos d�lares v�o ser comprados?");
		conversao.valorapagar = sc.nextDouble();
		System.out.println("Valor pago em reais " + conversao.Conta());
		
		sc.close();
		

	}

}
