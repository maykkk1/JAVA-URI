package bee;

import java.util.Scanner;

public class Bee1048 {
	public static double getPercentage(double salario) {
		if(salario <= 400) return 0.15;
		if(salario <= 800) return 0.12;
		if(salario <= 1200) return 0.10;
		if(salario <= 2000) return 0.07;
		return 0.04;
	}
	
	public static String formatDouble(double number) {
		return String.format("%.2f", number).replace(",", ".");
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salario = input.nextFloat();
		double percentage = getPercentage(salario);
		System.out.println("Novo salario: " + formatDouble(salario + (percentage * salario)));
		System.out.println("Reajuste ganho: " + formatDouble(salario * percentage));
		System.out.println("Em percentual: " + (int)Math.round(percentage*100) + " %");
	}
}
