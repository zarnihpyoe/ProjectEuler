
public class N14LongestCollatzSequence {
	public static void main(String []args) {
		System.out.println(longestStreak(1000000));
	}

	public static long longestStreak(long n) {
		long current_max_start = 0;			// starting number that caused the longest streak so far
		long current_max_counter = 0;		// the longest streak so far

		// setting the start values from 1 to n
		for(int i=1; i<=n; i++) {
			long j=i;
			long counter=1;

			// running till the number hits 1
			while(j!=1) {
				counter++;
				if (j%2==0) {
					j=j/2;
				} else {
					j=(3*j)+1;
				}
			}
			// checking whether the streak is longer than previously longest
			// if so update to the current values
			if (counter>=current_max_counter) {
				current_max_counter = counter;
				current_max_start = i;
			}
		}
		return current_max_start;
	}

}
