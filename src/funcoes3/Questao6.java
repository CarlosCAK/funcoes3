package funcoes3;
import java.util.Scanner;
public class Questao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			
			int num[] = perfeitos();
			
			for( int cont = 0; cont < num.length;cont++ ) {
				if(num[cont] != 0 ) {
				System.out.println("Os números perfeitos são " + num[cont]);
				}
			}
			
		
			
	}
	public static int []perfeitos (){
		int perfeitos[] = new int [500];
		int soma = 0;
		
		for(int numero = 1; numero < 501; numero++) {
			for(int divisor = 1; divisor < numero; divisor++) {
				if(numero % divisor == 0 ) {
					soma+= divisor;
				}
				if (soma == numero) {
					perfeitos[numero] = numero;
				}
			}
			soma = 0;
		}
		
		return perfeitos;
	}

}
