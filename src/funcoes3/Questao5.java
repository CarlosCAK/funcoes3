package funcoes3;
import java.util.Scanner;
public class Questao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite o numero que deseja saber se é primo ou não");
		num = sc.nextInt();
		
		boolean primo = verificador(num);
		
		if (primo == true ) {
			System.out.println("É um número primo ");
		}
		else {
			System.out.println("Não é um numero primo");
		}
		
	}
	public static boolean verificador(int num) {
		boolean primo = false;
		
		for(int cont = 2; cont < num; cont++) {
			if(num % cont == 0 ) {
				return false;
			}
			else {
				primo = true;
			}
		}
		
		
		return primo;
	}

}
