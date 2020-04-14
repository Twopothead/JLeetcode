
public class S136_single_number {
    public int singleNumber(int[] nums) {
        return 0;
    }
	public static void main(String[] args) {
		S136_single_number s =  new S136_single_number();
		s.testcases();
	}
	private void test(int[] nums) {

	}
	private void testcases() {
//		Given a non-empty array of integers, every element appears twice except for one. Find that single one.
//
//		Note:
//
//		Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//
//		Example 1:
//
//		Input: [2,2,1]
//		Output: 1
//		Example 2:
//
//		Input: [4,1,2,1,2]
//		Output: 4
		int[] nums1 = {2,2,1};
		int[] nums2 = {4,1,2,1,2};
		test(nums1);
	}
}
