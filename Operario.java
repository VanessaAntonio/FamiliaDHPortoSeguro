package PortoSeguro;

public class Operario extends Pessoa {
	
	private double valorProducao;
	private double comissao;
	
	
	public Operario(String nome, String endere�o, String cpf, int telefone , int idade,
			  double valorProducao, double comissao) 
	{
		super(nome, endere�o, cpf, telefone, idade);
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
				"\n Endere�o: " + getEndere�o() + "\n Valor monetario dos artigos produzidos: " 
				+ valorProducao + "\n Porcentagem (sem o %) da comis�o deste atigo" + comissao);
	}
	
	public void calcularProducao() 
	{
		double valorTotal = valorProducao + (valorProducao *(comissao / 100));
		System.out.println( "\n valor total a ser recebido pelo operario: " + getNome()+
		" ser� de: " + valorTotal);
		
	}
;	
}

