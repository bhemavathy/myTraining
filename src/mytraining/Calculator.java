package mytraining;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter input1: ");

		float input1 = scanner.nextFloat();
		System.out.print("Enter input2: ");
		float input2 = scanner.nextFloat();
		System.out.print("Enter any one operator(+,-,*,/,%): ");
		char operator = scanner.next().charAt(0);
		float output = 0;

		switch (operator) {
		case '+':
			output = input1 + input2;
			break;
		case '-':
			output = input1 - input2;
			break;
		case '*':
			output = input1 * input2;
			break;
		case '/':
			output = input1 / input2;
			break;
		case '%':
			output = (input1 * 100) / input2;
			break;
		default:
			System.out.println("Please enter the operator from option");
			return;
		}

		System.out.printf(" %f %c %f = %f " , input1, operator, input2, output);

	}

}
