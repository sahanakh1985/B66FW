
public class NonRecursieFactorialNum {
	

	    public static int factorial(int n) {
	        // Base case: factorial of 0 is 1
	   /*     if (n == 0) {
	            return 1;
	        } else {*/
	            int result = 1;
	            // Multiply numbers from 1 to n
	            for (int i = 1; i <= n; i++) {
	                result *= i;
	            }
	            return result;
	        }
	   // }

	    public static void main(String[] args) {
	        int number = 5;
	        int result = factorial(number);
	        System.out.println("The factorial of " + number + " is " + result);
	    }
	}


