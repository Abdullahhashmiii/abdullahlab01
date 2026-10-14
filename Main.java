import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Your Name: ");
		String name = scanner.nextLine();
		scanner.nextLine();
		
		System.out.println("My Name is " + name);
		
	}
}
