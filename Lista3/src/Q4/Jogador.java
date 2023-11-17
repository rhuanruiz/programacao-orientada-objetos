package Q4;
import java.util.Scanner;

class Jogador {
	
	int idade;
	double peso;
	String nome;
	
	double getPeso() {
		return peso;
	}
	void setPeso(double peso) {
		this.peso = peso;
	}
	
	public static void main(String[] args) {
		
		int i = 0;
		int[] v = new int[5];
		
		Scanner scan = new Scanner(System.in);
		for(i = 1; i<=5; i++) {
			Jogador jogador = new Jogador();
			jogador.peso = scan.nextDouble();			
		}
	}
}
