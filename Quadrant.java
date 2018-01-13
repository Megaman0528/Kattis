import java.util.Scanner;
public class Quadrant {
public static Scanner pos = new Scanner(System.in);
public static void main(String[] arg){
	int x = pos.nextInt();
	int y = pos.nextInt();
	if (x > 0 && y > 0){
		System.out.println(1);}
	else if (x < 0 && y > 0){
		System.out.println(2);}
	else if (x < 0 && y < 0){
		System.out.println(3);}
	else { System.out.println(4);}
	}
	}
	

