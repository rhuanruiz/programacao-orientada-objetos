package Q5;

class PessoaIMC extends Pessoa {
	
	double peso, altura, imc;
	
	PessoaIMC(String nome, String dataNascimento, double peso, double altura){
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.peso = peso;
		this.altura = altura;
	}
	
	double calcularIMC(double altura, double peso) {
		imc = peso/altura*altura;
		return imc;
	}
	
	String resultIMC() {
		String imcString = String.valueOf(imc);
		return imcString;
	}
	
}

