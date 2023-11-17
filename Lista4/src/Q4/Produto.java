package Q4;
import java.util.Scanner;

class Produto {
	
	String nome;
	double precoCusto, precoVenda, percentual, lucro;
	
	String getNome() {
		return nome;
	}
	double getPrecoCusto() {
		return precoCusto;
	}
	double getPrecoVenda() {
		return precoVenda;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	void setPrecoVenda(double precoVenda) {
		while(precoVenda < precoCusto) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Preco de venda inferior ao de custo! Digite outro valor: ");
			precoVenda = scan.nextDouble();
		}
		this.precoVenda = precoVenda;
	}
	
	double calcularMargemLucro(double precoVenda, double precoCusto) {
		return precoVenda - precoCusto;
	}
	double getMargemLucro(double lucro, double precoCusto) {
		percentual = (lucro/precoCusto)*100;
		return percentual;
	}
	
}

