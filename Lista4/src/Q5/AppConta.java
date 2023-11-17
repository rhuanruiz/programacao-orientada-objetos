package Q5;
import java.util.Scanner;

class AppConta {
	
	public static void main(String[] args) {
		
		Conta cliente1 = new Conta("Bond","007",7000,700);
		System.out.println("Cliente: " + cliente1.nome + "\nSaldo: " + cliente1.saldo);
		Scanner scan = new Scanner(System.in);
		System.out.println("Valor a ser depositado: ");
		cliente1.deposito(scan.nextDouble());
		System.out.println("Valor a ser sacado: ");
		cliente1.sacar(scan.nextDouble(), cliente1.limite);
		System.out.println("Saldo atual = " + cliente1.saldo);
	}
}
