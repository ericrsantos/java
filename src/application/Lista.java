package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;



public class Lista{

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(14);
		list.add(13);
		list.add(19);
		list.add(01);
		list.add(-21);
		list.add(111);
		list.add(1567);
		list.add(1456);
		list.add(1);
		list.add(14);
		list.add(13);
		list.add(19);
		list.add(01);
		list.add(-21);
		list.add(111);
		list.add(1567);
		list.add(1456);
		list.add(0, 251488882);
		

		System.out.println("Lista com " + list.size() + " posições"); 
		
		for (int numeros : list) {
			
			System.out.printf("Numero da lista %.2f%n", numeros * 0.54 );
		}
		
		sc.close();
	}
	
}