import java.util.Scanner;

import pack.*;

public class FactorialMain {
	public static void main(String[] args) {

		PackDemo obj = new PackDemo();
		obj.show();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the N value");
		int n = sc.nextInt();

		Factorial obj2 = new Factorial();
		int res = obj2.fact(n);
		System.out.println("The factorial of " + n + " is " + res);

	}

}
