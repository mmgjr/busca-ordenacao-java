package buscaMenorPreco;

public class testaMenorPreco {

	public static void main(String[] args) {
		
		double precos[] = new double[5];
		precos[0] = 1000000;
		precos[1] = 46000;
		precos[2] = 17000;
		precos[3] = 47000;
		precos[4] = 16000;
		
		
		int maisBarato = 0;
		
		for (int atual = 0; atual < precos.length; atual++) {
		
			if(precos[atual] < precos[maisBarato]) {
				maisBarato = atual;
			}
			
			
		}

		System.out.println(maisBarato);
		System.out.println("O valor mais barato é "+precos[maisBarato]);
			
	}

}
