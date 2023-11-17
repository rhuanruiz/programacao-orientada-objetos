package Q1;
import java.util.Scanner;

class SomaNumeros {
	
	public static void main(String[] args) {
		
		int a, b, soma = 0, min, max, i = 0, cont = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite dois numeros diferentes, inteiros e positivos:");
		a = scan.nextInt();
		b = scan.nextInt();
		if(a < b) {
			min = a;
			max = b;
		}
		else {
			min = b;
			max = a;
		}
		
		//While:
		
		min++;
		while(min < max) {
			soma = soma + min;
			min++;
			cont++;
		}
		System.out.println("Soma while = " + soma);
		
		//Do-While:
		
		soma = 0;
		min = min - cont;
		do {
			soma = soma + min;
			min++;
		} while (min < max);
		System.out.println("Soma Do-While = " + soma);
		
		//For:
		
		soma = 0;
		min = min - cont;
		for(i = min; i < max; i++) {
			soma = soma + i;
		}
		System.out.println("Soma for = " + soma);
	}
}
