package Q2;

class ControleRemoto extends Televisao {
	
	int volume, canal;
	
	ControleRemoto(){
		this.volume = 90;
		this.canal = 0;
	}
	
	int getVolume() {
		return volume;
	}
	int getCanal() {
		return canal;
	}
	void setCanal(int canal) {
		this.canal = canal;
	}
	
	void aumentarVolume() {
		volume = volume + 1;
	}
	void diminuirVolume() {
		volume = volume - 1;
	}
	void proximoCanal() {
		canal = canal + 1;
	}
	void anteriorCanal() {
		canal = canal - 1;
	}
		

}
