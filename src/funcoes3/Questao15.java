package funcoes3;
import java.util.Scanner;
import java.util.Random;
public class Questao15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			
			int quantidadeApostadores;
			
			System.out.println("Quantas pessoas desejam apostar?");
			quantidadeApostadores = sc.nextInt();
			
	}
	public static int Apostas(int quantidadeApostadores) {
		
		Random random = new Random ();
		int sorteados[] = new int [5];
		int aposta[] = new int [10];

		
		for(int cont = 0; cont < 5; cont++) {
			sorteados[cont] = random.nextInt(60);
			sorteados[cont] += 1;
			for(int cont1 = 0; cont1 < cont; cont1++) {
				if(cont != cont1) {
				if(sorteados[cont] == sorteados[cont1] ) {
					cont--;
				}
					
							}
			}
		}
		
		
		return 0;
	}

}
