package mytraining;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CalcFromExtInput {

	public  void fileRead() throws IOException {
		//public static void main(String[] args) {
		// TODO Auto-generated method stub

		String line = "";
		try {
			// parsing a CSV file into BufferedReader class constructor
			BufferedReader br = new BufferedReader(new FileReader(
					"F:\\Inputs.csv"));
			while ((line = br.readLine()) != null) // returns a Boolean value
			{
				String[] calcin = line.split(","); // use comma as separator
				System.out.println("Input1 =" + calcin[0] + ",Operator="
						+ calcin[1] + ", Input2=" + calcin[2] + "]");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
