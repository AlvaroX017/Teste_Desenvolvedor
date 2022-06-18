package inverterString;

import java.util.Locale;
import java.util.Scanner;

public class MainIS {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Digite o valor:");
		String invertS = keyboard.nextLine();
		
		String[] invertSplit = invertS.split("");
		
		for(int j = invertSplit.length-1; j >= 0; j--) {
			System.out.print(invertS.charAt(j));}
		
		keyboard.close();

	}

}
