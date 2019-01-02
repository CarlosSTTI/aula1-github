package application;

import java.util.Scanner;

public class Objet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		char gender = sc.next().charAt(0);
		Object obj = gender;
		System.out.println(obj);
		
	}

}
