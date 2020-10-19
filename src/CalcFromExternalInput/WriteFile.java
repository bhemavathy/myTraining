package CalcFromExternalInput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	BufferedWriter bw = null;
	public  WriteFile(){
		
		try {
			 bw = new BufferedWriter(new FileWriter("F://Randomout.csv", true));
			 String heading = "input1,operator,input2,=,result";
				bw.append(heading);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	} 
	

	public void writeOutputFile(InputReturnValues inpValues, double output) {
		
		 try {
			bw = new BufferedWriter(new FileWriter("F://Randomout.csv", true));
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		

		String calcin3 = Double.toString(output);
		double input1 = inpValues.getInput1();
		double input2 = inpValues.getInput2();
		char operator = inpValues.getChar();

		String result = input1 + "," + operator + "," + input2 + "," + "="
				+ "," + calcin3;

		try {
			bw.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			bw.append(result);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {

			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
