package application;

import java.util.Scanner;

public class TreinoVetores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
			double [] vetorzao = new double [n];
			double [] vetorzap = new double [n];
			
			for (int i = 0; i<n; i++) {
				vetorzao[i] = sc.nextDouble();
				vetorzap[i] = vetorzao[i];
			}
			for (int i =0; i<n; i++) {
				System.out.println("->"+vetorzao[i]);
				System.out.println("->"+vetorzap[i]);
			}
			
		


	}

}
