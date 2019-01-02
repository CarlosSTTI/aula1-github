package program;

import java.util.Scanner;

public class Condicional6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();

		if (numero == 25 || numero == 50) {
			System.out.println("O numero inserido tem um invertalo entre 25 a 50");

		} else if (numero == 1 || numero == 24) {
			System.out.println("O numero inserido tem um intervalo entre 0 a 24");
		
		}
		else if (numero == 75 || numero == 100 ) {
			System.out.println("O numero inserido tem um intervalo entre 0 a 100");
			
		}
		else {
			System.out.println("Fora de intervalo");
		}
	}

}
