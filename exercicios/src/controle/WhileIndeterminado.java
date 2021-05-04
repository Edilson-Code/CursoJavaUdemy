package controle;

import java.util.Scanner;

public class WhileIndeterminado 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equals("sair"))
		{
			System.out.print("Vode diz:");
			valor = entrada.nextLine();
		}
		
		
		
		entrada.close();	
	}
}
