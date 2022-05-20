package bee;

import java.util.Scanner;

public class Bee1042 {
	public static int[] ascendingOrder(int[] list)
	{
	    int i, key, j;
	    for (i = 1; i < list.length; i++)
	    {
	        key = list[i];
	        j = i - 1;
	        while (j >= 0 && list[j] > key)
	        {
	        	list[j + 1] = list[j];
	            j = j - 1;
	        }
	        list[j + 1] = key;
	    }
	    return list;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] list = new int[3];
		int[] orderedList = new int[3];
		int aux;
		for (int i = 0;i<3;i++) {
			aux = in.nextInt();
			list[i] = aux;
			orderedList[i] = aux;
		}
		orderedList = ascendingOrder(orderedList);
		for(int i = 0; i < list.length; i++) {
			System.out.println(orderedList[i]);
		}
		
		System.out.println("");
		
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
		
	}

}
