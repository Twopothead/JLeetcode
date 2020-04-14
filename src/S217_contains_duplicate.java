import java.util.Hashtable;

public class S217_contains_duplicate {
    public boolean containsDuplicate(int[] nums) {
    	Hashtable<Integer, Integer> numbers = new Hashtable<Integer,Integer>();
    	for (int i : nums) {
    		if(numbers.contains(i))
    			return true;
    		numbers.put(i, i);
		}
        return false;
    }
	public static void main(String[] args) {
		S217_contains_duplicate s = new S217_contains_duplicate();
		s.testcases();
	}
	private void testcases() {
//		217_contains-duplicate
//		Given an array of integers, find if the array contains any duplicates.
//
//		Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
//
//		Example 1:
//
//		Input: [1,2,3,1]
//		Output: true
//
//		Example 2:
//
//		Input: [1,2,3,4]
//		Output: false
//
//		Example 3:
//
//		Input: [1,1,1,3,3,4,3,2,4,2]
//		Output: true
		int[] nums1 = {1,2,3,1};
		int[] nums2 = {1,2,3,4};
		int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(nums1));
		System.out.println(containsDuplicate(nums2));
		System.out.println(containsDuplicate(nums3));
		// Time Limit Exceeded

	}
}
