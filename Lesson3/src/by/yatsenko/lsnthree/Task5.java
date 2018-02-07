package by.yatsenko.lsnthree;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		int x;
		
		//Initializing 2D array
		int mtx[][] = {
				       {2,3,55,5,555},
					   {4,5,6},
		               {2,3,2,5,6,6,6}			
		};
		
		//Getting X from console
		System.out.println("Input search key");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		
		int c = 0;
		
		//Counting how many elements are equal to X
		for(int i = 0; i < mtx.length; i++) {
			for(int j=0; j < mtx[i].length; j++) {
				if (mtx[i][j] == x){

				c++;
			   }
			
		    }
			
	     }
		
		//Printing count(if count = 0 element has not been found) 
		if (c == 0) {
			System.out.println("Element '"+x+"' has not been encountered");
		} else {
			System.out.println("Element '"+x+"' has been encountered "+c+" times");
		}
	}
}
