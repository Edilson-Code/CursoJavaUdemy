package controle.provas;

import java.util.Random;
import java.util.Scanner;

public class Advinhacao 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();
		
		int numAleatorio = aleatorio.nextInt(101);
		while(numAleatorio <= 0 && numAleatorio >= 100)
		{
			numAleatorio = aleatorio.nextInt(101);
		}
		int numDigitado = 0;
		int tentativas = 10;
		
		int indice = 1;
		while(indice <= tentativas)
		{
			System.out.print("\nQual numero estou pensando de 0 a 100 : ");
			numDigitado = entrada.nextInt();
			
			if(numDigitado > numAleatorio){
				System.out.println("O numero digitado é Maior do que estou pensando");
				System.out.printf("Tentativas restantes : %d", tentativas - indice);
			}else if(numDigitado < numAleatorio){
				System.out.println("O numero digitado é Menor do que estou pensando");
				System.out.printf("Tentativas restantes : %d", tentativas - indice);
			}else{
				System.out.println("Parabens você acertou !!");
				break;
			}
			indice++;
		}
		if(indice >= tentativas)
		{
			System.out.println("\nVocê nao conseguiu, boa sorte da proxima =D ");
		}
		
		
		entrada.close();
	}
}
