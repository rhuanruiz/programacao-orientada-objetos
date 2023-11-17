package Q1;

class Quadrado extends Figura {
	
	double lado;
	
	Quadrado(double lado){
		this.lado = lado;
	}
	
	double calcularArea(double lado) {
		return lado*lado;
	}
}
