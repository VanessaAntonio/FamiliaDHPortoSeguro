package PortoSeguro;

public class Cliente extends Pessoa{

	
	private String numeroCartao;
	private int pontosMilhas;
	
	public Cliente(String nome, String endereço, String cpf, int telefone , int idade,
			  String Numerocartao,int pontosMilhas) 
	{
		super(nome, endereço, cpf, telefone, idade);
		this.numeroCartao = numeroCartao;
		this.pontosMilhas = pontosMilhas;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public int getPontosMilhas() {
		return pontosMilhas;
	}

	public void setPontosMilhas(int pontosMilhas) {
		this.pontosMilhas = pontosMilhas;
	}

	public void imprimirInfo()
	{
		System.out.println( "\n Nome do Cliente : " + getNome()+ "\n Cpf " + getCpf()+
				"\n Idade: " + getIdade() + "\n Telefone: " +getTelefone()+ 
				"\n Endereço: " + getEndereço()+"\n Cartão de numero:  " +numeroCartao+
				"Total de pontos acumulados no programa de milhas:" +pontosMilhas);
	}
}