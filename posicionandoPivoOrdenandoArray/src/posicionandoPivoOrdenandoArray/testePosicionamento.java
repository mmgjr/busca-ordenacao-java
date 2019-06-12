package posicionandoPivoOrdenandoArray;



public class testePosicionamento {

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
		
		quebraNoPivo(notas,0,notas.length);
		
		for (int i = 0; i < notas.length; i++) {
			Notas nota = notas[i];
			System.out.println(nota.getAluno()+" "+nota.getValor());
		}
		

	}

	private static void quebraNoPivo(Notas[] notas,int inicio,int fim) {
		
		Notas pivo = notas[fim-1];
		int menor = 0;
		
		for (int atual = 0; atual < fim-1; atual++) {
			
			Notas notaAtual = notas[atual];
		
			if(notaAtual.getValor() <= pivo.getValor()) {
				
				menor++;
			}
			
		}
		troca(notas,fim-1,menor);
	}

	private static void troca(Notas[] notas, int de, int para) {
		Notas nota1 = notas[de];
		Notas nota2 = notas[para];
		notas[de] = nota2;
		notas[para] = nota1;
	}

	

}
