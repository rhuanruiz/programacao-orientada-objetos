package Q7;
import java.util.Scanner;

class Banco {
	
	public static void main(String[] args) {
		
		double salarioBruto,descontos,salarioLiquido,emprestimoNecessario,emprestimoMaximo;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o salario bruto e descontos:");
		salarioBruto = scan.nextDouble();
		descontos = scan.nextDouble();
		salarioLiquido = salarioBruto - descontos;
		emprestimoMaximo = salarioLiquido*0.3;
		System.out.println("Digite o valor do emprestimo:");
		emprestimoNecessario = scan.nextDouble();
		
		if(emprestimoNecessario <= emprestimoMaximo) {
			System.out.println("E possivel realizar o emprestimo");
		}
		else {
			System.out.println("Nao e possivel realzar o emprestimo");
		}
	}
}
