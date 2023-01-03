package correccion;

public class Main {

	public static void main(String[] args) {

		RndNumOneToFiveImpl rndOneFive = new RndNumOneToFiveImpl();

		System.out.println("Número aleatorio entero uniformemente distribuido entre 1 y 5: "
				+ rndOneFive.randomNumberOneToFive(rndOneFive.getFive()));

		RndNumOneToSeven rndOneSeven = new RndNumOneToSeven();

		int seven = 7;
		System.out.println("Número aleatorio entero uniformemente distribuido entre 1 y 7: "
				+ rndOneSeven.randomNumberOneToFive(seven));

	}

}
