package controle.provas;

import java.util.Scanner;

public class MaiorDe10 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		double num = 0;
		double maior = 0;
		for(int i = 1; i < 11 ; i++){
			System.out.print("Digite o "+ i +"º valor : ");
			num = entrada.nextDouble();
			if(num > maior){
				maior = num;
			}
		}
		
		System.out.printf("\nO maior numero digitado é : %.2f",maior);
		entrada.close();
	}
}
