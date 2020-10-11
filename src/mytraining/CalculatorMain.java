package mytraining;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		int exit;
		// TODO Auto-generated method stub
		do {
			double input1, input2;
			char operator;
			Scanner scanner = new Scanner(System.in);
			System.out.println("\noptions: \n1.+\n2.-\n3./\n4.*\n5.%\n");
			System.out.print("Enter input1: ");
			input1 = scanner.nextDouble();
			System.out.print("Enter input2: ");
			input2 = scanner.nextDouble();
			System.out.print("Enter any one operator(+,-,*,/,%):");
			String operatorStr = scanner.next();			
			operator = operatorStr.charAt(0);
			Calculator calculator = new Calculator();

			if (operatorStr.length() == 1) {
				calculator.calculateWithInput(input1, input2, operator);
			} else {
				System.out.println("Operator is not matched");
			}

			System.out
					.println("\nDo you want to calculate again? please choose option 1 or 2\n1.Yes\n2.No ");
			exit = scanner.nextInt();
		} while (exit == 1);

	}

}
