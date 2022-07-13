package PortoSeguro;

public class Celular extends Telefone{
	
	public Celular () 
	{
		super("Telefone Celular");
		
	}
	@Override
	public void toca(int codigoToque)
	{
		switch (codigoToque)
		{
		case 1:
		System.out.println("\n Shalamar ... shalamar");
		break;
		case 2:
		System.out.println("\n Tanainana ... Tanainana ");
		break;
		default:
		System.out.println("\n Ta.... tanana...tanana");
		}
	}
	public void disca(String numero) 
	{
		
	}
	
}
