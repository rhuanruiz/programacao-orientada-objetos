package Q5;
import java.util.Scanner;

class AreaCirculo {
	
	public static void main(String[] args) {
		
		double pi=3.14,raio,area;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor do raio:");
		raio = scan.nextDouble();
		area = pi*(raio*raio);
		System.out.println(area);
		
	}
}
