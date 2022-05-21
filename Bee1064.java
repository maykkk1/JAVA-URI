package bee;

import java.util.Scanner;

public class Bee1064 {
	public static String formatDouble(double number) {
		return String.format("%.1f", number).replace(",", ".");
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int contador = 0;
		double soma = 0;
		double num;
		for(int i = 0; i < 6; i++) {
			num = in.nextDouble();
			if(num >= 0) {
				contador++;
				soma += num;
			}
		}
		System.out.println(contador + " valores positivos");
		System.out.println(formatDouble(soma/contador));
	}
}
