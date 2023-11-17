package Q3;

class Eletrodomestico {
	
	int ligado;
	
	Eletrodomestico(int ligado){
		this.ligado = ligado;
	}
	
	void imprimir() {
		if(ligado == 1) {
			System.out.println("Ligado");
		}
		else if(ligado == 0) {
			System.out.println("Desligado");
		}
	}
	
	void ligarDesligar(int ligado) {
		if(ligado == 1) {
			System.out.println("Desligando");
		}
		else if(ligado == 0) {
			System.out.println("Ligando");
		}
	}
}
