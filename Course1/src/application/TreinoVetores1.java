package application;

import java.util.Scanner;

public class TreinoVetores1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o tamanho do vetor ");
		int n = sc.nextInt();
		
		double[] vetor1 = new double[n];
		double[] vetor2 = new double[n];
		
		for (int i=0; i<n; i++) {
			vetor1[i] = sc.nextDouble();
			vetor2[i] = vetor1[i] * 2;
			
		}
		for (int i =0; i<n; i++) {
			System.out.println(vetor1[i]);
			System.out.println("------------------------------");
			System.out.println(vetor2[i]);
		}
	}

}
