package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Enter account nunber: ");
		int nConta = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Is there an initial deposity (y/n)? ");
		char resposta = sc.next().charAt(0);
		

		if(resposta == 'y') 
		{
		System.out.print("Enter initial deposit value: ");
		double initialValue = sc.nextDouble();
		conta = new Conta(nConta, nome, initialValue);
		}
		else 
		{
			System.out.println();
			conta = new Conta(nConta, nome);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("deposit, withdraw or end (d/w/e)? ");
		resposta = sc.next().charAt(0);
		
		while(resposta!='e')
		{
			if(resposta == 'd') 
			{					
				System.out.print("Enter a deposit value: ");
				double quant = sc.nextDouble();
				conta.deposito(quant);
			}
			else if(resposta == 'w')
			{
				System.out.print("Enter a withdraw value: ");
				double quant = sc.nextDouble();
				conta.saque(quant);
			}
		
			System.out.println();
			System.out.println("Updated account data: " + conta);
			
			System.out.println();
			System.out.print("deposit, withdraw or end (d/w/e)? ");
			resposta = sc.next().charAt(0);
		}
		
		System.out.println("thanks!");
		sc.close();
	}

}
