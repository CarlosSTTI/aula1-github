package program;

import java.util.Scanner;

public class For5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Insira um valor");
		int n = sc.nextInt();
		int fat = 1;
		for (int i = 1; i <= n; i++ ) {
			fat = fat * i;
			System.out.println("A fatorial é " + fat);
			
			sc.close();
			
		}

	}

}
