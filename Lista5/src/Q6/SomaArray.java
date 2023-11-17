package Q6;
import java.util.Scanner;

class SomaArray {
	
	public static void main(String[] args) {
		
		int[] data1 = new int[2];
		int[] data2 = new int[4];
		int[] data3 = new int [6];
		int i;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite os valores de data1: ");	
		for(i = 0; i < 2; i++) {
			data1[i] = scan.nextInt();
			data3[i] = data1[i];
		}
		System.out.println("Digite os valores de data2: ");	
		for(i = 0; i < 4; i++) {
			data2[i] = scan.nextInt();
		}
		for(i = 0; i < 4; i++) {
			data3[i] = data1[i];
		}
		System.out.println("data3 = " + data3[6]);	
	}

}
