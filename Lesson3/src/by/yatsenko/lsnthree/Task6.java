package by.yatsenko.lsnthree;

public class Task6 {

	public static void main(String[] args) {
		
		int a[][] = new int[4][5];
		int count = 0;
		
		//Initializing array
		System.out.println("Array A has following elements");
		
		for(int i=0; i < a.length ; i++) {
			for(int j=0; j < a[i].length; j++) {
			
				a[i][j] = (int)Math.ceil((Math.random()* 200));
			}
			System.out.println(java.util.Arrays.toString(a[i]));
		}
		
		//Calling isEven method for every element of array
		for(int i=0; i < a.length ; i++) {
			for(int j=0; j < a[i].length; j++) {
			
				if (isEven(a[i][j])) {
					count ++;
				}
			}
			
		}
		
//		System.out.println(isEven(22));
//		System.out.println(isEven(25));
//		System.out.println(isEven(222));
//		System.out.println(isEven(2));	
		
		//Printing count to console
		System.out.println("Number of element between 9 and 100 with even sum of digits = "+ count);
		
	}

// Method for checking if 9 < a < 100; returns TRUE if a has even sum of digits
	 public static boolean isEven(int a) {
		 
		 // Initializing variables
		 int d1 = 0;
		 int d2 = 0;
		 int s = 0;
		 		 
		 // Checking if a has 2 digits
		 if ((a < 100) && (a > 9)){
		    	d2 = a%10;
		    	a = a/10;
		    	d1 = a%10;
		 } else {
			 return false; 
		 }
		 
		 // Sum of digits
		 s = d1+d2;
		 
		 // Checking if sum of digits is even
		 if (s%2 == 0) {
			 return true;
		 } else {
			 return false;
		 }
   
	 }

}
