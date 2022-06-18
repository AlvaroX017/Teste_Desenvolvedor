package faturamentoMensalDistri;

import java.util.Locale;

public class MainFMD {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String[] names = {"SP", "RJ" ,"MG","ES","Outros"};
		double[] valores = { 67836.43, 36678.66, 29229.88, 27165.48, 19849.53};
		
		
		double soma =0;
		for(int i= 0; i < valores.length; i++){
			soma+=valores[i];
		}
		
		
		double porcentagem = 0;
		for(int i= 0; i < valores.length; i++){
			porcentagem = (valores[i]*100)/soma;
			System.out.println("O percentual de representação de " + names[i]+ " é de "+String.format("%.2f", porcentagem)+"%.");
		}
	}

}
