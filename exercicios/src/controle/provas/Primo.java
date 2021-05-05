package controle.provas;

import java.util.Scanner;

public class Primo 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um numero : ");
		double num = entrada.nextDouble();
		int contador = 2;
		double primo = 0;
		
		while(contador <= num)
		{
			if(num % contador == 0)
			{
				primo++;
			}
			contador ++;			
		}
		if(primo <= 2)
		{
			System.out.println("O numero digitado é PRIMO");
		}else
		{
			System.out.println("O numero digitado NÃO é PRIMO");
		}
		entrada.close();
	}
}
