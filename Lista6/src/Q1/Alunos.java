package Q1;

class Alunos extends Pessoa {
	
	double nota1, nota2, nota3;
	
	Alunos(double nota1, double nota2, double nota3){
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	double getNota1() {
		return nota1;
	}
	double getNota2() {
		return nota2;
	}
	double getNota3() {
		return nota3;
	}
	
	void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	void setNota2(double nota) {
		this.nota2 = nota2;
	}
	void setNota3(double nota3) {
		this.nota3 = nota3;
	}
}
