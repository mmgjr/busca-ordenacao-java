package ordenandoPorInsercao;

public class testa {

	public static void main(String[] args) {
		Carro[] carros = {
				new Carro("Lamborghini",1000000),
				new Carro("Jipe",46000),
				new Carro("Brasília",16000),
				new Carro("Smart",47000),
				new Carro("Fusca",17000),
					
					
			};
			
			
			novoSort(carros,carros.length);
			
			imprimir(carros);
			
		}
	private static void imprimir(Carro[] carros) {
		for (Carro carro : carros) {
			System.out.println(carro.getNome()+" "+carro.getPreco());
		}
	}
	private static void novoSort(Carro[] carros, int length) {
		
		for (int atual = 1; atual < length; atual++) {
			//System.out.println("Estou na casinha " + atual);
			int analise = atual;
			
			while (analise > 0 && carros[analise].getPreco() < carros[analise-1].getPreco()) {
				troca(carros, analise,analise-1);
				analise--;
			}
		}
		
	}
	private static void troca(Carro[] carros, int analise,int menosUm ) {
		
		Carro carroAnalise = carros[analise];
		Carro carroMenos = carros[menosUm];
		
		carros[analise] = carroMenos;
		carros[menosUm] = carroAnalise;
		
	}

}
