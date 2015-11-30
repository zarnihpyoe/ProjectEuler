
public class SumSquareDifference extends myHelpers {
	public static void main (String []args) {
		System.out.println(sumSquare(100));
		System.out.println(squareSum(100));
		System.out.println(result(100));
	}
	
	// sum the numbers and square the result
	public static int sumSquare (int max) {
		int sum = 0;			// summation so far
		for (int counter = 1; counter<=max; counter++) {
			sum +=counter;
		}
		return (int)Math.pow(sum, 2);
	}
	
	// square each numbers and sum those
	public static int squareSum (int max) {
		int sum = 0;			// summation so far
		for (int counter=1; counter<=max; counter++) {
			sum+=(Math.pow(counter, 2));
		}
		return sum;
	}
	
	// the difference between sumSquare and squareSum
	public static int result (int max) {
		return Math.abs(sumSquare(max)-squareSum(max));
	}

}
