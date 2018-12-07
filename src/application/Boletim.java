package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;


public class Boletim {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();

		aluno.nome = sc.nextLine();
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		double media = aluno.calculaMedia();
		System.out.printf("MEDIA FINAL: %.2f%n", media );
		if (media > 60 ) {
			System.out.println("PASS");
		} else {
		double result = 60 - media;
			System.out.println("REPROVADO");
			System.out.printf("FALTOU: %.2f PONTOS", result);
		}
		sc.close();
	}

}
