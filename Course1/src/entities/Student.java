package entities;

public class Student {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double media;
	public int total = 60;
	
	public double Passou () {
		return  nota1+nota2+nota3;
	}
	public double NaoPassou () {
		return 60 - nota1-nota2-nota3;
	}
}
