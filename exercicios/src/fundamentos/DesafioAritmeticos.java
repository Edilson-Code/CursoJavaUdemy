package fundamentos;

public class DesafioAritmeticos 
{
	public static void main(String[] args) 
	{
		//int a = Math.pow(a, 3) <-- Utiliza Math.pow para potencia
		
		double formula1 = (6 * (3 + 2));
		formula1 = (Math.pow(formula1, 2)) / (3 * 2);
		
		double formula2 = ((1 - 5) * (2 - 7)) / 2;
		formula2 = Math.pow(formula2, 2);
		
		double formula3 = formula1 - formula2;
		formula3 = Math.pow(formula3, 3);
		
		double formula4 = Math.pow(10, 3);
		
		
		double resultado = (formula3 / formula4);
		
		System.out.println(formula1);
		System.out.println(formula2);
		System.out.println(formula3);
		System.out.println(formula4);
		System.out.println((int)resultado);

	}
}
