package util;

public class ConversorMoeda {

	public static double IOF= 0.06;
	
	public static double conversor(double quantidade, double cotacao) {
		return  quantidade * cotacao * (1.0 + IOF);
	}
	
}
