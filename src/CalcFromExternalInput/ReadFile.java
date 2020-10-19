package CalcFromExternalInput;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ReadFile {

	public List<InputReturnValues> readinputfile(String path) {

		// String path = "Inputs.csv";
		String line = "";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(path));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		List<InputReturnValues> list = new ArrayList<InputReturnValues>();

		try {

			try {
				line = br.readLine();
				while ((line = br.readLine()) != null) {
					String[] calcin = line.split(",");// use comma as separator
					double input1 = Double.parseDouble(calcin[0]);
					char operator = calcin[2].charAt(0);
					double input2 = Double.parseDouble(calcin[1]);

					System.out.println("Input1 =" + calcin[0] + ",Operator="
							+ calcin[2] + ", Input2=" + calcin[1] + "]");
					
					InputReturnValues irv = new InputReturnValues();
					irv.setInput1(input1);
					irv.setInput2(input2);
					irv.setOperator(operator);
					list.add(irv);
					
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	


	
	 
	 
	public static void read(String path) {
		BufferedInputStream br = null;
		try {
			br = new BufferedInputStream(new FileInputStream(path));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(br, "UTF-8");
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
