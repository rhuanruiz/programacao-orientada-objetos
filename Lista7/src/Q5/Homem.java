package Q5;

class Homem extends Animal {
	
	Homem(double massa, String tamanho){
		this.massa = massa;
		this.tamanho = tamanho;
	}
	
	void comunicar() {
		System.out.println("Falando");
	}
	
	void movimentar() {
		System.out.println("Andando");
	}

}
