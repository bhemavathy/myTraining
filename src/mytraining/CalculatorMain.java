package mytraining;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double input1, input2;
		char operator;
		Scanner scanner = new Scanner(System.in);
		System.out.println("\noptions: \n1.+\n2.-\n3./\n4.*\n5.%\n");
		System.out.print("Enter input1: ");
		input1 = scanner.nextDouble();
		System.out.print("Enter input2: ");
		input2 = scanner.nextDouble();
		System.out.print("Enter any one operator(+,-,*,/,%): ");
		operator = scanner.next().charAt(0);
		
		Calculator calculator =new Calculator();
		calculator.calculateWithInput(input1,input2,operator);
		
		 		
		
		
	}

}
