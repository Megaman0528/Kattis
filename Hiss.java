import java.util.Scanner;
public class Hiss {
	public static Scanner hiss = new Scanner(System.in);
	public static void main(String[] arg){
String i = hiss.nextLine();
 if (i.contains("ss") && i.length() <= 30 ){
	System.out.println("hiss"); 
 }
 else{ 
	 System.out.println("no hiss");
 }
	}
}