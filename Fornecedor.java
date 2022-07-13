package PortoSeguro;

public class Fornecedor extends Pessoa {

	private String Cnpj;
	private String RazaoSocial;
	private double valorNf;
	private double Icms;
	
	public Fornecedor( String RazaoSocial  ,String Cnpj, String endereço, int telefone,double valorNf, double Icms)
	{
		super(endereço, telefone);
		this.Cnpj = Cnpj;
		this.RazaoSocial = RazaoSocial;
		this.valorNf= valorNf;	
		this.Icms = Icms;
	}

	public String getCnpj() {
		return Cnpj;
	}

	public void setCnpj(String cnpj) {
		Cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return RazaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}

	public double getValorNf() {
		return valorNf;
	}

	public void setValorNf(double valorNf) {
		this.valorNf = valorNf;
	}

	public double getIcms() {
		return Icms;
	}

	public void setIcms(double icms) {
		Icms = icms;
	}

	public void imprimirInfo()
	{
		System.out.println( "\n Razao Social do Fornecedor: " +RazaoSocial + "\n CNPJ "+ Cnpj+
				"\n Telefone: " +getTelefone()+ "\n Endereço: " + getEndereço() + "\n Valor total da nota emitida :" + valorNf+
				"\n Aliquota do ICMS sobre a nota :" +Icms );
		
	}
	
		public void pagamentoFornecedor()
	
	{
		double valorLiquidoNf = valorNf - (valorNf * (Icms/100));
		System.out.println(" Valor a ser pago ao Fornecedor: " + valorLiquidoNf);
}
		
}