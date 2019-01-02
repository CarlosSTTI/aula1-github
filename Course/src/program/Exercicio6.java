package program;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double areatriangulo = (a*c) / 2 ;
		double areacirculo = Math.PI * c * c;
		double areatrapezio = (a+b)/2 * c;
		double areaquadrado = (b*b);
		double arearetangulo = (a * b);
		
		System.out.printf("TRIANGULO: %.3f%n", areatriangulo);

		System.out.printf("CIRCULO: %.3f%n", areacirculo);

		System.out.printf("TRAPEZIO: %.3f%n", areatrapezio);

		System.out.printf("QUADRADO: %.3f%n", areaquadrado);

		System.out.printf("RETANGULO: %.3f%n", arearetangulo);
		
		sc.close();

		
		

	}

}
