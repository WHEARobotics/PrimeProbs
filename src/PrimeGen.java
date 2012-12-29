/*
 * Implements a prime number generator.
 * */

public class PrimeGen {
	private int limit; // all primes will be less than this number.
	private int index = 0; // Index into array.
	private int [] primes = {2};
	
	public PrimeGen(int maxPrime){
		// Currently a stub that only creates an array of 5 primes.
		if (maxPrime <= 2){
			limit = 2;  // primes member variable initialized above.
		} else {
			int [] temp = {2,3,5,7,11};
			primes = temp;
		}
	}
	
	public int nextPrime(){
		// When called, returns the next prime number in the series.  
		// If the end is reached, returns zero.
		if (index < primes.length) {
			index++;
			return primes[index-1];  // Must add first, beause return leaves method.
		} else {
			return 0;
		}
	}
	
	public int[] primeArray(){
		// Returns an array of primes from 2 to the prime just less than maxPrime.
		return primes;
	}
}
