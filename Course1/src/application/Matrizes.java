package application;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int vetor [][] = new int [n][n];
		
		for (int i = 0; i<vetor.length; i++) {
			for (int j = 0; j < vetor[i].length; j++) {
				vetor[j][n] = sc.nextInt();
			}
		}
		System.out.println("Main Diagonal");
		for (int i=0; i<vetor.length; i++) {
			System.out.println(vetor[i][i] + " ");
		}

		int count = 0;
		
		for (int i = 0; i<vetor.length; i++) {
			for (int j = 0; j < vetor[i].length; j++) {
				if (vetor[i][j] < 0 ) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers: " + count);
		
		sc.close();
	}

}
