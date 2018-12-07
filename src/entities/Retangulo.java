package entities;

public class Retangulo {

	public double a;
	public double b;

	public double area() {
		return a * b;
	}

	public double perimetro() {

		return 2 * (a + b);

	}

	public double diagonal() {
		double d = Math.pow(a, 2) + Math.pow(b, 2);
		return Math.sqrt(d);

	}
	
	public String toString() {

		return "AREA = " + String.format("%.2f%n", area()) 
		+ "PERIMETRO = " + String.format("%.2f%n", perimetro()) 
		+ "DIAGONAL = " + String.format("%.2f%n", diagonal());
	}
}
