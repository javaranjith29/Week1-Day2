package Week1day2;

public class PrimeNumber {

	 public static void main(String[] args) {

		    int num = 3;
		    //assign the boolean as default value
		    boolean flag = false;
		    // Assign the for loop
		    for (int i = 1; i <= num / 2; ++i) {
		      // condition for nonprime number
		      if (num %i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
		}