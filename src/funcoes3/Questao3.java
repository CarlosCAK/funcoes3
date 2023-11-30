package funcoes3;
import java.util.Scanner;
public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 Scanner sc = new Scanner(System.in);
	 
	 String parametro;
	 
	 System.out.println("Digite o parametro");
	 parametro = sc.next();
	 
	 int volta = parametros(parametro);
	 
	 System.out.println(volta);
	 
	}
	public static int parametros (String parametro) {
		int num = 9;
		int contDigito = 0;
		int contLetra = 0;
		
		for(int cont = 0; cont < parametro.length();cont++) {
		if(Character.isLetter(parametro.charAt(cont))) {
			contLetra++;
		}
		if(Character.isDigit(parametro.charAt(cont))) {
			contDigito++;
		}
		if(! Character.isDigit(parametro.charAt(cont))) {
			if(! Character.isLetter(parametro.charAt(cont))) {
				return - 1;
			}
		}
		if(contLetra > contDigito) {
			num = 1;
		}
		else {
			num = 0;
		}
		
		}
		return num;
	}
	

}

