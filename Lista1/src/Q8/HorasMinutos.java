package Q8;
import java.util.Scanner;

class HorasMinutos {
	
	public static void main(String[] args) {
		
		int hora,minuto,horaConvertida,totalMinutos,segundos;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite as horas:");
		hora = scan.nextInt();
		System.out.println("Digite os minutos:");
		minuto = scan.nextInt();
		horaConvertida = hora*60;
		totalMinutos = minuto + horaConvertida;
		segundos = totalMinutos*60;
		System.out.println("Hora convertida = " + horaConvertida + " min\n" + "Total minutos = " + totalMinutos + " min\n" + "Segundos = " + segundos + " s");
		
	}
}
