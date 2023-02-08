package Week1day2;

public class FindIntersection {

	public static void main(String[] args) {
	
		 // Pseudo Code
		
		 // a) Declare An array for {3,2,11,4,6,7};
		int[] num1= {3,2,11,4,6,7};
		 
		 // b) Declare another array for {1,2,8,4,9,7};
		int[] num2 = {1,2,8,4,9,7};
		
		 // c) Declare for loop iterator from 0 to array length
	
			for (int i = 0; i < num1.length; i++) {
				  for (int j = 0; j < num2.length; j++) {
				    System.out.println(num1[i] + " " + num2[j]);
		}

	}

	}}
