
public class S561_array_partition_i {
    public int arrayPairSum(int[] nums) {
        return 0;
    }
	public static void main(String[] args) {
		S561_array_partition_i s = new S561_array_partition_i();
		s.testcases();
	}
	private void test(int[] nums) {
		System.out.print("Input: ");
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println("\nOutput: " + arrayPairSum(nums));
	}
	private void testcases() {
//		Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
//
//		Example 1:
//
//		Input: [1,4,3,2]
//
//		Output: 4
//		Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
//
//		Note:
//
//		n is a positive integer, which is in the range of [1, 10000].
//		All the integers in the array will be in the range of [-10000, 10000].
		int[] nums = {1,4,3,2};
		test(nums);
	}
}
