package Q1;
import java.util.Scanner;

class ParImpar {

	public static void main(String[] args) {
		
		int [] v = new int[10];
		int i,contPar = 0,contImpar = 0;
		
		System.out.println("Digite 10 numeros inteiros: ");	
		Scanner scan = new Scanner(System.in);
		for(i = 0; i < 10; i++) {
			v[i] = scan.nextInt();
		}
		
		System.out.println("Pares: ");
		for(i = 0; i < 10; i++) {
			if(v[i] % 2 == 0) {
				System.out.println(v[i]);
				contPar++;
			}	
		}
		
		System.out.println("Impares: ");
		for(i = 0; i < 10; i++) {
			if(v[i] % 2 != 0) {
				System.out.println(v[i]);
				contImpar++;
			}	
		}
		System.out.println("Total pares: " + contPar + "\nTotal impares: " + contImpar);		
	}
}
