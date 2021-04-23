package entities;

public class Conta_Poupanca extends Conta
{
	private Double interestRete;
	
	public Conta_Poupanca() 
	{
		super();
	}

	public Conta_Poupanca(int nConta, String nome, Double interestRete) 
	{
		super(nConta, nome);
		this.interestRete = interestRete;
	}

	public Conta_Poupanca(int nConta, String nome, double initialValue, Double interestRete) 
	{
		super(nConta, nome, initialValue);
		this.interestRete = interestRete;
	}

	public Double getInterestRete() 
	{
		return interestRete;
	}
	public void setInterestRete(Double interestRete) 
	{
		this.interestRete = interestRete;
	}
	
	
	public void updateBalance() 
	{
		saldo += saldo + interestRete;
	}
	
	@Override
	public void saque(double quant) 
	{
		saldo -= quant;
	}
	
	
}
