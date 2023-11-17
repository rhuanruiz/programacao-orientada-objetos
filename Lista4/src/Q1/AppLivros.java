package Q1;

class AppLivros {
	
	public static void main(String[] args) {
		
		Livro livro1 = new Livro("Livro 1", "00", 10);
		Livro livro2 = new Livro("Livro 2", "01", 50);
		Livro livro3 = new Livro("Livro 3", "02", 30);
		
		System.out.println("Quantidades\n" + "Livro 1: " + livro1.quantidade + "\nLivro 2: " + livro2.quantidade + "\nLivro 3: " + livro3.quantidade);
		livro1.setQuantidade(20);
		livro2.setQuantidade(60);
		livro3.setQuantidade(40);
		System.out.println("Quantidades\n" + "Livro 1: " + livro1.getQuantidade() + "\nLivro 2: " + livro2.getQuantidade() + "\nLivro 3: " + livro3.getQuantidade());
	}
}
