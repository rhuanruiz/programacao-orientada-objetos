package Q5;

class Conta {
	
	String nome, numeroConta;
	double saldo, limite;
	
	Conta(String nome, String numeroConta, double saldo, double limite){
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		setLimite(limite);
	}
	
	void deposito(double valorDeposito) {
		saldo += valorDeposito;
	}
	void sacar(double valorSaque, double limite) {
		if(valorSaque <= limite) {
			System.out.println("true, saque permitido");
			saldo -= valorSaque;
		}
		else {
			System.out.println("false, saque acima do limite");
		}
	}
	void setLimite(double limite) {
		if(limite <= 880) {
			this.limite = limite;
		}
		else {
			this.limite = 880;
		}
	}
	
}
