package fundamentos.provas;

import java.util.Scanner;

public class IMC 
{
	public static void main(String[] args) 
	{
		//formula imc = peso / altura^2
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu peso : ");
		double peso = entrada.nextDouble();
		System.out.print("Digite sua altura : ");
		double altura = entrada.nextDouble();
		
		double alturaExpoente = Math.pow(altura, 2);
		double imc = peso / alturaExpoente;
		
		System.out.printf("Seu indice de massa corporal � : %.2f", imc);
		
		//extra
		if(imc < 16)
		{
			System.out.println("\nSitua��o : Subpeso Severo");
		}else
		{
			if((imc >= 16) && (imc < 20))
			{
				System.out.println("\nSitua��o : Subpeso");
			}else
			{
				if((imc >= 20) && (imc < 25))
				{
					System.out.println("\nSitual��o : Normal");
				}else
				{
					if((imc >= 25) && (imc < 30))
					{
						System.out.println("\nSitual��o : Sobrepeso");
					}else
					{
						if((imc >= 30) && (imc < 40))
						{
							System.out.println("\nSitual��o : Obeso");
						}else
						{
							System.out.println("\nSitual��o : Obeso M�rbido");
						}
					}
				}
			}
		}
		
		entrada.close();
	}
}
