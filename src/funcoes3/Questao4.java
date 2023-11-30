package funcoes3;
import java.util.Scanner;
public class Questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String parametro;
		
		System.out.println("Digite a palavra que deseja contar os caracteres");
		parametro = sc.next();
		
		int contador = contadorLetra(parametro);
		
		System.out.println("A quantidade de letras é de: "+ contador);

	}
	public static int contadorLetra (String parametro) {
		
		int contLetra;
		
		contLetra = parametro.length();
		return contLetra;
	}

}
