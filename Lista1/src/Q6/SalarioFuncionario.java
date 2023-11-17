package Q6;
import java.util.Scanner;

class SalarioFuncionario {
	
	public static void main(String[] args) {
		
		int x;
		double salarioMinimo,salario,quantidade;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor do salario minimo:");
		salarioMinimo = scan.nextDouble();
		System.out.println("Digite o salario do funcionario:");
		salario = scan.nextDouble();
		quantidade = salario/salarioMinimo;
		System.out.println("O funcionario recebe " + quantidade + " salarios minimos");
		
	}
}
