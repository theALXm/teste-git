package entities;

public class Conta_Empresas extends Conta
{
	private Double loanLimit;
	
	public Conta_Empresas() 
	{
		super();
	}
			
	public Conta_Empresas(int nConta, String nome, Double loanLimit) 
	{
		super(nConta, nome);
		this.loanLimit = loanLimit;
	}


	public Conta_Empresas(int nConta, String nome, double initialValue, Double loanLimit) 
	{
		super(nConta, nome, initialValue);
		this.loanLimit = loanLimit;
	}


	public Double getLoanLimit() 
	{
		return loanLimit;
	}
	public void setLoanLimit(Double loanLimit) 
	{
		this.loanLimit = loanLimit;
	}
	
	
	public void loan(double amount) 
	{
		if(amount <= loanLimit) 
		{
			saldo += amount - 10.0;
		}
	}
	
	public void saque(double quant) 
	{
		super.saque(quant);
		saldo -= 2.0;
	}
	
}
