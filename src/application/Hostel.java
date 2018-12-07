package application;

import entities.Estudantes;

import java.util.Locale;
import java.util.Scanner;

public class Hostel {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudantes[] vect = new Estudantes[10];
		
		int ne = vect.length; 
		
		System.out.println("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Quarto n.° " + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Numero do quarto : ");
			int quarto = sc.nextInt();
			vect[quarto] = new Estudantes(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos Ocupados:");
		for (int i=0; i< ne; i++) {
		if (vect[i] != null) {
		System.out.println(i + ": " + vect[i]);
		}
		}
		
		
		
		
		
		
		sc.close();

	}

}
