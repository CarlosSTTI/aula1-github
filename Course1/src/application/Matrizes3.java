package application;

public class Matrizes3 {

	public static void main(String[] args) {
		
		double [][][] matriz = new double [3][3][3];
		
		
		
		for (int i = 0; i<matriz.length; i++) {
			for (int j = 0; j<matriz.length; j++) {
				for (int z = 0; z<matriz.length; z++) {
					System.out.println("i = " + i + " - j = " + j + " - k = " + z);
					matriz[i][j][z] = i + j + z;
				}
			}
		}
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				for (int z=0; z<matriz[i][j].length; z++) {
					soma+= matriz[i][j][z];
					
					if (matriz[i][j][z] % 2 ==0) {
						somaPares += matriz[i][j][z];
						
						
					} else {
						somaImpares += matriz[i][j][z];
					}
					
				}
			}
		}
		
		System.out.println(somaImpares);
		System.out.println(soma);
		System.out.println(somaPares);
	}

}