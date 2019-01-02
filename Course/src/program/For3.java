package program;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Numero" +i);
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			double media = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / 10.0;
			System.out.println(media);
			sc.close();
			
			
		}
		
		

	}

}
