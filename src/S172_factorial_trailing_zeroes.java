
public class S172_factorial_trailing_zeroes {
    public int trailingZeroes(int n) {
    	int has5_count = 0, has2_count = 0;
    	for (int i = 1; i <= n; i++) {
			has2_count += has(i, 2);
			has5_count += has(i, 5);
		}
        return (has2_count>has5_count)?has5_count:has2_count;
    }
    private int has(int n,int base){
    	int count  = 0;
    	while (n % base == 0) {
    		n /= base;
			count ++;
		}
    	return count;
    }
    private void test(int n) {
    	System.out.println("Input: " + n);
		System.out.println("Output: " + trailingZeroes(n));
	}
	public static void main(String[] args) {
		S172_factorial_trailing_zeroes s = new S172_factorial_trailing_zeroes();
		s.testcases();
	}
	private void testcases() {
		test(3);
		test(5);
		test(10);
		// 10*9*8*7*6*5*4*3*2*1=3628800
// 1808548329 	Time Limit Exceeded
// 500 / 502 test cases passed.
	}
}
