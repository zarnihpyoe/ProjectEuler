import java.util.LinkedList;

public abstract class myHelpers {

	// list even numbers from the given list
	public static LinkedList<Integer> onlyEven(LinkedList<Integer> alist) {
		LinkedList<Integer> evenList = new LinkedList<Integer>();
		for (int e : alist) {
			if (e%2 == 0) {
				evenList.add(e);
			}
		}
		return evenList;
	}

	// sum the list
	public static int sum(LinkedList<Integer> alist) {
		int sum = 0;
		for (int e : alist) {
			sum +=e;
		}
		return sum;
	}

	// return a list of Fibonacci numbers
	public static LinkedList<Integer> getFibonacciList(int maxLimit, int init1, int init2) {
		int fibo1 = init1, fibo2 = init2, fibonacci = 0;
		LinkedList<Integer> fibonacciList = new LinkedList<Integer>();
		fibonacciList.add(1);
		fibonacciList.add(2);

		while (fibo1+fibo2 <= maxLimit) {
			fibonacci = fibo1 + fibo2;
			fibonacciList.add(fibonacci);
			fibo1 = fibo2;
			fibo2 = fibonacci;
		}
		return fibonacciList;
	}

	// true if given year is a leap year
	public static boolean isLeapYear(int year) {
		return (year%400 == 0) || (year%4 == 0 && year%100 != 0);
	}




	// numbers ---------------------------------------------------



	// method checking whether the given number is a prime
	// int Version
	public static boolean isPrime(int a) {
		if (a<2) {
			return false;
		} else if (a==2) {
			return true;
		} else {
			for (int i=2; i<=Math.sqrt(a); i++) {
				if (a%i==0) {
					return false;
				}
			}
			return true;
		}
	}

	// long Version
	public static boolean isPrime(long a) {
		if (a<2) {
			return false;
		} else if (a==2) {
			return true;
		} else {
			for (long i=2; i<=Math.sqrt(a); i++) {
				if (a%i==0) {
					return false;
				}
			}
			return true;
		}
	}


	// calling for the next prime of the given number
	// int Version
	public static int nextPrime(int a) {
		int nextPrime = a;
		do {
			nextPrime++;
		} while (!isPrime(nextPrime));
		return nextPrime;
	}

	// long Version
	public static long nextPrime(long a) {
		long nextPrime = a;
		do {
			nextPrime++;
		} while(!isPrime(nextPrime));
		return nextPrime;
	}



	// return nth prime where n is the given number
	// int Version
	public static int nthPrime(int n) {
		int i=0;
		int prime=0;
		while (i!=n) {
			i++;
			prime = nextPrime(prime);
		}
		return prime;
	}

	// long Version
	public static long nthPrime(long n) {
		long i=0;
		long prime=0;
		while (i!=n) {
			i++;
			prime = nextPrime(prime);
		}
		return prime;
	}
	
	
	// sum the primes which are less than the given number
	// int Version
	public static long sumPrimesLessThan(int n) {
		int sum = 0;
		long curr_prime = 0;
		
		while (curr_prime<n) {
			sum +=curr_prime;
			curr_prime=nextPrime(curr_prime);
			
		}
		return sum;
	}
	
	// long Version
	public static long sumPrimesLessThan(long n) {
		long sum = 0;
		long curr_prime = 0;
		
		while (curr_prime<n) {
			sum +=curr_prime;
			curr_prime=nextPrime(curr_prime);
			
		}
		return sum;
	}
	
}
