package funcoes3;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String parametro;
		
		System.out.println("Digite a cadeia de caracter");
		parametro = sc.next();
		
		boolean certo = formatacao(parametro);
		
		if(certo == true) {
			System.out.println("Há algo de errado");
		}
		else if(certo == false ) {
			System.out.println("Todos são minúsculos");
		}
		
	
	}
	public static boolean formatacao (String parametro) {
		boolean caixaAlta = false;
		
		for(int cont = 0; cont < parametro.length();cont++) {
			if(!Character.isLowerCase(parametro.charAt(cont))) {
				return true;
			}
			else {
				caixaAlta = false;
			}
		}
		
		return caixaAlta;
	}

}
