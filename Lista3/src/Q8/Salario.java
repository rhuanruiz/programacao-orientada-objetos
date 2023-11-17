package Q8;
import java.util.Scanner;

class Salario {
	
	public static void main(String[] args) {
		
		int i = 2005;
		double salarioInicial = 1000, percentual = 0.015, salarioNovo;
		salarioNovo = salarioInicial + salarioInicial*percentual;
		System.out.println("Ano 2005 " + "\nSalario: 1000.0" + "\nAno 2006 " + "\nSalario: " + salarioNovo);
		for(i = 2007; i <= 2016; i++) {
			percentual = percentual*2;
			salarioNovo = salarioNovo + (salarioNovo*percentual);
			System.out.println("Ano " + i + "\nSalario: " + salarioNovo);
		}
		
	}
}
