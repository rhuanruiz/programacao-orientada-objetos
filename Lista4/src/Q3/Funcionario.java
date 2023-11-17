package Q3;

class Funcionario {
	
	String nome, sexo, departamento;
	double salario;
	
	String getNome() {
		return nome;
	}
	String getSexo(){
		return sexo;
	}
	String getDepartamento() {
		return departamento;
	}
	double getSalario() {
		return salario;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	void setSexo(String sexo) {
		this.sexo = sexo;
	}
	void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	void setSalario(double salario) {
		this.salario = salario;
	}
	
	double aumentoSalario(double bonificacao) {
		return salario+bonificacao;
	}
	double ganhoAnual() {
		return salario*13;
	}
}
