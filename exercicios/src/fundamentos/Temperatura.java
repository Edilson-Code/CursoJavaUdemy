package fundamentos;

public class Temperatura 
{
	public static void main(String[] args) 
	{
		// (ºF - 32) x 5/9 = ºC	
		double tempFarenheit = 75.5;
		final double x = 32;
		final double fator = 5.0 / 9; //mesmo que seja inteiro utiliza fracionados
		double tempCelcius;
		
		tempCelcius = (tempFarenheit - x) * fator;
		
		System.out.println("A temperatura em celcius é : " + tempCelcius);
	}
}
