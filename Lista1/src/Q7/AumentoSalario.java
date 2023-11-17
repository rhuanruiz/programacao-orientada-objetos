package Q7;
import java.util.Scanner;

class AumentoSalario {
	
	public static void main(String[] args) {
		
		double salario,aumento,novoSalario;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o salario do funcionario: ");
		salario = scan.nextDouble();
		aumento = 0.25*salario;
		novoSalario = salario + aumento;
		System.out.println("Salario = " + salario + "\n" + "Aumento = " + aumento + "\n" + "Novo salario = " + novoSalario);
		
	}
}
