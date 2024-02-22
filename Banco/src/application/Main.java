package application;

import java.util.Locale;
import java.util.Scanner;

import util.Operacoes;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o numero da conta: ");
		int n_conta = sc.nextInt();
		
		sc.nextLine();
		System.out.println("digite o titular da conta: ");
		String name = sc.nextLine();
		
		System.out.println("havera algum deposito inicial? (s/n)");
		char resp = sc.next().charAt(0);
		
		double valor = 0;
		if(resp == 's') {
			System.out.println("digite o valor do deposito inicial: ");
			valor = sc.nextDouble();
		}
		
		Operacoes op = new Operacoes(name, n_conta, valor);
		
		System.out.printf("\ndados da conta: \n"+ op + "%.2f", op.getBalance());
		
		System.out.println("\n\n"
				+ "entre com o valor do deposito: ");
		valor = sc.nextDouble();
		op.depositar(valor);
		
		System.out.printf("\natualizacao de conta: \n"
				+ op + "%.2f", op.getBalance());
		
		System.out.println("\n\n"
				+ "digite um valor de saque: ");
		valor = sc.nextDouble();
		op.sacar(valor);
		
		System.out.printf("\natualizacao de conta: \n"
				+ op + "%.2f", op.getBalance());
		
		sc.close();
	}

}
