import java.util.*;
public class Problem_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("a: ");
		double a = sc.nextDouble();
		System.out.print("b: ");
		double b = sc.nextDouble();
		System.out.print("Type of operation");
		String operation = sc.next();
		double result = 0;
		boolean valid = true;
		switch (operation) {
		case "add":
			result = a + b;
			break;
		case "subtract":
			result = a - b;
			break;
		case "multiply":
			result = a * b;
			break;
		case "divide":
			if (b != 0) {
				result = a / b;
			} else {
				System.out.println("Division by zero is not possible");
				valid = false;
			}
			break;
		default:
			System.out.println("Type Mismatch , Please enter of of operation add, subtract, multiply, divide");
			valid = false;
		}

		if (valid) {
			System.out.println("Result: " + result);
		}
		sc.close();
	}

}

