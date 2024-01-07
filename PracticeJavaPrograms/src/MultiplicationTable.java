import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n value");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= n; j++) {
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");

			}
			System.out.println();

		}

	}

}
