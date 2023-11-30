package funcoes3;
import java.util.Scanner;
public class Questao12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite o numero que deseja saber  o fatorial");
		num = sc.nextInt();
		
		int resultado = fatorial(num);
		
		System.out.println("O resultado é:"+ resultado);
		
	}
	public static int fatorial(int num) {
		
		for(int cont = num - 1; cont > 1; cont--) {
			num*= cont;
		}
		
		return num;
	}

}
