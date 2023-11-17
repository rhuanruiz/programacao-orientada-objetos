package Q1;

class Pessoa {
	
	String nome, dataNascimento;
	
	Pessoa(){
		
	}
	
	Pessoa(String nome, String dataNascimento){
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	String getNome() {
		return nome;
	}
	String getDataNascimento() {
		return dataNascimento;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;;
	}
}
