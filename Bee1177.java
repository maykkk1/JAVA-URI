package bee;

import java.util.Scanner;

public class Bee1177 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T;
		int contador = 0;
		int[] arr = new int[1000];
		
		while(true) {
			T = in.nextInt();
			if(T >= 2 && T <= 50) {
				break;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = contador;
			contador = contador < T-1 ? contador+=1 : 0;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("N[" + i + "] = " + arr[i]);
		}
	}
}
