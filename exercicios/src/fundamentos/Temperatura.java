package fundamentos;

public class Temperatura 
{
	public static void main(String[] args) 
	{
		// (�F - 32) x 5/9 = �C	
		double tempFarenheit = 75.5;
		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9.0; //mesmo que seja inteiro utiliza fracionados
		double tempCelcius;
		tempCelcius = (tempFarenheit - AJUSTE) * FATOR;
		
		System.out.println("A temperatura em celcius � : " + tempCelcius);
	}
}
