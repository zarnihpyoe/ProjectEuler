import java.util.LinkedList;

public class EvenFibonacciNumbers extends myHelpers {
	public static void main (String [] args) {
		// list the Fibonacci numbers starting from 1 and 2 below 4 million
		System.out.println(sumEvenFibos(4000000));				// 4613732
	}


	// return the sum of the even Fibonacci numbers till the given maximum number 
	public static int sumEvenFibos(int maxNum) {
		LinkedList<Integer> fibonacciList = getFibonacciList(maxNum);		// getting a list of fibo
		LinkedList<Integer> evenFiboList = onlyEven(fibonacciList);			// filtering even only
		return sum(evenFiboList);											// summation of all even fibo numbers
	}
}
