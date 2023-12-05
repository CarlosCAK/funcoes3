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
			
			int quantidadeAcertos[] = Apostas(quantidadeApostadores);
			
			for ( int cont = 0; cont < quantidadeAcertos.length; cont++) {
				if( cont == 0) {
					System.out.println("A quantidade de pessoas que acertaram 3 numeros foi de: "+ quantidadeAcertos[cont] );
				}
				if( cont == 1) {
					System.out.println("A quantidade de pessoas que acertaram 4 numeros foi de: "+ quantidadeAcertos[cont] );
				}
				if( cont == 2) {
					System.out.println("A quantidade de pessoas que acertaram 5 numeros foi de: "+ quantidadeAcertos[cont] );
				}
			}
	}
	public static int []Apostas(int quantidadeApostadores) {
		
		Scanner sc = new Scanner(System.in);

		Random random = new Random ();
		int quantidadeApostas[] = new int [quantidadeApostadores];
		int sorteados[] = new int [5];
		int aposta[] = new int [10];
		int tresDezenas = 0;
		int quatroDezenas = 0; 
		int cincoDezenas = 0;
		int quantidadeAcertos[] = new int [3];
		int contTeste = 0 ;

		
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
		for(int cont = 0; cont < quantidadeApostadores; cont++ ) {
			
			contTeste = 0;
			for ( int clear = 0; clear < 10; clear ++) {
				aposta[clear] = 0;
			}
			
			System.out.println("Jogador "+ (cont + 1) + "Faça suas apostas");
			for (int apostas = 0; apostas < 10; apostas ++) {
				aposta[apostas] = sc.nextInt();
			}
		
		for (int cont1 = 0; cont1 < 5;cont1++) {
			for (int apostas1 = 0; apostas1 < 10; apostas1++) {
				if(sorteados[cont1] == aposta[apostas1]) {
				contTeste++;
				}
			}
		

		}
		if (contTeste == 3 ) {
			tresDezenas++;
		}
		if (contTeste == 4 ) {
			quatroDezenas++;
		}
		if (contTeste == 5 ) {
			cincoDezenas++;
		}
		}
		for (int cont = 0; cont < 3; cont++) {
			if(cont == 0 ) {
				quantidadeAcertos[cont] =  tresDezenas;
			}
			if(cont == 1 ) {
				quantidadeAcertos[cont] =  quatroDezenas;
			}
			if(cont == 2 ) {
				quantidadeAcertos[cont] =  cincoDezenas;
			}
		}
		return quantidadeAcertos;
	}

}
