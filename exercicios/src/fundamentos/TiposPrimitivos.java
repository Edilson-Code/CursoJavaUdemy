package fundamentos;

public class TiposPrimitivos 
{
	public static void main(String[] args) 
	{
		// Informações do funcionario
		
		// Tipos numéricos inteiros;
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 654_987_321;
		long pontosAcumulados = 4_123_645_123L;
		
		// Tipos numéricos reais
		float salario = 11_654.44F;
		double vendasAcumuladas = 2_345_123_125_634.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		char status  = 'A'; // ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número  de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? "+ estaDeFerias);
		System.out.println("Status: " + status);
	}
}
