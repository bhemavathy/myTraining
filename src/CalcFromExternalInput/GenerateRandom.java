package CalcFromExternalInput;

import java.io.IOException;
import java.util.List;

public class GenerateRandom {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "F:\\Random.csv";

		WriteRandom wr = new WriteRandom();

		wr.write();

		ReadFile rf = new ReadFile();

		List<InputReturnValues> inputslist = rf.readinputfile(path);

		WriteFile wf = new WriteFile();

		for (InputReturnValues inpValues : inputslist) {

			double output = calculateWithInput(inpValues.getInput1(),
					inpValues.getInput2(), inpValues.getChar());

			wf.writeOutputFile(inpValues, output);

		}

	}

	public static double calculateWithInput(double value1, double value2,
			char operator1) {

		double output = 0;
		Calculate calculate = new Calculate();
		switch (operator1) {
		case '+':
			output = calculate.add(value1, value2);
			break;
		case '-':
			output = calculate.sub(value1, value2);
			break;
		case '*':
			output = calculate.multiply(value1, value2);
			break;
		case '/':
			output = calculate.divide(value1, value2);
			break;
		case '%':
			output = calculate.percentage(value1, value2);
			break;
		default:
			System.out.println("Please enter the correct operator");
			break;
		}
		return output;
	}

}
