package Q2;

class Item {
	
	int quantidadeVendida;
	String codigo, produto;
	
	Item(String produto, String codigo, int quantidadeVendida){
		this.produto = produto;
		this.codigo = codigo;
		this.quantidadeVendida = quantidadeVendida;
	}
	
	String getProduto() {
		return produto;
	}
	String getCodigo() {
		return codigo;
	}
	int getQuantidadeVendida() {
		return quantidadeVendida;
	}
	
	void setProduto(String produto) {
		this.produto = produto;
	}
	void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	void setQuantidadeVendida(int quantidadeVendida) {
		this.quantidadeVendida = quantidadeVendida;
	}
}
