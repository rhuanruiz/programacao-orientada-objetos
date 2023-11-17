package Q5;

class Peixe extends Animal{
	
	Peixe(double massa, String tamanho){
		this.massa = massa;
		this.tamanho = tamanho;
	}
	
	void comunicar() {
		System.out.println("glub glub");
	}
	void movimentar() {
		System.out.println("Nadando");
	}
}
