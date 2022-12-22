public class RandomNumber {
	
	protected final int min = 1;
	protected int max;
	
	/*
	 * Getters and setters
	 */
	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	// Constructor
	public RandomNumber() {
		super();
	}

	/*
	 * Random numbers
	 */
	public int getRandomInteger(){
	    int x = (int) (Math.random()*((max-min)+1)+min);
	    return x;
	}

}
