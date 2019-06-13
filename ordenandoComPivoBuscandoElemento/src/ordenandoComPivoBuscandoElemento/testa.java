package ordenandoComPivoBuscandoElemento;



public class testa {

	public static void main(String[] args) {
		Notas guilherme = new Notas("guilherme",7);
		
		Notas[] notas = {
				new Notas("andre",4),
				new Notas("carlos",8.5),
				new Notas("ana",10),
				new Notas("jonas",3),
				new Notas("juliana",6.7),
				new Notas("paulo",9),
				new Notas("lucia",9.3),
				new Notas("mariana",5),
				guilherme
				
		};
	
		int resp = busca(notas,0,notas.length,9.3);
		System.out.println("Encontrado na posição "+resp);
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i].getAluno()+" "+notas[i].getValor());
		}
	}

	private static int busca(Notas[] notas, int de, int ate, double buscando) {
		
		for (int atual = de; atual < ate; atual++) {
			if(notas[atual].getValor() == buscando) {
				return atual;
			}
		}
		return -1;
	}


}
