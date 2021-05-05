package classe;

public class DataTeste 
{
	public static void main(String[] args) 
	{
		Data d1 = new Data();
		Data d2 = new Data();
		
		d1.dia = 10;
		d1.mes = 06;
		d1.ano = 1993;
		
		d2.dia = 05;
		d2.mes = 05;
		d2.ano = 2021;
		
		System.out.printf("A data de nascimento é %d/%d/%d",d1.dia,d1.mes,d1.ano);
		System.out.printf("\nA data atual é %d/%d/%d",d2.dia,d2.mes,d2.ano);
		
	}
}
