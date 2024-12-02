package introducaoJava;

import java.util.Scanner;

public class AbonoSalarial {

	public static void main(String[] args) {

		// Declarando minhas variaveis
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		
		
		// Construindo o Digite
		Scanner digite = new Scanner (System.in);
		
		// Entrada de Dados
		System.out.println("Digite sua primeira nota ");
		nota1 = digite.nextFloat();
		
		System.out.println("Digite sua segunda nota ");
		nota2 = digite.nextFloat();
		
		System.out.println("Digite sua terceira nota ");
		nota3 = digite.nextFloat();
		
		System.out.println("Digite sua quarta nota ");
		nota4 = digite.nextFloat();
		
		// Processamento
		
		
		// Saída de dados
		System.out.printfl("O seu novo salário é de %.2f.", salario);
		
		
	}

}
