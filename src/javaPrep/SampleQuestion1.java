package javaPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SampleQuestion1 {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> km = new ArrayList<String>();
		for (int i = 0; i < 999; i++) {
			km.add(sc.next());
			if (km.get(i).charAt(0) == 'q')
				break;
			count++;
		}

		sc.close();
		if (count < 6)
			System.out.println("minimum input contains 6 values as kilometer");
		else {
			float R[] = new float[count];
			for (int i = 0; i < count; i++) {
				R[i] = Float.parseFloat(km.get(i));
			}
			Arrays.sort(R);

			int index = 0;
			float output[] = new float[3];
			for (int i = count - 4; i >= count - 6; i--)
				output[index++] = R[i];
			System.out.println(Arrays.toString(output));
		}
		
	}

}
