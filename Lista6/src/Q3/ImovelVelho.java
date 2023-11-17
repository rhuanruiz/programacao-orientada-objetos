package Q3;

class ImovelVelho extends Imovel {
	
	double desconto;
	
	ImovelVelho(double preco){
		this.desconto = preco - preco*0.3;
	}
	
	double getDesconto() {
		return desconto;
	}
	void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	void printDesconto(double desconto) {
		System.out.println(desconto);
	}
}
