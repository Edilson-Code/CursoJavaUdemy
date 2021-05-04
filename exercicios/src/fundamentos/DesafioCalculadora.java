package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora 
{
	public static void main(String[] args) 
	{
		// ler num1
		// ler num2
		// + - * / &-
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro valor : ");
		double num1 = entrada.nextDouble();
		System.out.print("Digite o segundo valor : ");
		double num2 = entrada.nextDouble();
		System.out.print("Digite a operação a ser realizada : ");	
		String operacao = entrada.next();
		
		
		double resultado = "+".equals(operacao)? num1 + num2 : 0;
		resultado = "-".equals(operacao)? num1 - num2 : resultado;
		resultado = "*".equals(operacao)? num1 * num2 : resultado;
		resultado = "/".equals(operacao)? num1 / num2 : resultado;
		resultado = "%".equals(operacao)? num1 % num2 : resultado;
				
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		
		
		entrada.close();
	}
}
