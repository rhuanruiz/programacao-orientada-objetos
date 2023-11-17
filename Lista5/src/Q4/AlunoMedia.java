package Q4;
import java.util.Scanner;

class AlunoMedia {
	
	public static void main(String[] args) {
		
		String [] Aluno = new String[5];
		double [] Media = new double[5];
		String alunoMedia = "";
		double maiorMedia = 0;
		int i,j;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome dos alunos: ");
		for(j = 0; j < 5; j++) {
			Aluno[j] = scan.nextLine();
			//Media[j] = scan.nextDouble();
		}
		System.out.println("Agora digite suas respectivas notas: ");
		for(j = 0; j < 5; j++) {
			Media[j] = scan.nextDouble();
		}
		
		for(j = 0; j < 5; j++) {
			if(Media[j] < 5) {
				System.out.println(Aluno[j] + " reprovado");
			}
			else if(Media[j] == maiorMedia) {
				System.out.println();
			}
			else if(Media[j] > maiorMedia) {
				maiorMedia = Media [j];
				alunoMedia = Aluno[j];
			}
		}
		System.out.println(alunoMedia + " tem a maior media = " + maiorMedia);
	}
}
