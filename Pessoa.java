package PortoSeguro;

public class Pessoa {
	
	private String nome;
	private String endereço;
	private String cpf;
	private int telefone;
	private int idade;
	
	// criando construtor // metodo principla que inicializa os atributos 
	// possibilitanto que eu modifique estes atributos 

	public Pessoa (String nome, String endereço,String cpf, int telefone, int idade) 
	{
		this.nome = nome;
		this.endereço = endereço;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
						
	}
	
	public Pessoa (String endereço, int telefone) 
	{
		this.endereço = endereço;
		this.telefone = telefone;
								
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
    		System.out.println(" \n CPF Inválido" );
    	}
    	
    	else 
    	{
    		System.out.println(" \n CPF Válido" );
        }
}
}
