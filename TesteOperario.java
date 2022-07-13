package PortoSeguro;

public class TesteOperario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operario operario1 = new Operario("Jorge " , "Rua paracatu, 259, jd pirituba, Taubaté - Sp", "305.233.198-99", 998771233,30, 
				12000,20);
		operario1.imprimirInfo();
		operario1.calcularProducao();
		

	}

}
