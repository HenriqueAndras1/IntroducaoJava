package introducaoJava;

import java.util.Scanner;

public class ValoresFloat {

	public static void main(String[] args) {

		// Declarando minhas variaveis
		float n1;
		float n2;
		float n3;
		float n4;
		float resultado;
		
		// Construindo o Digite
		Scanner digite = new Scanner (System.in);
		
		// Entrada de Dados
		System.out.println("Digite um numero ");
		n1 = digite.nextFloat();
		
		System.out.println("Digite um numero ");
		n2 = digite.nextFloat();
		
		System.out.println("Digite um numero ");
		n3 = digite.nextFloat();
		
		System.out.println("Digite numero ");
		n4 = digite.nextFloat();
		
		// Processamento
		resultado = ((n1 * n2) - (n3 * n4));
		
		// Saída de dados
		System.out.printf("Resultado dos valores são:  %.1f " , resultado);
		
		
	}

}
