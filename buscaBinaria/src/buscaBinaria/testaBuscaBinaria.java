package buscaBinaria;



public class testaBuscaBinaria {

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
		int resp = busca(notas,0,notas.length,7);
		if(resp >= 0) {
			System.out.println("Encontrado na posição "+resp);
		}else {
			System.out.println("Não foi possível encontrar o elemento");
		}
		
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i].getAluno()+" "+notas[i].getValor());
		}
	}

	private static int busca(Notas[] notas, int de, int ate, double buscando) {
		//System.out.println("Buscando "+buscando+" entre "+de+" e "+ate);
		int meio = (de+ate)/2;
		//System.out.println(meio);
		Notas nota = notas[meio];
		if(de>ate) {
			return -1;
		}
		if(buscando == nota.getValor()) {
			return meio;
		}
		if(buscando < nota.getValor()) {
			return busca(notas,de,meio-1,buscando);
		}
		
		return busca(notas,meio+1,ate,buscando);
		
	}

	private static void ordenar(Notas[] notas, int de, int ate) {
	
		int qtd = ate - de;
		
		if(qtd > 1) {
			int pivo = particiona(notas,de,ate);
		
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
