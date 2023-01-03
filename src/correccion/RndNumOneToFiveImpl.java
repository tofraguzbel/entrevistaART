package correccion;

/**
 * @author tofra This class generates a random number uniformly distributed
 *         between 1 and 5
 */
public class RndNumOneToFiveImpl implements RndNumOneToFive {

	private int five = 5;

	/**
	 * This method returns the random number between 1 to 5
	 */
	@Override
	public int randomNumberOneToFive(int five) {
		int x = (int) (Math.random() * ((five - minValue) + 1) + minValue);
		return x;
	}

	public int getFive() {
		return five;
	}

}
