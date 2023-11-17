package Q2;
import java.util.Scanner;

class Categoria {
	
	public static void main(String[] args) {
		
		int idade;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a idade do nadador:");
		idade = scan.nextInt();
		if(idade >= 0 && idade <= 10) {
			System.out.println("Infantil");
		}
		else if(idade >= 11 && idade <= 15) {
			System.out.println("Jovem");
		}
		else if(idade >= 16 && idade <= 30) {
			System.out.println("Adolescente");
		}
		else if(idade >= 31 && idade <= 45) {
			System.out.println("Adulto");
		}
		else {
			System.out.println("Sênior");
		}
		
	}
}
