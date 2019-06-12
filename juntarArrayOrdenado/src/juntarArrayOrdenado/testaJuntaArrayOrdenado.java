package juntarArrayOrdenado;

public class testaJuntaArrayOrdenado {

	public static void main(String[] args) {
		
		Notas[] lista1 = {
			new Notas("andre",4),
			new Notas("mariana",5),
			new Notas("carlos",8.5),
			new Notas("paulo",9)
			
		};
		
		Notas[] lista2 = {
				new Notas("jonas",3),
				new Notas("juliana",6.7),
				new Notas("guilherme",7),
				new Notas("lucia",9.3),
				new Notas("ana",10)
			};

		
		Notas[] rank = junta(lista1,lista2);
		
		
		for (Notas n : rank) {
			System.out.println(n.getAluno()+" "+n.getValor());
		}
		
		
	}

	private static Notas[] junta(Notas[] lista1, Notas[] lista2) {
		
		int total = lista1.length + lista2.length;
		
		Notas[] result = new Notas[total];
		
		int atual = 0;
		int atualLista1 = 0;
		int atualLista2 = 0;
		
		while (atualLista1 < lista1.length && atualLista2 < lista2.length) {
			Notas nota1 = lista1[atualLista1];
			Notas nota2 = lista2[atualLista2];
		
			if(nota1.getValor() < nota2.getValor()) {
				result[atual] = nota1;
				atualLista1++;
			}else {
				result[atual] = nota2;
				atualLista2++;
			}
			
			atual++;
		}
		while (atualLista1 < lista1.length) {
			result[atual] = lista1[atualLista1];
			atual++;
			atualLista1++;
			
		}
		while (atualLista2 < lista2.length) {
			result[atual] = lista2[atualLista2];
			atual++;
			atualLista2++;
			
		}
		
		return result;
	}

}
