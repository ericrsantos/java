package entities;

public class Funcionario {

	public String nome;
	public double salario;
	public double desconto;
	public double bonus;
	
	
	public double totalPagamento(double salarioFase1) {
		return salarioFase1 = salario - desconto;
	}
	
	public double totalBonus(double salarioFase2) {
		return salarioFase2 = salario + (salario * bonus)/100 - desconto;
	}
	
}
