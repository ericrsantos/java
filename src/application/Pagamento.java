package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Pagamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salário: ");
		funcionario.salario = sc.nextDouble();
		System.out.print("Desconto: ");
		funcionario.desconto = sc.nextDouble();
		
		System.out.println();
		double salarioFase1 = 0;
		System.out.printf("Funcionário: %s, $ %.2f", funcionario.nome, funcionario.totalPagamento(salarioFase1));
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		funcionario.bonus = sc.nextDouble();
		System.out.println();
		double salarioFase2 = 0;
		System.out.printf("Updated data: %s, $ %.2f", funcionario.nome, funcionario.totalBonus(salarioFase2));
		
		
		
		sc.close();
	}

}
