package by.yatsenko.lsnthree;

public class Task1 {

	public static void main(String[] args) {
		
		int a[] = {327, 381, 891, 918, 212, 848, 770, 363, 416, 736};
		double b[] = new double [a.length];
		double v = 10.00000;
		
		System.out.println(max(a));
		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			
			b[i] = (double) a[i] / max(a);
			System.out.printf("%.2f\n", b[i]);
		}
		
				

	}
	
	 public static int max (int a[]) {

		 int tmp = 0;
		 for(int i = 0; i < a.length; i++) {
			 
			 if(tmp < a[i]) {
				 
				 tmp =  a[i];
			 }
			 
		 }
		 
		 return tmp;

	 }

}
