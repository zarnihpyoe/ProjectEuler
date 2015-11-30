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
	public static LinkedList<Integer> getFibonacciList(int maxLimit) {
		int fibo1 = 1, fibo2 = 2, fibonacci = 0;
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
}
