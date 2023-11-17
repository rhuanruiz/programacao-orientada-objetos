package Q1;
import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite 1 para quadrado, 2 para circulo e 3 para triangulo: ");
		int x = scan.nextInt();
		if(x == 1) {
			Quadrado figura1 = new Quadrado(2);
			System.out.println("Area quadrado = " + figura1.calcularArea(2));
		}
		else if(x == 2) {
			Circulo figura1 = new Circulo(2);
			System.out.println("Area Circulo = " + figura1.calcularArea(2));
		}
		else if(x == 3) {
			Triangulo figura1 = new Triangulo(2,3);
			System.out.println("Area Triangulo = " + figura1.calcularArea(2,3));
		}
	}
}
