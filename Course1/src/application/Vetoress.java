package application;

import java.util.Scanner;

public class Vetoress {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double [] nomedovetor = new double [n];
		
		for (int i=0; i<n; i++) {
			nomedovetor[i] = sc.nextDouble();
		}
		for (int i=0; i<n; i++) {
			System.out.println(nomedovetor[i]);
		}
		
		
		sc.close();

	}

}
