package Q1;

class Triangulo extends Figura {
	
	double lado1,lado2,lado3,base,altura;
	
	Triangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	double calcularArea(double base, double altura) {
		return base*altura;
	}
}
