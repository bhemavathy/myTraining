package mytraining;

import java.util.Scanner;

public class Calculator {

	public void calculateWithInput(double value1, double value2, char operator1) {
		// TODO Auto-generated method stub


		double output = 0;		
		String operatorStr;
		int exit;
		Scanner scanner = new Scanner(System.in);

		do {

			System.out.println("\noptions: \n1.+\n2.-\n3./\n4.*\n5.%\n");

			System.out.print("Enter input1: ");
			value1 = scanner.nextDouble();
			System.out.print("Enter input2: ");
			value2 = scanner.nextDouble();
			System.out.print("Enter any one operator(+,-,*,/,%):");
			operatorStr = scanner.next();
			operator1 = operatorStr.charAt(0);
						
			if(operatorStr.length()== 1){
			switch (operator1){
			case '+':
				output = value1 + value2;
				System.out.println("Addition of two numbers: " + output);
				break;
				case '-':
				output = value1 - value2;
				System.out.println("Subtraction of two numbers: " + output);
				break;
				case '*':
				output = value1 * value2;
				System.out.println("Product of two numbers: " + output);
				break;
				case '/':
					try {
					output = value1 / value2;
					} catch (Exception e) {
					System.out.println(e);
					}
				System.out.println("Division of two numbers: " + output);
				break;
				case '%':
				output = (value1 * 100) / value2;
				System.out.println("Percentage of first input1 over input2: " + output);
				break;
				default:
				System.out.println("Please enter the operator from option");
				break;
			}
			}
			else {
				System.out.println("Operator is not matched");
			}
			System.out.println("\nDo you want to calculate again? please choose option 1 or 2\n1.Yes\n2.No ");
			exit = scanner.nextInt();

		} while (exit == 1);
		// System.out.printf(" %f %c %f = %f " , input1, operator, input2,
		// output);

	}
}
