package controle.provas;

import java.util.Scanner;

public class SomaPositivo 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		int somadorDeNumeros = 0;
		int numero = 0;

		while (numero >= 0) {
			System.out.println("Digite um numero inteiro (zero ou negativo para sair): ");
			numero = scanner.nextInt();
			if (numero >= 0) {
				somadorDeNumeros += numero; // Isso é igual a somadorDeNumeros = somadorDeNumeros + numero;
				System.out.printf("\nSoma até o momento: %d\n", somadorDeNumeros);
			}
		}
		scanner.close();
		/*Scanner entrada = new Scanner(System.in);
		
		double num = 0;
		double total = 0;
		
		System.out.println("Caso queira sair digite um valor negativo.");
		do
		{
			System.out.print("\nDigite um Valor: ");
			num = entrada.nextDouble();
			if(num < 0) {
				System.out.println("Programa Encerrado!");
				return;	
			}
			total += num;
			System.out.printf("Total : %.2f",total);
		}while(num > 0);
		
		entrada.close();*/
	}
}
