
public class N3LargestPrime extends myHelpers{
	public static void main(String []args) {
		System.out.println(largestPrime(600851475143L));
	}
	
	// largest Prime factor of the given number
	public static long largestPrime(long n) {
		long prime = 2;
		long i = n;
		do {
			if (i%prime==0)
				i=i/prime;
			else
				prime = nextPrime(prime);
		} while (i!=1);
		return prime;
	}
}
