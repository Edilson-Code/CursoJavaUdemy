package fundamentos;

public class DesafioLogicos 
{
	public static void main(String[] args) 
	{
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou tv 50''? " + comprouTV50);
		System.out.println("Comprou tv 32''? " + comprouTV32);
		System.out.println("Comprou sorvete? " + comprouSorvete);
		System.out.println("Mais saudavel? " + maisSaudavel);
		
		
		//MINHA RESPOSTA
		/*boolean terca = false;
		boolean quinta = false;
		
		if((terca && quinta) == true)
		{
			System.out.println("Comprou tv de 50'' e tomou sorvete");
		}else
		{
			if((terca ^ quinta) == true)
			{
				System.out.println("Comprou tv de 32'' e tomou sorvete");
			}else
			{
				System.out.println("Não comprou e nao tomou sorvete");
			}
		}*/
		
	}
}
