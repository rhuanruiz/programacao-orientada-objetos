package Q3;
import java.util.Scanner;

class MaiorNumero {
	
	public static void main(String[] args) {
		
		double a,b,maior;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite dois numeros:");
		a = scan.nextDouble();
		b = scan.nextDouble();
		maior = (a > b) ? a : b;
		System.out.println("Maior numero = " + maior);
		
	}
}
