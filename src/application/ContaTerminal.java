package application;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		int numero;
		String agencia, nomeCliente;
		double saldo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo ao Banco do Rio de Janeiro! \nPor favor, nos informes os seus dados: \n");
		
		System.out.print("Digite o número da conta: ");
		numero = sc.nextInt();
		
		System.out.print("Digite o número da agência: ");
		sc.skip("\\R?");
		agencia = sc.nextLine();
		
		System.out.print("Digite o nome do cliente: ");
		nomeCliente = sc.nextLine();
		
		System.out.print("Digite o saldo do cliente: ");
		saldo = sc.nextDouble();
		
		System.out.printf("\nOlá, %s! Obrigado por criar uma conta no Banco do Rio de Janeiro. "
				+ "\nSua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
		
		sc.close();
	}
	
}
