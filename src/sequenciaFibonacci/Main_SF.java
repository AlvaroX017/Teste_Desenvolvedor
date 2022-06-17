package sequenciaFibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main_SF {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Digite um n�mero inteiro:");
		int n = keyboard.nextInt();
		
		List<Integer> sequen = new ArrayList<>();
		
		int som1 = 0;
		int som2 = 1;
		sequen.add(som1);
		sequen.add(som2);
		for(int i = 0; i < n; i++) {
			sequen.add(som1 += som2);
			sequen.add(som2 += som1);
		}
		
		for(Integer c : sequen) {
			if(n == c || n == c) {
				System.out.println("O n�mero "+n+" est� na sequ�ncia!");
				return;
			}
		}
		
		System.out.println("O n�mero "+n+" n�o est� na sequ�ncia!");
		
		keyboard.close();
	}

}
