package buscaMenorPrecoComOO02;

public class testaBuscaProdutos {

	public static void main(String[] args) {
		
		Produtos[] produtos = new Produtos[5];
		produtos[0] = new Produtos("Lamborghini",1000000);
		produtos[1] = new Produtos("Jipe",46000);
		produtos[2] = new Produtos("Brasília",16000);
		produtos[3] = new Produtos("Smart",47000);
		produtos[4] = new Produtos("Fusca",17000);
	
		
		int maisBarato = buscaMenor(produtos);
		
		System.out.println(maisBarato);
		System.out.println("O carro "+produtos[maisBarato].getNome()+" é o mais barato custa "+produtos[maisBarato].getPreco());
	}

	private static int buscaMenor(Produtos[] produtos) {
		int maisBarato = 0;
		
		for (int atual = 0; atual < produtos.length; atual++) {
			
			if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
				maisBarato = atual;
			}
			
		}
		return maisBarato;
	}

}
