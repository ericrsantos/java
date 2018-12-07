package application;

public class Vect {

	public static void main(String[] args) {
	Integer[] vect = new Integer[] {2,4,6,8,10,12,14,16,18,20};
	
	
	for (int i=0; i<vect.length; i++) {
		System.out.println(vect[i]);
	}
	System.out.println("===================================================================================================");
	for (int numeros: vect) {
		
		System.out.println(numeros + 1);
	}
		
	}
	
}
