package program;

import java.util.Scanner;

public class Condicional2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int numero = sc.nextInt();
		
		if (numero % 2 == 0 ) {
		System.out.println("Numero par");	
		}
		else {
			System.out.println("Numero impar");
			
			sc.close();
		}
	}

}
