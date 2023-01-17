import java.util.Date;

/**
 * @author tofra
 *
 */
public class RandomNumber {

	protected final int MIN = 1;
	private int max;
	private int last;

	/**
	 * @param max Max number setter
	 */
	public void setMax(int max) {
		this.max = max;
	}

	/**
	 * Constructor for Math.random() method
	 */
	public RandomNumber() {
		super();
	}

	/**
	 * @param max Constructor for customized random method. Here is the seed to
	 *            start
	 */
	public RandomNumber(int max) {
		this.max = max;
		Date date = new Date();
		long ms = date.getTime();
		last = (int) (ms % max);
	}

	/**
	 * @return Random numbers by using the Math.random() method
	 */
	public int getRandomInteger() {
		int x = (int) (Math.random() * ((max - MIN) + 1) + MIN);
		return x;
	}

	/**
	 * @return Customized random method. This method is based in multiplicative
	 *         linear congruential generator
	 *         (https://www.ams.org/journals/mcom/1999-68-225/S0025-5718-99-00996-5/S0025-5718-99-00996-5.pdf)
	 */
	public int nextInt() {
		// x(n) = a(x-1) mod m. Parameter [m] must be prime. Parameter [a] was selected
		// from the referenced paper. [last] is the seed
		int modulus = 32749;
		int a = 32530;
		last = (last * a) % modulus;

		// Normalizing results to desired range:
		int result = last % max + 1;
		return result;
	}

}
