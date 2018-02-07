package by.yatsenko.lsnthree;

public class Task2 {
	
	public static void main(String[] args) {
		
		double a[] = new double[20];
		double b[] = new double[20];
		int bCount = 0;
		double sum = 0;
		
		//Creating array A
		System.out.println("Array A has following elements");
		
		for(int i=0; i < 20 ; i++) {
			
			a[i] = (double)(-100*Math.random() + Math.random()* 100);
			System.out.println(a[i]);
		}
		
		//Creating array B, counting number of elements for array B
		System.out.println();
		System.out.println("Array B has following elements");
		
		for(int i=0; i < 20 ; i =i+2) {
			
			if (a[i] >= 0) {
				b[bCount] = a[i];
				System.out.println(b[bCount]);
				bCount++;
			}
			
		}
		
		//Counting Sum
		System.out.println();
		System.out.print("Sum = ");
		
		for(int i= 0; i < bCount ; i++) {
			
			sum = sum + a[i] * a[i];
			
		}
		
		System.out.printf("%.2f", sum);

	}

}
