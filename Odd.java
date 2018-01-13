import java.util.Scanner;

public class Odd {
	public static Scanner odd = new Scanner(System.in);
	static int z = odd.nextInt();

	public static void main(String[] arg) {
		for (int j = 0; j < z; j++) {
			int i = odd.nextInt();
			if (i % 2 == 1 || i % 2 == -1) {
				System.out.println(i + " is odd");
			} else {
				System.out.println(i + " is even");
			}
		}
	}
}
