
public class RecursiveFactorialNum {

	public static int factorial(int n) {
		// Base case: factorial of 0 is 1
		if (n == 0) {
			return 1;
		} else {
			// Recursive case: n! = n * (n-1)!
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		int number = 5;
		int result = factorial(number);
		System.out.println("The factorial of " + number + " is " + result);
	}
}
