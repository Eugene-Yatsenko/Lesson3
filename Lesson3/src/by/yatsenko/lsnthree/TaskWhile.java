package by.yatsenko.lsnthree;

import java.util.Scanner;

public class TaskWhile {

	public static void main(String[] args) {

			Scanner in = new Scanner(System.in);
			System.out.println("Загони номерок бро!");
			int n = in.nextInt();
			long f=1;
			int i=1;
			
			int digits[] = new int[10];
			int dim = 0;
			int sum = 0;
			int x=1; 
			int tmp;
			
		    while (i <= n) {
		    	
		    	f=f*(long)i;
		    	i++;
		    	
		    }
		    
		    System.out.println("Result = " + f);
		    
		    while (x <= n) {
		    	
		    	x = x*10;
		    	dim++;
		    	
		    }
		    
		    System.out.println("Num of digits = " + dim);   
	   
		    for ( i = 1; i <= dim; i++ ) {
		    	
		    	tmp = n % 10;
		    	digits[i-1] = tmp;
		    	n =	n/10;
		    	System.out.println(tmp);
		    }
		    
		    for ( i = 1; i <= dim; i++ ) {
		    	
		    	if ((digits[i-1] % 2) == 0) {
		    		
		    		sum = sum + digits[i-1];
		    	}
		    }
		    
		    System.out.println("Sum of even digits = " + sum); 
           
	}
   
}
