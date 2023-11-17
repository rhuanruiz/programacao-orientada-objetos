package Q3;

class ImovelNovo extends Imovel {
	
	double adicional;
	ImovelNovo(double preco){
		this.adicional = preco + preco*0.1;
	}
	
	double getAdicional() {
		return adicional;
	}
	void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	void printAdicional(double adicional) {
		System.out.println(adicional);
	}
}
