package by.yatsenko.lsnthree;

import java.util.Scanner;

public class Task3and4 {

	public static void main(String[] args) {
		
		int row;
		int col;
		int r1;
		int r2;
		
		Scanner in = new Scanner(System.in);
		
		//Getting number of rows and columns
		System.out.println("Input the number of rows");
		row = in.nextInt();
		
		System.out.println("Input the number of columns");
		col = in.nextInt();
		
		//Creating matrix filled with random integer from 0 to 100
		int mtx [][] = new int [row][col];
		int max[] = new int [col];
		
		for (int i = 0; i < row; i++) {			
			for(int j = 0; j < col; j++) {
				
				mtx[i][j] = (int) Math.ceil(Math.random() * 100);
				
			}
			
			System.out.println(java.util.Arrays.toString(mtx[i]));
		}
		
		//Finding out which rows to swap
		System.out.println("Input the index of 1st row for swapping");
		r1 = in.nextInt();
		
		System.out.println("Input the index of 2nd row for swapping");
		r2 = in.nextInt();
		
		//Swapping rows;
		int tmp[] = new int [col];
		
		for(int j = 0; j < col; j++) {
			
			tmp[j] = mtx[r1-1][j];
			mtx[r1-1][j] = mtx[r2-1][j];
			mtx[r2-1][j] = tmp[j];
		}
		
		//Printing result
		for(int i =0; i < row; i++) {
			System.out.println(java.util.Arrays.toString(mtx[i]));
		}
		
		//Finding max element for each column
		for (int j = 0; j < col; j++) {
			
			for(int i= 0; i < row; i++) {
				
				if (mtx [i][j] > max[j]) {
					max[j] = mtx [i][j];
				}
			}
		}
		
		System.out.println("Max elements for each column");
		System.out.println(java.util.Arrays.toString(max));
						

		

	}

}
