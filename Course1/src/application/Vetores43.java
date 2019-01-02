package application;

import java.util.Scanner;

import entities.Vetorteste;

public class Vetores43 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Vetorteste[] nomedovetor = new Vetorteste[n];
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			nomedovetor[i] = new Vetorteste(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i<n; i++) {
			sum += nomedovetor[i].getPrice();
		}
		double avg = sum / n;
		System.out.printf("Average Price = %.2f%n", avg);
	}
	

}
