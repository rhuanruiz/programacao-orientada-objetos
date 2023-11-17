package Q9;
import java.util.Scanner;

class ContaEnergia {
	
	public static void main(String[] args) {
		
		double salarioMinimo,kwConsumido,kwValor,boleto,boletoDesconto;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor do salario minimo:");
		salarioMinimo = scan.nextDouble();
		kwValor = salarioMinimo/5.0;
		System.out.println("Digite a quantidade de kw cosumido:");
		kwConsumido = scan.nextDouble();
		boleto = kwValor*kwConsumido;
		boletoDesconto = boleto - boleto*0.15;
		System.out.println("Valor do kw = " + kwValor + "\n" + "Valor a ser pago = " + boleto + "\n" + "Com desconto = " + boletoDesconto);
		
	}
}
