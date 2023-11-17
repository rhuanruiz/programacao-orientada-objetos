package Q5;

class Pessoa {
	
	String nome, dataNascimento;
	
	Pessoa(){
		
	}
	Pessoa(String nome, String dataNascimento){
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public String toString() {
		Pessoa pessoa1 = new Pessoa("Chuck Norris", "01/01/01");
		return pessoa1.nome + pessoa1.dataNascimento;
	}

}
