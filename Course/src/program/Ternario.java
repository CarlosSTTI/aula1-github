package program;

import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double preco = sc.nextDouble();
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.println("Bem vindo, possuimos desconto em produtos abaixo de 20 R$");
		System.out.println("O preço é:" +desconto);
		
		sc.close();
		

	}

}
