package Q6;
import java.util.Scanner;

class DiaSemana {
	
	public static void main(String[] args) {
	
		int dia,nome;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o dia da semana (numero):");
		dia = scan.nextInt();
		if(dia == 1) {
			System.out.println("Domingo");
		}
		else if(dia == 2) {
			System.out.println("Segunda");
		}
		else if(dia == 3) {
			System.out.println("Terca");
		}
		else if(dia == 4) {
			System.out.println("Quarta");
		}
		else if(dia == 5) {
			System.out.println("Quinta");
		}
		else if(dia == 6) {
			System.out.println("Sexta");
		}
		else if(dia == 7) {
			System.out.println("Sabado");
		}
		else {
			System.out.println("Valor invalido");
		}
	}
}
