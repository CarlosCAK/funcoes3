package funcoes3;
import java.util.Scanner;
public class Questao9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			
			int numero1 = 0 ;
			int numero2 = 0;
			System.out.println("Digite 10 pares");
			
			for(int cont = 0; cont < 10; cont++) {
				numero1 = sc.nextInt();
				numero2 = sc.nextInt();
				
				int calculo = calculo(numero1, numero2);
				
				System.out.println("O resultado da multiplicação é: "+ calculo );
			}

			
			
	}
	public static int calculo(int numero1, int numero2){
		
		int calculo = 0 ;
	
		do {
			numero1 /= 2;
			
			numero2  *= 2;
			
			if (numero1 % 2 == 0 && numero2 % 2 == 0 ) {
				System.out.println(numero2+ "   "+ numero1);
				calculo += numero2;
				
				System.out.println(calculo);
			}
		}while (numero1 >= 2);
		return calculo;
	}

}
