package program;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int numero = sc.nextInt();
		int horas = sc.nextInt();
		double valor = sc.nextDouble();
		double salario = (valor*horas);
		
		System.out.println("Qual seu numero? " + numero);
		System.out.println("Quantas horas o senhor trabalha? " + horas);
		System.out.println("Qual o seu valor por hora? " + valor);
		System.out.printf("O seu salário atual é " + salario);
		
		sc.close();
		
		
		
		

	}

}
