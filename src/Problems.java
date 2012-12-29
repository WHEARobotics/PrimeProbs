
public class Problems {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrimeGen gen = new PrimeGen(12); // Prime number generator.
		int temp = gen.nextPrime();
		while (temp != 0){
			System.out.println(temp);
			temp = gen.nextPrime();
		}

		System.out.println("10001st prime: " + problem07());
		System.out.println("Sum primes < 2E6: " + problem10());

	}
	
	private static int problem07(){
		// The 10001st prime.
		return 0;
	}
	
	private static int problem10(){
		// The sum of all primes below 2 million.
		return 0;
	}

}
