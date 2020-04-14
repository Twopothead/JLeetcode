import java.util.Stack;

public class S496_next_greater_element_i {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    	Stack<Integer> stack;
    	int[] result = new int[nums1.length];
//		for (int i = 0; i < result.length; i++) {
////			result[i] = nums2.f
//		}
        return result;
    }
	public static void main(String[] args) {
		S496_next_greater_element_i s = new S496_next_greater_element_i();
		s.testcases();
	}
	private void test(int[] nums1, int[] nums2) {
		System.out.print("Input: nums1:");
		for (int n1 : nums1) {
			System.out.print(n1+" ");
		}
		System.out.print(",nums2: ");
		for (int n2 : nums2) {
			System.out.print(n2+" ");
		}
		System.out.print("\nOutput:");
		for (int r : nextGreaterElement(nums1, nums2)) {
			System.out.print(r + " ");
		}
	}
	private void testcases() {
//		You are given two arrays (without duplicates) nums1 and nums2 where nums1¡¯s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
//
//		The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number.
//
//		Example 1:
//
//		Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
//		Output: [-1,3,-1]
//		Explanation:
//		    For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
//		    For number 1 in the first array, the next greater number for it in the second array is 3.
//		    For number 2 in the first array, there is no next greater number for it in the second array, so output -1.
//		Example 2:
//
//		Input: nums1 = [2,4], nums2 = [1,2,3,4].
//		Output: [3,-1]
//		Explanation:
//		    For number 2 in the first array, the next greater number for it in the second array is 3.
//		    For number 4 in the first array, there is no next greater number for it in the second array, so output -1.		
		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		test(nums1, nums2);
	}
}
