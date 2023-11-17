package Q2;

class Main {
	
	public static void main(String[] args) {
		
		ControleRemoto controle = new ControleRemoto();
		
		controle.aumentarVolume();
		controle.aumentarVolume();
		controle.aumentarVolume();
		controle.aumentarVolume();
		
		controle.proximoCanal();
		controle.proximoCanal();
		controle.proximoCanal();
		controle.proximoCanal();
		
		System.out.println("Volume = " + controle.getVolume() + " Canal = " + controle.getCanal());
		
	}
}
