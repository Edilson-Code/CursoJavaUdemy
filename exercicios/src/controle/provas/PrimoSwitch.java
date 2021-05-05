package controle.provas;

import java.util.Scanner;

public class PrimoSwitch 
{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um numero : ");
		double num = entrada.nextDouble();
		int contador = 0;
		int primo = 0;
		
		while(contador <= num)
		{
			if(num % contador == 0)
			{
				primo++;
			}
			contador ++;			
		}

		switch (primo) 
		{
		case 2:
			System.out.println("E primo.");
			break;
		default:
			System.out.println("Não é primo.");
		}
		entrada.close();
	}
}
