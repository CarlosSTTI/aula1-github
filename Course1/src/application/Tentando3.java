package application;

import java.util.Scanner;

import entities.Pessoas;

public class Tentando3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pessoas [] vetor = new Pessoas[10]; 

		System.out.println("How many rooms will be rented? ");
		int n =sc.nextInt();
		for (int i = 0; i<n; i++) {
			System.out.println("Rent # " + i);
			System.out.println("Name ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email ");
			String email = sc.nextLine();
			System.out.println("Room ");
			int room = sc.nextInt();
			vetor[room] = new Pessoas(name, email);
			
		}
		System.out.println();
		System.out.println("Busy rooms");
		for (int i=0; i<10; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
				
				sc.close();
			}
		}
	}

}
