package funcoes3;
import java.util.Scanner;
public class Questao13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			
			int numeroEscolha;
			
			System.out.println("Digite até que termo deseja a sequencia");
			numeroEscolha = sc.nextInt();
			
			int sequenciaDeFibonatti[] = sequencia(numeroEscolha);
			
			for(int cont = 0; cont < sequenciaDeFibonatti.length;cont++) {
				System.out.println(sequenciaDeFibonatti[cont]);
			}
			
	}
	public static int []sequencia(int tamanho) {
		
		int sequencia[] = new int [tamanho];
		
		for(int cont = 0; cont < sequencia.length; cont++) {
			if(cont == 0 ) {
				sequencia[cont] = 1;
			}
			if(cont == 1) {
				sequencia[cont] = 1;
			}
			else if (cont >= 2) {
				sequencia[cont] = sequencia[cont- 1] + sequencia[cont - 2];
			}
		}
		
		
		return sequencia;
	}
	

}
