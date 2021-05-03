package fundamentos;

public class ConversaoTipoPrimitivo 
{
	public static void main(String[] args) 
	{
		double a = 1; // conversão implicita int --> double		
		System.out.println(a);
		
		float b = (float)1.0; // conversão explicita (CAST)		
		System.out.println(b);
		
		int c = 128;
		byte d = (byte)c; // explicita
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;
		System.out.println(f);
	}
}
