package QT10;

class Quadrado {
	
	double lado,area,perimetro;
	
	double getLado() {
		return lado;
	}
	void setLado(double lado) {
		this.lado = lado;
	}
	double calcularArea(double lado) {
		area = lado*lado;
		return area;
	}
	double calcularPerimetro(double lado) {
		perimetro = lado*4;
		return perimetro;
	}
}
