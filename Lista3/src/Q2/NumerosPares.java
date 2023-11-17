package Q2;
import java.util.Scanner;

class NumerosPares {
	
	public static void main(String[] args) {
		
		int min = 0, max = 100, i = 0, cont = 0;
		
		//While:
		
		System.out.println("Numeros pares While:");
		while(min <= max) {
			System.out.println(min);
			min += 2;
			cont +=2;
		}
		
		//Do-While:
		
		min -= cont;
		System.out.println("Numeros pares Do-While:");
		do {
			System.out.println(min);
			min+=2;
		}while(min <= max);
		
		//For:
		
		System.out.println("Numeros pares For:");
		min -= cont;
		for(i = min; i <= max; i++) {
			System.out.println(i);
			i++;
		}		
	}
}
