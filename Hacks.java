import java.util.Scanner;

public class Hacks {
	public static Scanner hack = new Scanner(System.in);
	static int b = hack.nextInt();

	public static void main(String[] arg) {
		for (int a = 0; a < b; a++) {
			int x = hack.nextInt();
			int y = hack.nextInt();
			int z = hack.nextInt();
			if ( y - z > x) {
				System.out.println("advertise");
			} else if (y - z == x) {
				System.out.println("does not matter");
			} else {
				System.out.println("do not advertise");
			}
		}
	}
}