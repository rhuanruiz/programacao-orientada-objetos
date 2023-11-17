package Q3;
import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		int x;
		//Imovel imovel = new Imovel(100000);
		System.out.println("Digite 1 para imovel novo ou 2 para imovel velho:");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		if(x == 1) {
			ImovelNovo imovelNovo = new ImovelNovo(100000);
			System.out.println("Imovel Novo -- Valor: " + imovelNovo.getAdicional());
		}
		else if(x == 2) {
			ImovelVelho imovelVelho = new ImovelVelho(100000);
			System.out.println("Imovel Velho -- Valor: " + imovelVelho.getDesconto());
		}
		
		
	}
}
