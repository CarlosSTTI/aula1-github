package program;

import java.util.Scanner;

public class Condicional1 {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		int a  = sc.nextInt();
		
		if (a < 0 ) {
			System.out.println("Negativo");
			
		} 
		else {
			System.out.println("Não negativo");
			
			sc.close();
		}
	}

}
