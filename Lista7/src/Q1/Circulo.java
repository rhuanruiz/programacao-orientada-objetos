package Q1;

class Circulo extends Figura {
	
	double raio;
	
	Circulo(double raio){
		this.raio = raio;
	}
	
	double calcularArea(double raio) {
		return 3.14*raio*raio;
	}

}
