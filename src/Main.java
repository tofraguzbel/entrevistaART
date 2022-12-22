
public class Main {

	public static void main(String[] args) {
		
		RandomNumber rndOneFive = new RandomNumber();
		rndOneFive.setMax(5);
		
		System.out.println("Número aleatorio entero uniformemente distribuido entre 1 y 5: " + rndOneFive.getRandomInteger());
		
		RandomNumber rndOneSeven = new RandomNumber();
		rndOneSeven.setMax(7);
		
		System.out.println("Número aleatorio entero uniformemente distribuido entre 1 y 7: " + rndOneSeven.getRandomInteger());
		
	}
	
	
}
