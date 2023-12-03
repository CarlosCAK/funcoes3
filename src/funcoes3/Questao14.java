package funcoes3;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Questao14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int quantidadeAlunos;
		
		System.out.println("Digite a quantidade de alunos que desejam saber o seu conceito");
		quantidadeAlunos = sc.nextInt();
		
		String[] nome = new String [quantidadeAlunos];
		
		System.out.println("Digite o nome dos alunos ");
		for(int cont = 0; cont < quantidadeAlunos; cont++) {
			nome[cont] = sc.next();
		}
		
		char conceito[] = conceito (quantidadeAlunos);
		
		
		
		
		for(int cont = 0; cont < conceito.length; cont++) {
			System.out.println("Aluno "+ nome[cont]+ " seu conceito foi: "+ conceito[cont]);
		}

	}
	public static char []conceito (int quantidadeAlunos) {
		
		int notas[] = new int [4];
		int notaProvaFinal, aux;
		int somaNota = 0;
		int notaFinalAluno[] = new int [quantidadeAlunos];
		char conceitos[] = new char [quantidadeAlunos];
		Scanner sc = new Scanner(System.in);
		
		for(int aluno = 0; aluno < quantidadeAlunos; aluno++) {
			System.out.println("Aluno "+ (aluno + 1) + " Forneça as informações a seguir ");
			notaProvaFinal = 0 ;
			for(int clean = 0; clean < 4; clean++) {
				notas[clean] = 0;
	
			}
			
		for(int cont = 0; cont < 4; cont++) {
			System.out.println("Digite a nota da prova"+ (cont + 1)+ " provas");
			notas[cont] = sc.nextInt();
			
			if(notas[cont] > 20 || notas[cont] < 0) {
				System.out.println("Nota digitada inválida, repita");
				cont--;
			}
		}
		for(int cont = 0; cont <4; cont++) {
			for (int cont1 = 0; cont1 < 4; cont1++) {
				if(notas[cont] > notas[cont1]) {
					aux = notas[cont];
					notas[cont] = notas[cont1];
					notas[cont1]= aux;
				}
			}	
			
		}
		do {
		System.out.println("Digite a nota da prova final ");
					notaProvaFinal = sc.nextInt();
		}while(notaProvaFinal > 40 || notaProvaFinal < 0);
				
					notaFinalAluno[aluno] = notaProvaFinal;
		for(int cont = 0; cont < 3; cont++) {
				notaFinalAluno[aluno] += notas[cont];
					}
		
		if(notaFinalAluno[aluno] >= 0 && notaFinalAluno[aluno] <= 39) {
			conceitos[aluno] = 'F';
		}
		if(notaFinalAluno[aluno] >= 40 && notaFinalAluno[aluno] <= 59) {
			conceitos[aluno] = 'E';
		}
		if(notaFinalAluno[aluno] >= 60 && notaFinalAluno[aluno] <= 69) {
			conceitos[aluno] = 'D';
		}
		if(notaFinalAluno[aluno] >= 70 && notaFinalAluno[aluno] <= 79) {
			conceitos[aluno] = 'C';
		}
		if(notaFinalAluno[aluno] >= 80 && notaFinalAluno[aluno] <= 89) {
			conceitos[aluno] = 'B';
		}
		if(notaFinalAluno[aluno] >= 90 && notaFinalAluno[aluno] <= 100) {
			conceitos[aluno] = 'A';
		}
						
						
	}
		return conceitos;
	}	
	

}
