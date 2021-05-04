package fundamentos.provas;

import java.util.Scanner;

public class FahrenheitCelsius 
{
	public static void main(String[] args) 
	{
		//formula (F - 32) x 5/9 = C
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o graus em Fahrenheit : ");
		double fahrenheit = entrada.nextDouble();
		double num1 = (double)5/9;
		double num2 = 32;
		double celsius = (fahrenheit - num2) * num1;
		System.out.printf("A conversao em Celsius é : %.2f", celsius);
		entrada.close();
		
	}
}
