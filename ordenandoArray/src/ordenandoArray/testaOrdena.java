package ordenandoArray;

public class testaOrdena {

	public static void main(String[] args) {
		
		Carro[] carros = {
			new Carro("Lamborghini",1000000),
			new Carro("Jipe",46000),
			new Carro("Brasília",16000),
			new Carro("Smart",47000),
			new Carro("Fusca",17000),
				
				
		};
		
		ordenar(carros);
		
		for (Carro carro : carros) {
			System.out.println(carro.getNome()+" "+carro.getPreco());
		}
		
	}

	private static void ordenar(Carro[] carros) {
		for (int atual = 0; atual < carros.length; atual++) {
			int menor = buscaMenor(carros,atual,carros.length);
			Carro carro1 = carros[atual];
			Carro carro2 = carros[menor];
			carros[atual] = carro2;
			carros[menor] = carro1;
			
		}
	}

	private static int buscaMenor(Carro[] carros, int inicio, int fim) {
		int maisBarato = inicio;
		
		for (int atual = inicio; atual < fim; atual++) {
			
			if(carros[atual].getPreco() < carros[maisBarato].getPreco()) {
				maisBarato = atual;
			}
		}
			
		return maisBarato;
	}

}
