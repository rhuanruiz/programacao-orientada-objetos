package Q9;
import java.util.Scanner;

class Tabuada {
	
	public static void main(String[] args) {
		
		int i;
		double numero,soma;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor POSITIVO: ");
		numero = scan.nextDouble();
		
		while(numero < 0) {
			System.out.println("Digite um valor POSITIVO: ");
			numero = scan.nextDouble();
		}
		
		System.out.println("Tabuada soma: ");
		for(i = 0; i <= 10; i++) {
			soma = i + numero;
			System.out.println(i + " " + numero + " = " + soma);
		}
	}
}
