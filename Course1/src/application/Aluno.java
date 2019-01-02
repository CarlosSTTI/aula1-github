package application;

import java.util.Scanner;

import entities.Student;

public class Aluno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		Student student = new Student();

		System.out.println("Escreva o nome do aluno");
		student.nome = sc.nextLine();
		System.out.println("Escreva a primeira nota");
		student.nota1 = sc.nextDouble();
		System.out.println("Escreva a segunda nota");
		student.nota2 = sc.nextDouble();
		System.out.println("Escreva a terceira nota");
		student.nota3 = sc.nextDouble();

		if (student.Passou() < 60) {
			System.out.println("Quantia de pontos que falta: " + student.NaoPassou());

		}

		else if (student.media > 100) {
			System.out.println("Nota digitada incorreta" + student.Passou());
		}

		else {
			System.out.println("Aluno aprovado, média final de pontos " + student.Passou());
		}

	}

}
