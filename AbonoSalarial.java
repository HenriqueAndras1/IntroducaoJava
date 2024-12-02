package introducaoJava;

import java.util.Scanner;

public class AbonoSalarial {

	public static void main(String[] args) {

		// Declarando minhas variaveis
		float salario;
		float abono;
		
		// Construindo o Digite
		Scanner digite = new Scanner (System.in);
		
		// Entrada de Dados
		System.out.println("Digite o valor do seu salário: ");
		salario = digite.nextFloat();
		
		System.out.println("Digite o valor do seu abono: ");
		abono = digite.nextFloat();
		
		// Processamento
		salario = salario + abono;
		
		// Saída de dados
		System.out.printf("O seu novo salário é de %.2f.", salario);
		
		
	}

}
