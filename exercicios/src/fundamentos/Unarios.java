package fundamentos;

public class Unarios 
{
	public static void main(String[] args) 
	{
		int a = 1;
		int b = 2;
		
		//posfixada
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		//prefixada
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(++a == b--); // true, prefixo a -> 2 == b -> 2 depois decrementa b
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
	}
}
