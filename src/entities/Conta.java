package entities;

public class Conta 
{
	public static final double IMPOSTO = 1.00;
	
	private int nConta;
	private String nome;
	private double saldo;
	
	public Conta() 
	{
	}
	public Conta(int nConta, String nome) 
	{
		this.nConta = nConta;
		this.nome = nome;
	}	
	public Conta(int nConta, String nome, double initialValue) 
	{
		this.nConta = nConta;
		this.nome = nome;
		deposito(initialValue);
	}
		
	
	public int getnConta() 
	{
		return nConta;
	}
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public double getSaldo() 
	{
		return saldo;
	}
	
	
	public void deposito(double quant) 
	{
		saldo += quant;
	}	
	public void saque(double quant) 
	{
		saldo -= quant + IMPOSTO;
	}
	
	
	public String toString() 
	{
		return"Account "
			+ nConta
			+ ", Holder: "
			+ nome
			+ ", Balance: $"
			+ String.format("%.2f", saldo);
	}
	
}
