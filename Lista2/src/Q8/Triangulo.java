package Q8;
import java.util.Scanner;

class Triangulo {
	
	public static void main(String[] args) {
		
		double x,y,z;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite tres valores:");
		x = scan.nextDouble();
		y = scan.nextDouble();
		z = scan.nextDouble();
		if(x < y + z && y < x + z && z < x + y) {
			if(x==y && x==z) {
				System.out.println("Triangulo equilatero");
			}
			else if(x==y || x==z || y==z) {
				System.out.println("Triangulo isosceles");
			}
			else {
				System.out.println("Triangulo escaleno");
			}
		}
		else {
			System.out.println("Nao eh um triangulo");
		}
	}

}
