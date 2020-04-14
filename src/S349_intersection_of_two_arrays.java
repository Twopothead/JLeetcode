import java.util.Hashtable;

public class S349_intersection_of_two_arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
    	Hashtable<Integer, Integer> numbers = new Hashtable<Integer,Integer>();
        int[] l1 = (nums1.length - nums2.length > 0)?nums1:nums2;
        int[] l2 = (nums1.length - nums2.length > 0)?nums2:nums1;
        for (int i : nums2) {
        	if(!numbers.containsKey(i)) {
        		
        		numbers.put(i, i);
        	}else {
        		System.out.print(i+" ");
			}
//        	System.out.print(i+" ");
		}
//        for (int i = 0; i < nums2.length; i++) {
//			System.out.print(nums2[i]+" ");
//		}
    	return nums1;
    }
	public static void main(String[] args) {
		S349_intersection_of_two_arrays s = new S349_intersection_of_two_arrays();
		s.testcases();
	}
	private void test(int[] nums1, int[] nums2) {
		System.out.print("Input: nums1: ");
		for (int n1 : nums1) {
			System.out.print(n1 + " ");
		}
		System.out.print(" ,nums2: ");
		for (int n2 : nums2) {
			System.out.print(n2 + " ");
		}
		System.out.print("\nOutput: ");
//		for (int r : intersection(nums1,nums2)) {
//			System.out.print(r + " ");
//		}
		intersection(nums1, nums2);
		System.out.println("");
		
	}
	private void testcases() {
//		349_intersection-of-two-arrays
//		Given two arrays, write a function to compute their intersection.
//
//		Example 1:
//
//		Input: nums1 = [1,2,2,1], nums2 = [2,2]
//		Output: [2]
//
//		Example 2:
//
//		Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//		Output: [9,4]
//
//		Note:
//
//		Each element in the result must be unique.
//		The result can be in any order.
		int[] nums1 = {1,2,2,1}; 
		int[] nums2 = {2,2};
		int[] nums3 = {4,9,5};
		int[] nums4 = {9,4,9,8,4};
		test(nums1, nums2);
		test(nums3, nums4);
	}
}
