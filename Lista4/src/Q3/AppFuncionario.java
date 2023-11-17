package Q3;

class AppFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setSalario(10000);
		System.out.println("Salario: " + funcionario1.getSalario() + "\nCom bonificação: " + funcionario1.aumentoSalario(2000));
		System.out.println("Ganho Anual: " + funcionario1.ganhoAnual());
	}
}
