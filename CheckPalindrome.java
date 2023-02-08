package Week1day2;

public class CheckPalindrome {

	

	public static void main(String[] args) {
		
	
		int number = 34343;
	    int originalNumber = number;
	    int reverse = 0;

	    // Reverse the number 
	    while (number != 0) {
	      int lastDigit = number % 10;
	      reverse = reverse * 10 + lastDigit;
	      number /= 10;
	    }

	    // Check if the number is a palindrome
	    if (originalNumber == reverse) {
	      System.out.println(originalNumber + " is a palindrome");
	    } else {
	      System.out.println(originalNumber + " is not a palindrome");}}}