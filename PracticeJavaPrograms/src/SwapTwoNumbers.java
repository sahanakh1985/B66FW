
public class SwapTwoNumbers {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("X:" + x);
		System.out.println("Y:" + y);
		
		System.out.println("________________________");

		// now the value of x=20 and y=10
		x = x * y;
		y = x / y;
		x = x / y;

		System.out.println("X:" + x);
		System.out.println("Y:" + y);
	}

}
