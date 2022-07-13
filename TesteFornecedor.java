package PortoSeguro;

public class TesteFornecedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fornecedor fornec = new Fornecedor( "Gambato Comercio de Peças Ltda","12.023.256.0001-82","Alameda Santos, 1500, jardins , Sao PULO - SP",1136822599,
				350000, 12);
		fornec.imprimirInfo();
		fornec.pagamentoFornecedor();
		

	}

}
