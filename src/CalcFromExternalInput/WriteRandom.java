package CalcFromExternalInput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class WriteRandom {

	static BufferedWriter bw = null;

	public WriteRandom() {

		try {
			bw = new BufferedWriter(new FileWriter("F:\\Random.csv"));
			String heading = "input1,input2,operator,=,result";
			bw.append(heading);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void write() throws IOException {

		Random rg = new Random();
		String[] op = { "+", "-", "*", "/", "%" };

		for (int i = 0; i < 10; i++) {
			double input1 = (rg.nextDouble()) * 100;
			double input2 = (rg.nextDouble()) * 100;
			int operator = (rg.nextInt(op.length));

			String inputs = input1 + "," + input2 + "," + op[operator];
			bw.newLine();
			bw.append(inputs);

		}

		try {

			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
