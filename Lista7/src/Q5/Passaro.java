package Q5;

public class Passaro extends Animal {
	
	Passaro(double massa, String tamanho){
		this.massa = massa;
		this.tamanho = tamanho;
	}
	
	void comunicar() {
		System.out.println("Cantando");
	}
	void movimentar() {
		System.out.println("Voando");
	}
}
