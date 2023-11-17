package Q2;

class Venda {
	
	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Produto 1", "01", 50.0, 200);
		Produto produto2 = new Produto("Produto 2", "02", 25.0,100);
		System.out.println("Estoque Produto 1: " + produto1.getQuantidadeEstoque() + " -- Estoque Produto 2: " + produto2.getQuantidadeEstoque());
		
		Item item1 = new Item("Item 1", "001", 50);
		Item item2 = new Item("Item 2", "002", 80);
		Item item3 = new Item("Item 3", "003", 100);
		
		produto1.setQuantidadeEstoque(produto1.getQuantidadeEstoque()-item1.quantidadeVendida);
		produto2.setQuantidadeEstoque(produto2.getQuantidadeEstoque()-item2.quantidadeVendida);
		System.out.println("\nEstoque pos venda\nProduto 1: " + produto1.getQuantidadeEstoque() + "\nProduto 2: " + produto2.getQuantidadeEstoque());
		
		System.out.println("\n--Item 1--\n" + "Produto vendido: Produto 1\nQuantidade Vendida: " + item1.getQuantidadeVendida() + "\nPreco unitario: " + produto1.getPreco() + "\nValor Pago: " + produto1.preco*item1.quantidadeVendida);
		System.out.println("\n--Item 2--\n" + "Produto vendido: Produto 2\nQuantidade Vendida: " + item2.getQuantidadeVendida() + "\nPreco unitario: " + produto2.getPreco() + "\nValor Pago: " + produto2.preco*item2.quantidadeVendida);
		System.out.println("\n--Item 3--\n" + "Produto vendido: Produto 1\nQuantidade Vendida: " + item3.getQuantidadeVendida() + "\nPreco unitario: " + produto1.getPreco() + "\nValor Pago: " + produto1.preco*item3.quantidadeVendida);
	}
}
