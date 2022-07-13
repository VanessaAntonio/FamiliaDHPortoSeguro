package PortoSeguro;

public class Excecao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = null;
		String novaFrase = null;
		
		try 
		{
			novaFrase= frase.toUpperCase();
		}
		catch(NullPointerException e) //captura da possivel exceção
		{
			//tratamento da exceção
			System.out.println("\n A frade inicla esta nula  para solucionar o problema "
					+ "foi lhe atribuido um valor default...");
			frase = "Agora tem algo aqui";
			
			System.out.println("\n Frase antiga: " +frase);
			System.out.println("\n Nova Frase: " + novaFrase);
			
			
		}
	}

}
