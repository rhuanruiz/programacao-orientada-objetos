package Q2;
import java.util.Scanner;

class MaiorMenor {
	
	public static void main(String[] args) {
		
		int[] v = new int[10];
		int i, maior = 0, menor;
		
		System.out.println("Digite 10 valores inteiros: ");
		Scanner scan = new Scanner(System.in);
		for(i = 0; i < 10; i++) {
			v[i] = scan.nextInt();
			if(v[i] > maior) {
				maior = v[i];
			}
		}
		menor = v[0];
		for(i = 0; i < 10; i++) {
			if(v[i] < menor) {
				menor = v[i];
			}
		}
		System.out.println("Maior = " + maior + " Menor = " + menor);
	}
}
