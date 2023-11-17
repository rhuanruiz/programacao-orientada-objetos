package Q1;
import java.util.Scanner;

class MediaNota {
	
	public static void main(String[] args) {
		
		double nota1,nota2,nota3,media;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite as tres notas do aluno:");
		nota1 = scan.nextDouble();
		nota2 = scan.nextDouble();
		nota3 = scan.nextDouble();
		media = (nota1 + nota2 + nota3)/3.0;
		if(media >= 0.0 && media < 3.0) {
			System.out.println("Media = " + media + " --- Reprovado");
		}
		else if(media >= 3.0 && media < 7.0) {
			System.out.println("Media = " + media + " --- Prova Final");
		}
		else if(media >= 7.0 && media <= 10.0) {
			System.out.println("Media = " + media + " --- Aprovado");
		}
		else {
			System.out.println("Valor inválido");
		}
	}
	
}
