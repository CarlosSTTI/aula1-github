package application;

import java.util.Scanner;

import entities.BobEsponja;

public class Funcionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BobEsponja bobesponja = new BobEsponja();
		
		System.out.println("Insira o nome do funcionario ");
		bobesponja.name = sc.nextLine();
		
		System.out.println();
		
		System.out.println("Insira o salario bruto ");
		bobesponja.GrossSalary = sc.nextDouble();
		
		System.out.println("Insira o imposto ");
		bobesponja.tax = sc.nextDouble();
		
		System.out.println("Atualmente os dados são " +bobesponja);
		
		System.out.println("Qual a porcentagem de incremento de salário? ");
		double percentage = sc.nextDouble();
		bobesponja.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Dados atualizados " +bobesponja);
		
		
		
	}

}
