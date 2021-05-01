package fundamentos;

public class NotacaoPonto 
{
	public static void main(String[] args) 
	{

		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();		
		s = s.concat("!!!");
		
		System.out.println(s);
		System.out.println("Edilson".toUpperCase());
		
		String y = "Bom dia X".
				replace("X", "Edilson ").
				concat("Tudo Bem?").
				toUpperCase();
		System.out.println(y);
		
		//Tipos primitivos nao tem o operador "."
		int a = 3;
		System.out.println(a);
	}
}
