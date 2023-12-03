package funcoes3;
import java.util.Scanner;
public class Questao7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numero ;
		
		System.out.println("Digite o número que deseja inverter: ");
		numero = sc.nextInt();
		
		char inverso[] = invertido(numero);
		
		for(int cont = 0; cont < inverso.length;cont++) {
			System.out.print(inverso[cont]);
		}
		System.out.println("\n");
		int palindromos[] = palindromos();
		
		for(int cont = 0; cont < palindromos.length;cont++) {
			if(palindromos[cont] != 0 ) {
				System.out.println(palindromos[cont]);
			}
		}
		
		
		
	}
	public static char []invertido (int numero) {
		
		String numeroX = Integer.toString(numero);
		char caracter[] = new char [numeroX.length()] ;
		int aux = numeroX.length();
		for(int cont = 0; cont < numeroX.length(); cont++) {
			caracter[cont] = numeroX.charAt((aux - 1) - cont);
		}
		return caracter;
		
		
	}
	public static int []palindromos(){
		int palindromos[] = new int [10000];
		int invertido;
		String numero;
		char teste[] = new char [4];
		
		for(int cont = 1000; cont < 10000; cont++) {
		
			numero = Integer.toString(cont);
			int aux = numero.length();
			for(int cont1 = 0; cont1 < numero.length(); cont1 ++) {
				teste[cont1] = numero.charAt(( aux - 1) - cont1);
			}
			numero = new String (teste);
			
			invertido = Integer.parseInt(numero);
			
			if(cont == invertido) {
				palindromos[cont] = cont;
			}
			
		}
		
		return palindromos;
	}

}
