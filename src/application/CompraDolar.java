package application;

import java.util.Locale;
import java.util.Scanner;

import util.ConversorMoeda;


public class CompraDolar {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a cotação do dolar? ");
		double cotacao = sc.nextDouble();
		
				
		System.out.println("Quantos dolares deseja comprar? ");
		double quantidade = sc.nextDouble();
		
		double result = ConversorMoeda.conversor(quantidade, cotacao);
		System.out.printf("Total a Pagar %.2f%n",result);
		
		sc.close();
	}

}
