package bee;

import java.util.Scanner;

public class Bee2862 {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int T = in.nextInt();
			int power = 0;
			for(int i = 0; i < T; i++) {
				while(power < 100 || power > 100000) {
					power = in.nextInt();
				}
				if(power > 8000) {
					System.out.println("Mais de 8000!");
				} else {
					System.out.println("Inseto!");
				}
				power = 0;
			}
		}
	}
}
