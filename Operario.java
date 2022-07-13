package PortoSeguro;

public class Operario extends Pessoa {
	
	private double valorProducao;
	private double comissao;
	
	
	public Operario(String nome, String endereço, String cpf, int telefone , int idade,
			  double valorProducao, double comissao) 
	{
		super(nome, endereço, cpf, telefone, idade);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		
	}


	public double getValorProducao() {
		return valorProducao;
	}


	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}


	public double getComissao() {
		return comissao;
	}


	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public void imprimirInfo()
	{
		System.out.println( "\n Nome do operario: " + getNome()+ "\n Cpf " + getCpf()+
				"\n Idade: " + getIdade() + "\n Telefone: " +getTelefone()+ 
				"\n Endereço: " + getEndereço() + "\n Valor monetario dos artigos produzidos: " 
				+ valorProducao + "\n Porcentagem (sem o %) da comisão deste atigo" + comissao);
	}
	
	public void calcularProducao() 
	{
		double valorTotal = valorProducao + (valorProducao *(comissao / 100));
		System.out.println( "\n valor total a ser recebido pelo operario: " + getNome()+
		" será de: " + valorTotal);
		
	}
;	
}

