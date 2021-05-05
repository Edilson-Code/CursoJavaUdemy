package controle.provas;

import java.util.Scanner;

public class AnoBissexto 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o Ano : ");
		int ano = entrada.nextInt();


		if(ano % 4 == 0)
		{
			System.out.println("Ano bissexto !!");				
		}else
		{
			System.out.println("Ano não bissexto !!");
		}
		entrada.close();
	}
	

}
