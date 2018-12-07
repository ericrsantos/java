package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Correntista;


public class Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Correntista correntista;
		
		System.out.print("Entre com o numero da conta: ");
		int numero = sc.nextInt();
		
		System.out.print("Entre com o nome do titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.print("Deseja fazer um deposito incial (y/n)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y') {
			System.out.print("Entre com o valor do deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			correntista = new Correntista (numero, depositoInicial, titular);
		} 
		
		else {
		correntista = new Correntista(numero, titular);
			
		}
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(correntista);
		
			
		System.out.println();
		System.out.println("Entre com o valor do deposito: ");
		double valorDeposito = sc.nextDouble();
		correntista.deposito(valorDeposito);
		System.out.println("Saldo atual: ");
		System.out.println(correntista);
		
		
		
		
		System.out.println();
		System.out.println("Entre com o valor do saque ");
		double valorSaque = sc.nextDouble();
		correntista.saque(valorSaque);
		System.out.println("Saldo atual: ");
		System.out.println(correntista);
		
		
		
		
		sc.close();

	}

}
