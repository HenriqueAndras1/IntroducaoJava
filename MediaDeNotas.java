package introducaoJava;

import java.util.Scanner;

public class MediaDeNotas {

	public static void main(String[] args) {

		// Declarando minhas variaveis
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float media;
		
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
		media = ((nota1 + nota2 + nota3 + nota4)/4);
		
		// Saída de dados
		System.out.printf("Sua média de notas é %.1f " , media);
		
		
	}

}
