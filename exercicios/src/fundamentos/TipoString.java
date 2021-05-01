package fundamentos;

public class TipoString 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World".charAt(6));
		
		String s = "Hello World";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Hello"));
		System.out.println(s.toLowerCase().startsWith("hello"));
		System.out.println(s.toUpperCase().endsWith("WORLD"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("hello world"));
		System.out.println(s.equalsIgnoreCase("hello world"));
		
		var nome = "Edilson";
		var sobrenome = "Alves";
		var idade = 28;
		var salario = 5000.5123;
		
		System.out.println("Nome: " + nome 
				+ "\nSobrenome: " + sobrenome
				+ "\nIdade: " + idade
				+ "\nSalario: " + salario);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f"
				, nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f"
				, nome, sobrenome, idade, salario);
		
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
	}
}	
