package fundamentos.provas;

import java.util.Scanner;

public class QuadradoCubo 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um valor : ");
		double num = entrada.nextDouble();
		double numQuadrado = Math.pow(num, 2);
		double numCubico = Math.pow(num, 3);
		System.out.printf("\nO valor ao quadrado � : %.2f", numQuadrado);
		System.out.printf("\nO valor ao cubico � : %.2f", numCubico);
		entrada.close();
	}
}
