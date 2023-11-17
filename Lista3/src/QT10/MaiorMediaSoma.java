package QT10;
import java.util.Scanner;

class MaiorMediaSoma {
	
	public static void main(String[] args) {
		
		int i;
		double maior = 0, soma = 0, media = 0;
		double[] v = new double[10];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dez valores positivos: ");
		
		for(i = 0; i < 10; i++) {
			v[i] = scan.nextDouble();
			soma += v[i];
			while(v[i] < 0) {
				System.out.println("Erro\nDigite um valor POSITIVO");
				v[i] = scan.nextDouble();
			}
			
			if(v[i] > maior) {
				maior = v[i];
			}
		}
		media = soma/10.0;
		System.out.println("Maior valor = " + maior);
		System.out.println("Soma dos valores = " + soma);
		System.out.println("Media aritmetica = " + media);
	}
}
