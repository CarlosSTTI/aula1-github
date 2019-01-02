package program;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite sua senha");
		int senha = sc.nextInt();
		while (senha == 2002) {
			System.out.println("Acesso permitido");
			System.out.println("Insira outra senha: ");
			senha = sc.nextInt();
		}
		System.out.println("Senha invalida");
		sc.close();

	}

}
