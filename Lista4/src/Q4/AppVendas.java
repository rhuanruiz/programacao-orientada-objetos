package Q4;
import java.util.Scanner;

class AppVendas {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Produto produto1 = new Produto();
		System.out.println("------------Produto 1------------");
		System.out.println("Digite o preco custo e o preco venda: ");
		produto1.setPrecoCusto(scan.nextDouble());
		produto1.setPrecoVenda(scan.nextDouble());
		System.out.println("Lucro em moeda: " + produto1.calcularMargemLucro(produto1.getPrecoVenda(), produto1.getPrecoCusto()));
		System.out.println("Lucro em percentual: " + produto1.getMargemLucro(produto1.calcularMargemLucro(produto1.getPrecoVenda(), produto1.getPrecoCusto()), produto1.getPrecoCusto()) + "%");
		
		Produto produto2 = new Produto();
		System.out.println("\n------------Produto 2------------");
		System.out.println("Digite o preco custo e o preco venda: ");
		produto2.setPrecoCusto(scan.nextDouble());
		produto2.setPrecoVenda(scan.nextDouble());
		System.out.println("Lucro em moeda: " + produto2.calcularMargemLucro(produto2.getPrecoVenda(), produto2.getPrecoCusto()));
		System.out.println("Lucro em percentual: " + produto2.getMargemLucro(produto2.calcularMargemLucro(produto2.getPrecoVenda(), produto2.getPrecoCusto()), produto2.getPrecoCusto()) + "%");
		
		Produto produto3 = new Produto();
		System.out.println("\n------------Produto 3------------");
		System.out.println("Digite o preco custo e o preco venda: ");
		produto3.setPrecoCusto(scan.nextDouble());
		produto3.setPrecoVenda(scan.nextDouble());
		System.out.println("Lucro em moeda: " + produto3.calcularMargemLucro(produto3.getPrecoVenda(), produto3.getPrecoCusto()));
		System.out.println("Lucro em percentual: " + produto3.getMargemLucro(produto3.calcularMargemLucro(produto3.getPrecoVenda(), produto3.getPrecoCusto()), produto3.getPrecoCusto()) + "%");
		
	}
}
