package Q4;
import java.util.Scanner;

class CrescenteDecrescente {
	
	public static void main(String[] args) {
		
		double a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite tres numeros:");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		if(a > b && a > c) {
			if(b > c) {
				System.out.println("Ordem crescente = " + c + " " + b + " " + a);
				System.out.println("Ordem decrescente = " + a + " " + b + " " + c);
			}
			else {
				System.out.println("Ordem crescente = " + b + " " + c + " " + a);
				System.out.println("Ordem decrescente = " + a + " " + c + " " + b);
			}
		}
		else if(b > a && b > c) {
			if(a > c) {
				System.out.println("Ordem crescente = " + c + " " + a + " " + b);
				System.out.println("Ordem decrescente = " + b + " " + a + " " + c);
			}
			else {
				System.out.println("Ordem crescente = " + a + " " + c + " " + b);
				System.out.println("Ordem decrescente = " + b + " " + c + " " + a);
			}
		}
		else {
			if(a > b) {
				System.out.println("Ordem crescente = " + b + " " + a + " " + c);
				System.out.println("Ordem decrescente = " + c + " " + a + " " + b);
			}
			else {
				System.out.println("Ordem crescente = " + a + " " + b + " " + c);
				System.out.println("Ordem decrescente = " + c + " " + b + " " + a);
			}
		}	
	}
}
