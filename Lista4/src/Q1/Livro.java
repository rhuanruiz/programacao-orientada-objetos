package Q1;

class Livro {
	
	int quantidade;
	String nome,codigo;
	
	/*void setNome(String n) {
		this.nome = n;
	}*/
	
	Livro(String nome, String codigo, int quantidade){
		this.nome = nome;
		this.codigo = codigo;
		this.quantidade = quantidade;
	}
	
	String getNome() {
		return nome;
	}
	String getCodigo() {
		return codigo;
	}
	int getQuantidade() {
		return quantidade;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	void setQuantidade(int quantidade) {
		this.quantidade= quantidade;
	}
	
	/*public static void main(String[] args) {
		Livro livro1 = new Livro("Alo", "00", 1);
		System.out.println(livro1.nome + " " + livro1.codigo + " " + livro1.quantidade);
	}*/
}
