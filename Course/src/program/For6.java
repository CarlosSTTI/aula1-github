package program;

import java.util.Scanner;

public class For6 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("O numero é divisivel por" + i);
			
			sc.close();
		}
	}

}
