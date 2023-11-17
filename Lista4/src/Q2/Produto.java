package Q2;

class Produto {
	
	int quantidadeEstoque;
	String nome, codigo;
	double preco;
	
	Produto(String nome, String codigo, double preco, int quantidadeEstoque){
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	String getNome() {
		return nome;
	}
	String getCodigo() {
		return codigo;
	}
	double getPreco() {
		return preco;
	}
	int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	void setPreco(double preco) {
		this.preco = preco;
	}
	void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
}
