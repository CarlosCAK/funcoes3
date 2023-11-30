package funcoes3;
import java.util.Scanner;
public class Questao7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numero ;
		
		System.out.println("Digite o número que deseja inverter: ");
		numero = sc.nextInt();
		
		int numeroInvertido = invertido(numero);
		
		
	}
	public static int invertido (int numero) {
		
		String numeroX = Integer.toString(numero);
		char caracter;
		String teste = null;
		
		for(int cont = numeroX.length(); cont > 0; cont--) {
			caracter = numeroX.charAt(cont);
			teste = Integer.toString(caracter);
		}
		int invertido = Integer.parseInt(teste);
		System.out.println(teste);
		return 0;
	}

}
