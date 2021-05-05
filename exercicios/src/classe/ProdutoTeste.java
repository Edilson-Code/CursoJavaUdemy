package classe;

public class ProdutoTeste 
{
	public static void main(String[] args) 
	{
		Produto prod1 = new Produto();
		Produto prod2 = new Produto();
		
		prod1.nome = "Caneta";
		prod1.preco = 5.50;
		prod1.desconto = 0.25;
		
		prod2.nome = "Plca de Video";
		prod2.preco = 8999.00;
		prod2.desconto = 0.35;
		
		System.out.println(prod1.nome);
		System.out.println(prod2.nome);
		
		double precoFinal1 = prod1.preco * (1  - prod1.desconto);
		double precoFinal2 = prod2.preco * (1  - prod2.desconto);
		double mediaCarrinho = (precoFinal1 + precoFinal2) /2;
		
		System.out.printf("Média do carrinho = R$%.2f", mediaCarrinho);
	}
}
