package application;

import java.util.Scanner;

public class Matrizes4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double matrizes [][] = new double [n][n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; i<n; i++) {
				matrizes[i][j] = sc.nextDouble();
			}
		}
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				soma += matrizes[i][j];
				
				if (matrizes[i][j] % 2 == 0) {
					somaPares++;
				
				}else {
					somaImpares++;
					
					for (int z = 0; z<n; z++) {
						double maior = matrizes[1][1];
						if (matrizes[i][j]>maior) {
							maior = matrizes[i][j];
							System.out.println(maior);
						}

					}
					System.out.println(somaPares);
					System.out.println(somaImpares);
					System.out.println(soma);
					
				}
			}
		}
	}
	
	
	

}
