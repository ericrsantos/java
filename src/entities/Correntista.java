package entities;

public class Correntista {
	
	private static double taxa = 5.00;
	
	
	private int numero;
	private double saldo;
	private String titular;
	
	
	public Correntista(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}


	public Correntista(int numero, double depositoInicial, String titular) {
		super();
		this.numero = numero;
		deposito(depositoInicial);
		this.titular = titular;
	}


	public static double getTaxa() {
		return taxa;
	}


	public static void setTaxa(double taxa) {
		Correntista.taxa = taxa;
	}


	public int getNumero() {
		return numero;
	}


	
	public double getSaldo() {
		return saldo;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void deposito (double valor) {
		saldo += valor;
	}

	public void saque (double valor) {
		saldo -= (valor + taxa);
	}

	public String toString () {
	
		return "Conta "
				+ numero
				+ ", Titular: "
				+ titular 
				+ ", saldo: R$ "
				+ String.format("%.2f", saldo);
	}
}
