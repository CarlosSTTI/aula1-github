package application;

import java.util.Scanner;

import entities.Retangle;

public class Retangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Retangle retangle = new Retangle();
		
	
		
		
		System.out.print("Insira a largura do retangulo: ");
		retangle.width = sc.nextDouble();
		System.out.println();
		
		System.out.println("Insira a altura do retangulo: ");
		retangle.height = sc.nextDouble();
		
		System.out.println("A area do retangulo é " +retangle.Area());
		System.out.println("O perimetro é " +retangle.Perimeter());
		System.out.println("A diagonal é " +retangle.Diagonal());
		
	}

}
