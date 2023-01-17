import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class UniformityTest {
	int max;
	private final int THRESHOLD = 50;

	public UniformityTest(int max) {
		super();
		this.max = max;
	}

	public boolean getResult(ArrayList<Integer> rndList) {
		int max = Collections.max(rndList);

		int maxFrequency = 0;
		int minFrequency = 0;
		int differenceBetweenMaxAndMinFrequency = 0;

		// Threshold to validated the obtained difference between max and min
		// frequencies
		int differenceBetweenMaxAndMinFrequencyAdmitted = (int) ((rndList.size() / max) / THRESHOLD);

		// Map of classes vs frequencies of random generator
		HashMap<Integer, Integer> frequencies = new HashMap<Integer, Integer>();
		for (int i = 1; i <= max; i++) {
			frequencies.put(i, Collections.frequency(rndList, i));
		}

		// Set of frequencies
		ArrayList<Integer> freq = new ArrayList<Integer>();
		for (int i = 1; i < frequencies.size() + 1; i++) {
			freq.add(frequencies.get(i));
		}

		maxFrequency = Collections.max(freq);
		minFrequency = Collections.min(freq);
		differenceBetweenMaxAndMinFrequency = maxFrequency - minFrequency;

		if (differenceBetweenMaxAndMinFrequency < differenceBetweenMaxAndMinFrequencyAdmitted)
			return true;

		return false;
	}
}
