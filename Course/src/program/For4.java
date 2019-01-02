package program;

import java.util.Scanner;

public class For4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantas repetições você deseja");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(" Digite os numeros " +i);
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			if (n2 == 0 ) {
				System.out.println("Divisão impossível");
				
			}
			else {
				double div =  n1 / n2;
				System.out.printf("%.1f%n", div);
			}
		}

		
		sc.close();
	}

}
