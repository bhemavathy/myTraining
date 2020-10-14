package CalcFromExternalInput;

public class Calculator {

	public double calculateWithInput(double value1, double value2, char operator1) {
		// TODO Auto-generated method stub

		double output = 0;
		
		switch (operator1) {
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
			System.out.println("Percentage of first input1 over input2: "
					+ output);
			break;
		default:
			System.out.println("Please enter the operator from option");
			break;
		}
		return output;

	}
}
