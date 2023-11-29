package funcoes3;
import java.util.Scanner;
public class Questao2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			
			String cadeia1, cadeia2;
			
			System.out.println("Digite a primeira palavra");
			cadeia1 = sc.next();
			
			System.out.println("Digite a segunda palavra");
			cadeia2 = sc.next();
			
			boolean sim = verificacao(cadeia1,cadeia2);
			
			if(sim == true) {
			System.out.println("São iguais");
			}
			else {
				System.out.println("São diferentes");

			}
		
	}
	public static boolean verificacao (String cadeia1, String cadeia2) {
		boolean sim = false;
		
		
		
		if(cadeia1.length() == cadeia2.length()) {
			for(int cont = 0; cont < cadeia1.length();cont++) {
				if(cadeia1.charAt(cont) == cadeia2.charAt(cont)) {
					sim = true;
				}
				else {
					sim = false;
					break;
				}
			}
		}
		return sim;
	}

}
