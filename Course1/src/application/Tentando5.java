package application;

import java.util.Scanner;

import entities.Vetor434;

public class Tentando5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		Vetor434 [] vetor = new Vetor434 [10];
		for (int i = 0; i<n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + i);
			System.out.println("Name");
			String name = sc.nextLine();
			System.out.println("Email");
			String email = sc.nextLine();
			System.out.println("Room");
			int room = sc.nextInt();
			vetor [room] = new Vetor434(name, email);
			System.out.println(i + ": " + vetor[i]);

			
			
		}
		

		

	}

}
