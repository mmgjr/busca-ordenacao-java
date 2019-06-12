package intercanlandoEmUmUnicoArray02;


public class testeIntercala {

	public static void main(String[] args) {
		
		Notas[] notas = {
				new Notas("andre",4),
				new Notas("mariana",5),
				new Notas("carlos",8.5),
				new Notas("paulo",9),
				new Notas("jonas",3),
				new Notas("juliana",6.7),
				new Notas("guilherme",7),
				new Notas("lucia",9.3),
				new Notas("ana",10)
		};

			
			intercala(notas,0,4,notas.length);
			
			
			for (Notas n : notas) {
				System.out.println(n.getAluno()+" "+n.getValor());
			}
			
			
		}

		private static void intercala(Notas[] notas,int inicio,int meio,int fim) {
			
			Notas[] resultado = new Notas[fim-inicio];
	
			int atual = 0;
			int atualLista1 = inicio;
			int atualLista2 = meio;
			
			while (atualLista1 < meio && atualLista2 < fim) {
				Notas nota1 = notas[atualLista1];
				Notas nota2 = notas[atualLista2];
			
				if(nota1.getValor() < nota2.getValor()) {
					resultado[atual] = nota1;
					atualLista1++;
				}else {
					resultado[atual] = nota2;
					atualLista2++;
				}
				
				atual++;
			}
			while (atualLista1 < meio) {
				resultado[atual] = notas[atualLista1];
				atual++;
				atualLista1++;
				
			}
			while (atualLista2 < fim) {
				resultado[atual] = notas[atualLista2];
				atual++;
				atualLista2++;
				
			}
			for (int contador = 0; contador < atual; contador++) {
				notas[inicio+contador] = resultado[contador];
			}
			
		}
}
