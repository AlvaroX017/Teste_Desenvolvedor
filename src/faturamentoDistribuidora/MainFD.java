package faturamentoDistribuidora;

import java.util.Locale;


public class MainFD {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double[] valores = {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258, 46251.174, 
				11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826, 43829.1667, 18235.6852, 
				4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61};
		
		
		
		double menor = 99999999;
		for(int i = 0; i < valores.length; i++) {
			if(valores[i] !=0 && valores[i] < menor) {
				menor = valores[i];
			}
		}
		System.out.println("O menor valor de faturamento foi: "+ menor);
		
		double maior = -1;
		for(int i = 0; i < valores.length; i++) {
			if(valores[i] !=0 && valores[i] > maior) {
				maior = valores[i];
			}
		}
		System.out.println("O maior valor de faturamento foi: "+ maior);
		
		int cont = 0;
		double som = 0;
		for(int i = 0; i < valores.length; i++) {
			if(valores[i] !=0  ) {
				cont++;
				som += valores[i];
			}
		}
		double media = som / cont;
		
		System.out.println();
		System.out.println("Faturamentos acima da média:");
		for(int i = 0; i < valores.length; i++) {
			if(valores[i] !=0 && valores[i] > media) {
				System.out.println("O dia "+( i +1)+" tem o valor de "+valores[i]);
			}
		}
    }


}
