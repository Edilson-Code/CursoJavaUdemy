package controle.provas;

import java.util.Scanner;

public class De0a10Par 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor entre 0 e 10 :");
		double num = entrada.nextDouble();
		
		if(num >= 0 && num <= 10)
		{
			if(num % 2 == 0)
			{
				System.out.println("O valor digitado é PAR");
			}else
			{
				System.out.println("O valor digitado é IMPAR");	
			}
		}else
		{
			System.out.println("Valor incorreto!!");
		}
		entrada.close();
	}
}
