package calc;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please choose an option 1.add 2.subtract 3.divide 4.multiply");
		int choice = in.nextInt();
		System.out.println("Please enter two numbers");
		int a = in.nextInt();
		int b = in.nextInt();
		switch(choice) {
			case 1:
				System.out.println(a + " + " + b + " = " + add(a, b));
				break;
			case 2:
				System.out.println(a + " - " + b + " = " +sub(a, b)); 
				break;
			case 3:
				System.out.println(a + " / " + b + " = " +divide(a, b)); 
				break;
			case 4:
				System.out.println(a + " * " + b + " = " +multiply(a, b)); 
				break;
				default:
					System.out.println("Error");
		}

	}
	public static int add(int a, int b) {
		return a + b;
	}
	public static int sub(int a, int b) {
		return a - b;
	}
	public static double divide(int a, int b) {
		return a / b;
	}
	public static int multiply(int a, int b) {
		return a * b;
	}

}
