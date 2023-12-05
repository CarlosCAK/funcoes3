package funcoes3;
import java.util.Scanner;
public class Questao8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			
			int caracteristicos[] = caracteristicos();
			
			for(int cont = 0; cont < caracteristicos.length; cont++) {
				if(caracteristicos[cont] != 0 ) {
					System.out.println(caracteristicos[cont]);
				}
			}
			
		
	}
	public static int []caracteristicos(){
		int caracteristicos[] = new int [9999];
		String numeroTeste, numeroTeste1;
		char teste[] = new char [2];
		char teste1[] = new char [2];
		int inteiroSoma, inteiroSoma1,inteiroSomaTotal = 0 , inteiroMult;
		
		for(int numero = 1000; numero < 9999;numero++) {
			
			numeroTeste = null; numeroTeste1 = null; 
			inteiroSoma = 0; inteiroSoma1 = 0; inteiroSomaTotal= 0 ; inteiroMult = 0;;
			numeroTeste = Integer.toString(numero);
			for(int cont = 0; cont < 2;cont++) {
					teste[cont] = numeroTeste.charAt(cont);
				
				
		}
			for(int cont = 2; cont < 4;cont++) {
					teste1[(cont - 2) ] = numeroTeste.charAt(cont);
			}
			numeroTeste = new String (teste);
			numeroTeste1 = new String (teste1);

			
			inteiroSoma = Integer.parseInt(numeroTeste);
			inteiroSoma1 = Integer.parseInt(numeroTeste1);
			
			inteiroSomaTotal = inteiroSoma + inteiroSoma1;
			
			inteiroMult = inteiroSomaTotal * inteiroSomaTotal;
			
			if(numero == inteiroMult) {
				caracteristicos[numero] = numero;
			}
			
			
		
	
	}
		return caracteristicos;
}
}
