package CalcFromExternalInput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class GenerateRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "F:\\Random.txt";
		Random rg = new Random();
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileOutputStream(path));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int[] num = new int[1000];
		for (int i = 1; i < 1000; i++) {
			num[i] = rg.nextInt();

			pw.println(num[i]);
		}

		pw.close();

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
