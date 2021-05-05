package controle;

public class SwitchSemBreak 
{
	public static void main(String[] args) 
	{
		String faixa = "laranja";
		switch(faixa.toLowerCase())
		{
			case"preta":
				System.out.println("Sei o bassai-dai...");
			case"marron":
				System.out.println("Sei o Tekki Shodan");
			case"roxa":
				System.out.println("Sei o Heidan Godan");
			case"verde":
				System.out.println("Sei o Heidan Yodan");
			case"laranja":
				System.out.println("Sei o Heidan Sandan");
			case"vermelha":
				System.out.println("Sei o Heidan Nidan");
			case"amarela":
				System.out.println("Sei o Heidan Shodan");
		}
	}
}
