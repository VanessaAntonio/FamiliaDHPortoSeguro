package PortoSeguro;

import java.text.NumberFormat;

public class Empregado {
	
	// cria��o dos atributos 
	
	private String nome;
	private double salario;
	
	public Empregado (String n, double s )
	{
		this.setNome(n);
		this.setSalario(s);
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) 
	{
		salario *= 1 + percentual /100 ;
		
	}
	public String formatarMoeda() 
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance(); // neste caso nf � uma variavel
		// neste caso  getCurrencyInstance  coloca a moeda do pais 
		nf.setMinimumFractionDigits(2); // te tras quantas casas depois da virgula 
		String formatoMoeda = nf.format(salario); // cria formata��o monetaria 
		return formatoMoeda; 
		
	}
	public void imprimir()
	{
		System.out.println(nome+ "\t\t" + " Salario:" + this.formatarMoeda ());
			
		}
		
	}
	

