package fundamentos.provas;

import java.util.Scanner;

public class CelsiusFahrenheit 
{
	public static void main(String[] args) 
	{
		//Formula F = 9/5 x C + 32
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o graus em Celsius : ");
		double celsius = entrada.nextDouble();
		double num1 = (double)9/5;
		double num2 = 32;
		double fahrenheit = (celsius *  num1) + num2;
		System.out.printf("A conversao em Fahrenheit é : %.2f", fahrenheit);
		entrada.close();		
	}
}
