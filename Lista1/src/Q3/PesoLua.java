package Q3;
import java.util.Scanner;

//Massa ou força peso?

class PesoLua {
	
	public static void main(String[] args) {
		
		double pesoTerra,pesoLua;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu peso em kg:");
		pesoTerra = scan.nextDouble();
		pesoLua = pesoTerra*0.17;
		System.out.println(pesoLua + " kg");
		
	}
}
