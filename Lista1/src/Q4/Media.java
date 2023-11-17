package Q4;
import java.util.Scanner;

class Media {
	
	public static void main(String[] args) {
		
		int a,b,c;
		double media;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite tres numeros inteiros:");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		media = (a + b + c)/3.0;
		System.out.println("Media = " + media);
		
	}
}
