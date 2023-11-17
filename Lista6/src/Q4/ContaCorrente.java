package Q4;

class ContaCorrente extends Conta {
	
	ContaCorrente(double saldo){
		this.saldo = saldo;
	}
	void atualiza(double percentual) {
		saldo = saldo + (saldo*percentual*2);
	}
	void depositar(double valor) {
		saldo = saldo + valor;
		saldo = saldo - 0.10;
	}
}
