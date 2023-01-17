import java.util.ArrayList;

public class Main {

	/**
	 * @param args
	 * This method generates 100 cases of 1 to 5 random numbers by using Math.random() method, and 100 cases of 1 to 7 random numbers by using a customized random method
	 */
	public static void main(String[] args) {
		
		ArrayList<Integer> rndOneFiveList = new ArrayList<Integer>();
		ArrayList<Integer> rndOneSevenList = new ArrayList<Integer>();
		
		int testSize = 100000;
		int maxFive = 5;
		int maxSeven = 7;
		// First case: 1 to 5 random numbers by using Math.random() method
		RandomNumber rndOneFive = new RandomNumber();
		rndOneFive.setMax(maxFive);
		for(int i = 0; i < testSize; i++) {
			// Create a list of [testSize] random numbers
			rndOneFiveList.add(0, rndOneFive.getRandomInteger());
		}
		
		RandomNumber rndOneSeven = new RandomNumber(maxSeven);
		
		for(int i = 0; i < testSize; i++) {
			// Create a list of [testSize] random numbers
			rndOneSevenList.add(0, rndOneSeven.nextInt());
		}
		
		// Perform test of uniformity
		UniformityTest utFive = new UniformityTest(maxFive);
		boolean resultOneToFive = utFive.getResult(rndOneFiveList);
		if(resultOneToFive)
			System.out.println("The random sequence between 1 to 5 is uniformly distributed");
		else
			System.out.println("The random sequence between 1 to 5 is not uniformly distributed");
		
		UniformityTest utSeven = new UniformityTest(maxSeven);
		boolean resultOneToSeven = utSeven.getResult(rndOneSevenList);
		if(resultOneToSeven)
			System.out.println("The random sequence between 1 to 7 is uniformly distributed");
		else
			System.out.println("The random sequence between 1 to 7 is not uniformly distributed");
	
		
	}
	
	
}
