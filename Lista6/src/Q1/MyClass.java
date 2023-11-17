package Q1;
import java.util.Scanner;

class MyClass {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Alunos aluno = new Alunos(5.0,7.0,9.0);
		System.out.println("Nome e data de nascimento: ");
		aluno.nome = scan.nextLine();
		aluno.dataNascimento = scan.nextLine();
		double media = (aluno.getNota1() + aluno.getNota2() + aluno.getNota3())/3.0;
		System.out.println(aluno.nome + " " + aluno.dataNascimento + " Media = " + media);	
	}
}
