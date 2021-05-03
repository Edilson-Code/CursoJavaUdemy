package fundamentos;

import java.util.Scanner;

public class DesafioConversao 
{
	public static void main(String[] args) 
	{
		Scanner texto = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salario: ");
		String salario1 = texto.nextLine().replace(",", ".");
		System.out.print("\nDigite o segundo salario: ");
		String salario2 = texto.nextLine().replace(",", ".");
		System.out.print("\nDigite o terceiro salario: ");
		String salario3 = texto.nextLine().replace(",", ".");
		
		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);
		double media = (sal1 + sal2 + sal3) / 3;
		
		System.out.println("A média dos 3 salarios é: " + media);
		texto.close();
	}
}
