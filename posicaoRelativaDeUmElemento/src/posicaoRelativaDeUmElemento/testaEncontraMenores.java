package posicaoRelativaDeUmElemento;


public class testaEncontraMenores {

	public static void main(String[] args) {
		
		Notas guilherme = new Notas("guilherme",7);
		
		Notas[] notas = {
				new Notas("andre",4),
				new Notas("carlos",8.5),
				new Notas("ana",10),
				new Notas("jonas",3),
				new Notas("juliana",6.7),
				guilherme,
				new Notas("paulo",9),
				new Notas("mariana",5),
				new Notas("lucia",9.3)
				
		};
		
		int menores = encontraMenores(guilherme,notas);
		
		
		System.out.println(menores);

	}

	private static int encontraMenores(Notas busca, Notas[] notas) {
		
		int menor = 0;
		
		for (int atual = 0; atual < notas.length; atual++) {
			Notas nota = notas[atual];
			
			if(nota.getValor() < busca.getValor()) {
				menor++;
			}
		}
		
		return menor;
	}

}
