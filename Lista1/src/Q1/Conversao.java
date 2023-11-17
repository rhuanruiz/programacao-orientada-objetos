package Q1;
import java.util.Scanner;

class Conversao {
	
	public static void main(String[] args) {
		
		double litros,galao;
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantos galoes?");
		galao = scan.nextDouble();
		litros = galao*3.7854;
		System.out.println(litros + " L");
		
	}
}
