package PortoSeguro;

public class Pessoa {
	
	private String nome;
	private String endere�o;
	private String cpf;
	private int telefone;
	private int idade;
	
	// criando construtor // metodo principla que inicializa os atributos 
	// possibilitanto que eu modifique estes atributos 

	public Pessoa (String nome, String endere�o,String cpf, int telefone, int idade) 
	{
		this.nome = nome;
		this.endere�o = endere�o;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
						
	}
	
	public Pessoa (String endere�o, int telefone) 
	{
		this.endere�o = endere�o;
		this.telefone = telefone;
								
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


    public void validarCpf()
    {
    	if (getCpf().length()!=11) // length conta a quantidade de caracteres
    	{
    		System.out.println(" \n CPF Inv�lido" );
    	}
    	
    	else 
    	{
    		System.out.println(" \n CPF V�lido" );
        }
}
}
