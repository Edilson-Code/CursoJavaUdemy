package controle.provas;

import java.util.Scanner;

public class SomaPositivo 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
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
		
		entrada.close();
	}
}
