package Q5;

class Main {
	
	public static void main(String[] args) {
		
		System.out.println("---Homem---");
		Animal homem = new Homem(70,"Medio");
		homem.comunicar();
		homem.movimentar();
		System.out.println("Massa: " + homem.massa + " kg Tamanho: " + homem.tamanho);
		
		System.out.println("\n---Peixe---");
		Animal peixe = new Peixe(10,"Pequeno");
		peixe.comunicar();
		peixe.movimentar();
		System.out.println("Massa: " + peixe.massa + " kg Tamanho: " + peixe.tamanho);
		
		System.out.println("\n---Passaro---");
		Animal passaro = new Passaro(8,"Pequeno");
		passaro.comunicar();
		passaro.movimentar();
		System.out.println("Massa: " + passaro.massa + " kg Tamanho: " + passaro.tamanho);
		
	}
}
