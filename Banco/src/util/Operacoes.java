package util;

public class Operacoes {
	private String name;
	private double balance;
	private int n_conta;
	
	public Operacoes() {}
	
	public Operacoes(String name, int n_conta, double balance) {
		this.name = name;
		this.n_conta = n_conta;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double deposito) {
		this.balance += deposito;
	}

	public int getN_conta() {
		return n_conta;
	}

	public void setN_conta(int n_conta) {
		this.n_conta = n_conta;
	}
	
	public void depositar(double deposito) {
		setBalance(deposito);
	}
	
	public void sacar(double saque) {
		setBalance(saque*(-1)-5);
	}
	
	public String toString() {
		return "conta: " + n_conta + ", titular: " + name + ", total: R$";
	}
	
}
