package bee;

import java.util.Scanner;

public class Bee3249 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String battle;
		String[] battleArr;
		
		int battles = in.nextInt();
		int loses = 0;
		
		for (int i = 0; i < battles; i++) {
			battle = in.next();
			battleArr = battle.toUpperCase().split("");
			for (int x = 0; x < battleArr.length - 1; x++ ) {
				if (battleArr[x].equals("C") && battleArr[x + 1].equals("D")) loses++;
			}
		}
		
		System.out.println(battles - loses);

		
	}
}
