package program;

import java.util.Scanner;

public class For7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int ii = i * i;
			int iii = i * i * i;
			System.out.printf("%d %d %d%n",i, ii, iii);
			
			sc.close();
		}
		

	}

}
