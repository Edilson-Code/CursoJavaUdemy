package fundamentos.provas;

import java.util.Scanner;

public class ProvaBaskara 
{
	public static void main(String[] args) 
	{
		// (ax^2 + bx + c = 0)
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Equação: ax² + bx + c = 0");
		
		System.out.println("\nDigite o valor de A: ");
		int a = scanner.nextInt();

		System.out.println("\nDigite o valor de B: ");
		int b = scanner.nextInt();

		System.out.println("\nDigite o valor de C: ");
		int c = scanner.nextInt();

		int delta = (b * b) - (4 * a * c);

		System.out.printf("\nSua equação é: %dx² + %dx + %d = 0", a, b, c);
		
		System.out.println("\nO delta é: " + delta);

		double x1 = (-b + Math.sqrt(delta)) / (2 * a);

		System.out.printf("O x1 da equação é: %.2f", x1);

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("\nO x2 da equação é: %.2f" ,x2);
		
		scanner.close();
		/*
		double a = 1;
		double b = 12;
		double c = -13;
		
		double num1 = Math.pow(b, 2);
		double num2 = 4 * a * c;
		
		double delta = num1 - num2;
		
		System.out.printf("O  valor de delta é : %.2f", delta);
		*/
	}
}
