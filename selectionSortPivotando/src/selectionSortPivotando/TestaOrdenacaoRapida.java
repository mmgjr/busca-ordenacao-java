package selectionSortPivotando;



public class TestaOrdenacaoRapida {

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
		ordenar(notas,0,notas.length);
		
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i].getAluno()+" "+notas[i].getValor());
		}
	}

	private static void ordenar(Notas[] notas, int de, int ate) {
		System.out.println("de "+de+" ate "+ate);
		int qtd = ate - de;
		System.out.println("Elementos "+qtd);
		if(qtd > 1) {
			int pivo = particiona(notas,de,ate);
			System.out.println("Pivô "+pivo);
			ordenar(notas,de,pivo);
			ordenar(notas,pivo+1,ate);
		}
		
	}

	private static int particiona(Notas[] notas,int ini,int fim) {
		Notas pivo = notas[fim-1];
		int menor = 0;
		for (int atual = 0; atual < fim-1; atual++) {
			Notas notaAtual = notas[atual];
			if(notaAtual.getValor() <= pivo.getValor()) {
				trocar(notas,atual,menor);
				menor++;
			}
		}
		trocar(notas,fim-1,menor);
		
		return menor;
	}

	private static void trocar(Notas[] notas, int pivo, int menor) {
		Notas nota1 = notas[pivo];
		Notas nota2 = notas[menor];
		notas[menor] = nota1;
		notas[pivo] = nota2;
		
	}
}
