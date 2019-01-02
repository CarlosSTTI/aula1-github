package application;

import java.util.Scanner;

public class TreinoVetores2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 10;
		double [] vetores = new double [10];
		double [] vetoresb = new double [10];
		for (int i=0; i<n; i++) {
			vetores[i] = sc.nextInt();
			vetoresb[i] = Math.sqrt(vetores[i]);
		}
		for (int i =0; i<n; i++) {
			System.out.println(vetores[i]);
			System.out.println(vetoresb[i]);
		}

	}

}
