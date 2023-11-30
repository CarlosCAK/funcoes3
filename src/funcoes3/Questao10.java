package funcoes3;
import java.util.Scanner;
public class Questao10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			double altura, peso;
			
			System.out.println("Digite seu peso");
			peso = sc.nextDouble();
			
			System.out.println("Digite a sua altura");
			altura = sc.nextDouble();
			
			double imc = imc(peso,altura);
			
			if(imc < 20) {
				System.out.println("Magro");
			}
			if(imc >= 20 && imc <= 24 ) {
				System.out.println("Normal");
			}
			if(imc >= 25 && imc <= 29 ) {
				System.out.println("Acima do peso");
			}
			if(imc >= 30 && imc <= 34 ) {
				System.out.println("Obeso");
			}
			if(imc > 34 ) {
				System.out.println("Muito Obeso");
			}
			
		
	}
	public static double imc (double peso, double altura) {
		double imc;
		
		imc = peso / (altura * altura);
		
		return imc; 
	}

}
