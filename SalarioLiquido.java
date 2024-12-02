package introducaoJava;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {

		// Declarando minhas variaveis
		float salariobt;
		float adicional;
		float hrs;
		float desconto;
		float salarioliquido;
		
		// Construindo o Digite
		Scanner digite = new Scanner (System.in);
		
		// Entrada de Dados
		System.out.println("Digite seu salário bruto ");
		salariobt = digite.nextFloat();
		
		System.out.println("Digite seu adicional noturno ");
		adicional = digite.nextFloat();
		
		System.out.println("Digite suas horas extras ");
		hrs = digite.nextFloat();
		
		System.out.println("Digite o valor de desconto ");
		desconto = digite.nextFloat();
		
		// Processamento
		salarioliquido = ((salariobt + adicional + (hrs * 5)- desconto));
		
		// Saída de dados
		System.out.printf("Seu salário liquido com os descontos é %.2f " , salarioliquido);
		
		
	}

}
