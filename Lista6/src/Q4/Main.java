package Q4;

class Main {
	
	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(2000);
		ContaPoupanca contaPoupanca = new ContaPoupanca(1000);
		
		contaCorrente.atualiza(0.1);
		contaPoupanca.atualiza(0.2);
		
		contaCorrente.depositar(1000);
		contaPoupanca.sacar(100);
		
		System.out.println("Saldo contaCorrente = " + contaCorrente.getSaldo() + " --- Saldo contaPoupanca = " + contaPoupanca.getSaldo());
		
	}

}
