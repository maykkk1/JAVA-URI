package bee;

import java.util.Scanner;

public class Bee1044 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		String res;
		
		
		if(num1 > num2) {
			res = num1 % num2 == 0 ? "Sao Multiplos" : "Nao sao Multiplos";
		} else if (num2 > num1) {
			res = num2 % num1 == 0 ? "Sao Multiplos" : "Nao sao Multiplos";
		} else {
			res = "Sao Multiplos";
		}
		
		
		
		System.out.println(res);
	}
}

