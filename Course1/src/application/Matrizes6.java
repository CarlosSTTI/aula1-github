package application;

public class Matrizes6 {

	public static void main(String[] args) {
		
		double [][] m = new double [4][4];
		m[0][0] = 10;
		m[0][1] = 10;
		m[0][2] = 10;
		m[0][3] = 10;
		
		m[1][0] = 10;
		m[1][1] = 10;
		m[1][2] = 10;
		m[1][3] = 10;
		
		double imaior = 0;
		double jmaior = 0;
		for (int i = 0; i<m.length; i++) {
			for (int j = 0; i<m.length; i++) {
					if (m[1][2]>j) {
						imaior = i;
								System.out.println(imaior);
					}
					
				}
			}
		}
	}


