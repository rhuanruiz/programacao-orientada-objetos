package Q4;

class Conta {
	
	double saldo;
	
	double getSaldo() {
		return saldo;
	}
	void sacar(double valor) {
		saldo = saldo - valor;
	}
	void depositar(double valor) {
		saldo = saldo + valor;
	}
	void taxaPercentual(double percentual) {
		saldo = saldo + (saldo*percentual);
	}
}
