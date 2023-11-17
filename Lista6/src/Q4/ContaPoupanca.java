package Q4;

class ContaPoupanca extends Conta {
	
	ContaPoupanca(double saldo){
		this.saldo = saldo;
	}
	void atualiza(double percentual) {
		saldo = saldo + (saldo*percentual*3);
	}
}
