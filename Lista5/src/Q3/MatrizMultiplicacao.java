package Q3;
import java.util.Scanner;

class MatrizMultiplicacao {
	
	public static void main(String[] args) {
		
		int[][] M = new int [4][4];
		int i, j, maior = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite os valores da matriz: ");
		for(i = 0; i < 4; i++) {
			System.out.println("Linha " + (i+1));
			for(j = 0; j < 4; j++) {
				M[i][j] = scan.nextInt();
				if(M[i][j] > maior) {
					maior = M[i][j];
				}
			}
		}
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 4; j++) {
				M[i][j] = M[i][j]*maior;
				System.out.print(" " + M[i][j]);
			}	
		}
	}
}
