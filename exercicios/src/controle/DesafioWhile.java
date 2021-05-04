package controle;

import java.util.Scanner;

public class DesafioWhile 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double total = 0;
		
		int contador = 0;
		
		do{
			System.out.print("\nDigite uma nota : ");
			nota = entrada.nextDouble();
			if(nota >= 0 && nota <= 10){
				total += nota;	
				contador++;
			}else if(nota != -1) {
				System.out.println("Nota Invalida!");
			}
		
		}while(nota != -1);
		
		System.out.printf("\nTotal de notas : %d", contador);
		System.out.printf("\nSoma total das notas : %.2f", total);
		System.out.printf("\nMedia das notas : %.2f", total/contador);
		
		entrada.close();
	}
}
