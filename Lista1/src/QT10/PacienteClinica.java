package QT10;
import java.util.Scanner;

class PacienteClinica {
	
	String nome,sexo;
	double peso,altura;
	int idade;
	
	String getNome() {
		return nome;
	}
	String getSexo() {
		return sexo;
	}
	double getPeso() {
		return peso;
	}
	double getAltura() {
		return altura;
	}
	int getIdade() {
		return idade;
	}
	
	void setNome() {
		this.nome = nome;
	}
	void setSexo() {
		this.sexo = sexo;
	}
	void setPeso() {
		this.peso = peso;
	}
	void setAltura() {
		this.altura = altura;
	}
	void setIdade() {
		this.idade = idade;
	}
	
	public static void main(String[] args) {
		
		PacienteClinica paciente = new PacienteClinica();
		paciente.setNome();
		
		
	}
}
