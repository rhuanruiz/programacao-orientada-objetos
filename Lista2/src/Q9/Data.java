package Q9;

class Data {
	
	int horas,minutos,segundos,segundosConvertido;
	
	int getHoras() {
		return horas;
	}
	int getMinutos() {
		return minutos;
	}
	int getSegundos() {
		return segundos;
	}
	
	void setHoras(int horas) {
		this.horas = horas;
	}
	void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	void calcularTempoSegundos(int horas, int minutos, int segundos) {
		this.segundosConvertido = segundos + (horas*3600) + (minutos*60);
	}
	int getTempoSegundos() {
		return segundosConvertido;
	}
	
	public static void main(String [] args) {
		
		Data tempo1 = new Data();
		tempo1.setHoras(2);
		tempo1.setMinutos(30);
		tempo1.setSegundos(15);
		
		Data tempo2 = new Data();
		tempo2.setHoras(4);
		tempo2.setMinutos(0);
		tempo2.setSegundos(30);
		
		tempo1.calcularTempoSegundos(tempo1.getHoras(),tempo1.getMinutos(),tempo1.getSegundos());
		tempo2.calcularTempoSegundos(tempo2.getHoras(),tempo2.getMinutos(),tempo2.getSegundos());
		
		System.out.println("Tempo 1 em segundos = " + tempo1.getTempoSegundos() + "\nTempo 2 em segundos = " + tempo2.getTempoSegundos());
		System.out.println("Diferença = " + Math.abs(tempo1.getTempoSegundos()-tempo2.getTempoSegundos()));
	}
	
}
