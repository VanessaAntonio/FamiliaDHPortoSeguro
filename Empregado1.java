package PortoSeguro;

public class Empregado1 extends Pessoa {

	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public Empregado1(String nome, String endere�o, String cpf, int telefone , int idade,
			  int codigoSetor, float salarioBase, float imposto) 
	{
		super(nome, endere�o, cpf, telefone, idade);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}



	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	public void imprimirInfo()
	{
		System.out.println( "\n Nome do empregado: " + getNome()+ "\n Cpf " + getCpf()+
				"\n Idade: " + getIdade() + "\n Telefone: " +getTelefone()+ 
				"\n Endere�o: " + getEndere�o() +"\n C�digo do setor: "+ codigoSetor+ 
				"\n salarioBase: " +salarioBase+ "\n Valor em porcentagem ( sem o %) "
						+ "de imposto a ser retido do salario; " + imposto );
	}
	
	public void calcularSalario()
	
	{
		double salarioLiquido = salarioBase - (salarioBase * (imposto/100));
		System.out.println(" O salario total a ser recebido pelo  empregado:" + getNome()+
		"� igual a: " + salarioLiquido);
		
		
	}



	
		
	}




