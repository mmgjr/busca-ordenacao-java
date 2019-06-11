package buscandoMenorComNull;

public class testaBuscaComNull {

	public static void main(String[] args) {
		
		
		Produtos[] produtos = {
				 new Produtos("Lamborghini",1000000),
				 new Produtos("Jipe",46000),
				 new Produtos("Brasília",16000),
				 new Produtos("Smart",47000),
				 new Produtos("Fusca",17000),
				 null,
				 null,
				 null
		};
	
		
		int maisBarato = buscaMenor(produtos,0,5);
		
		System.out.println(maisBarato);
		System.out.println("O carro "+produtos[maisBarato].getNome()+" é o mais barato custa "+produtos[maisBarato].getPreco());
	}

	private static int buscaMenor(Produtos[] produtos,int inicio,int tamanho) {
		int maisBarato = 0;
		
		for (int atual = inicio; atual < tamanho; atual++) {
			
			if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
				maisBarato = atual;
			}
			
		}
		return maisBarato;
	}


	}


