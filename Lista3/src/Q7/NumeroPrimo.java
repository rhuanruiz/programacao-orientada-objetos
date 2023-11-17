package Q7;
import java.util.Scanner;

class NumeroPrimo {
	
	public static void main(String[] args) {
		
		int numero,i,cont = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero inteiro e positivo: ");
		numero = scan.nextInt();
		
		for(i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				cont++;
			}
		}
		
		if(cont == 2) {
			System.out.println("Eh primo");
		}
		else{
			System.out.println("Nao eh primo");
		}
		
	}
}
