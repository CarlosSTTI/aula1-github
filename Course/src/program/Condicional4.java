package program;

import java.util.Scanner;

public class Condicional4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int hora = sc.nextInt();
		int horafinal = sc.nextInt();
		int duracao;
		
		if (hora < horafinal) {
			duracao = horafinal - hora;
			
		}
		else {
			duracao = 24 - hora + horafinal;
		}
		
		System.out.println("O jogo durou  " + duracao +  " horas ");
		
		sc.close();
	}

}
