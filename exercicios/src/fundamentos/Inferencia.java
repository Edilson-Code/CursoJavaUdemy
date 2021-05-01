package fundamentos;

public class Inferencia 
{
	public static void main(String[] args) 
	{
		double a = 4.5;
		System.out.println(a);
		
		// ao declarar uma inferencia ele necessariamente tem que ser inicializada
		var b = 4.5;
		System.out.println(b);
		
		// inicializou de um tipo, sera desse tipo sempre, nao pode mudar!
		var c = "texto"; 
		System.out.println(c);
		
		double d; //variavel foi declarada
		d=  134.51; // variavel foi inicializada
		System.out.println(d);// usada!
		
		
	}
}
