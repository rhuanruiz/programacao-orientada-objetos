package QT10;

class AppQuadrado {
	
	public static void main(String[] args) {
		
		double maiorArea;
		Quadrado quadrado1 = new Quadrado();
		quadrado1.setLado(2);
		quadrado1.calcularArea(quadrado1.getLado());
		quadrado1.calcularPerimetro(quadrado1.getLado());
		
		Quadrado quadrado2 = new Quadrado();
		quadrado2.setLado(4);
		quadrado2.calcularArea(quadrado2.getLado());
		quadrado2.calcularPerimetro(quadrado2.getLado());
		
		Quadrado quadrado3 = new Quadrado();
		quadrado3.setLado(6);
		quadrado3.calcularArea(quadrado3.getLado());
		quadrado3.calcularPerimetro(quadrado3.getLado());
		
		if(quadrado1.area > quadrado2.area && quadrado1.area > quadrado3.area) {
			System.out.println("Maior area -- quadrado 1 = " + quadrado1.area);
		}
		else if(quadrado2.area > quadrado1.area && quadrado2.area > quadrado3.area) {
			System.out.println("Maior area -- quadrado 2 = " + quadrado2.area);
		}
		else {
			System.out.println("Maior area -- quadrado 3 = " + quadrado3.area);
		}
		
		if(quadrado1.perimetro > quadrado2.perimetro && quadrado1.perimetro > quadrado3.perimetro) {
			System.out.println("Maior perimetro -- quadrado 1 = " + quadrado1.perimetro);
		}
		else if(quadrado2.perimetro > quadrado1.perimetro && quadrado2.perimetro > quadrado3.perimetro) {
			System.out.println("Maior perimetro -- quadrado 2 = " + quadrado2.perimetro);
		}
		else {
			System.out.println("Maior perimetro -- quadrado 3 = " + quadrado3.perimetro);
		}
		
	}
}
