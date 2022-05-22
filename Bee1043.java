package bee;

import java.util.Scanner;

public class Bee1043 {
	public static String formatDouble(double number) {
		return String.format("%.1f", number).replace(",", ".");
	}
	public static boolean isTriangle(double ladoA, double ladoB, double ladoC) {
		if((ladoB + ladoC) <= ladoA) return false;
		if((ladoA + ladoC) <= ladoB) return false;
		if((ladoA + ladoB) <= ladoC) return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double ladoA = in.nextDouble();
		double ladoB = in.nextDouble();
		double ladoC = in.nextDouble();
		
		if (isTriangle(ladoA, ladoB, ladoC)) {
			System.out.println("Perimetro = " + formatDouble(ladoA + ladoB + ladoC));
		} else {
			System.out.println("Area = " + formatDouble(((ladoA + ladoB) * ladoC)/2));
		}
	}
}
