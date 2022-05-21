package bee;

import java.util.Scanner;

public class Bee1146 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x;
		while(true) {
			x = in.nextInt();
			if(x ==0) break;
			for(int i = 0; i < x; i++) {
				if(i == (x-1)) {
					System.out.println((i+1));
				}else {
					System.out.print((i+1));
					System.out.print(" ");
				}			
			}
		}
	}
}
