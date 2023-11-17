package Q3;
import java.util.Scanner;

class ValorE {
	
	public static void main(String[] args) {
		
		int n, i;
		double E = 0.0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor n inteiro e positivo: ");
		n = scan.nextInt();
		
		for(i = 1 ; i <= n; i++) {
			E = E + (double)1/i;
			//System.out.println(E);
		}
		
		System.out.println("E = " + E);
	}
}
