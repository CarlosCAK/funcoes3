package funcoes3;
import java.util.Scanner;
import java.util.Random;
public class Questao11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			String  Cifra;
			
			System.out.println("Qual a palavra que deseja cifrar");
			Cifra = sc.next();
			
			String numeroCifrado = numeroCifrado(Cifra);
			
				System.out.print(numeroCifrado);



	}
	public static String numeroCifrado (String cifra){
		
		Random random = new Random ();
		String teste;
		String codigo;
		int[] cifrado = new int [cifra.length()];
		char[] mudanca = new char [cifra.length()];
		for(int cont = 0; cont < cifra.length();cont++) {
			mudanca[cont] = cifra.charAt(cont);
			cifrado[cont] = (int) mudanca[cont];
			cifrado[cont] += 4;
			mudanca[cont] = (char) cifrado[cont];
		}
		codigo = new String (mudanca);
		
		return codigo;
	}

}
