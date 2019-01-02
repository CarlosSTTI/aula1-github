package program;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um numero de 1 a 3 ");
		System.out.println("1 - Alcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		System.out.println(("4 - Sair"));
		int produto = sc.nextInt();
		int alcool = 0;
		int diesel = 0;
		int gasolina = 0;
		while (produto != 4) {
			if (produto == 1) {
				alcool = alcool + 1;
			}
			if (produto == 2) {
				gasolina = gasolina + 1;
			} else if (produto == 3) {
				diesel = diesel + 1;
			}	
			
				produto = sc.nextInt();
			
		}
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: "+ diesel);
		
		sc.close();
	}

}
