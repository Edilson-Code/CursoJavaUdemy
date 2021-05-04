package controle;

import java.util.Scanner;

public class DesafioDiaSemana 
{
	public static void main(String[] args) 
	{	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana : ");
		String dia = entrada.next();
		
		int idDia = 0;
		if(dia.equalsIgnoreCase("domingo")) {
			idDia = 1;
		}else if(dia.equalsIgnoreCase("segunda")) {
			idDia = 2;
		}else if(dia.equalsIgnoreCase("terca")) {
			idDia = 3;
		}else if(dia.equalsIgnoreCase("quarta")) {
			idDia = 4;
		}else if(dia.equalsIgnoreCase("quinta")) {
			idDia = 5;
		}else if(dia.equalsIgnoreCase("sexta")) {
			idDia = 6;
		}else if(dia.equalsIgnoreCase("sabado")) {
			idDia = 7;
		}else {
			System.out.println("Dia Inválido!");
		}
		
		System.out.printf("O id do dia da semana é : %d", idDia);
		entrada.close();
	}
}
