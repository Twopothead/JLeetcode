
public class S205_isomorphic_strings {
    public boolean isIsomorphic(String s, String t) {
    	
        return false;
    }
    public static void main(String[] args) {
    	S205_isomorphic_strings s = new S205_isomorphic_strings();
    	s.testcases();
	}
    private void test(String s, String t) {
    	System.out.println("Input: " + s +", " + t);
    	System.out.println("Output: " + isIsomorphic(s, t));
	}
    private void testcases() {
//    	205_isomorphic-strings
//    	Given two strings s and t, determine if they are isomorphic.
//
//    	Two strings are isomorphic if the characters in s can be replaced to get t.
//
//    	All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
//
//    	Example 1:
//
//    	Input: s = "egg", t = "add"
//    	Output: true
//
//    	Example 2:
//
//    	Input: s = "foo", t = "bar"
//    	Output: false
//
//    	Example 3:
//
//    	Input: s = "paper", t = "title"
//    	Output: true
//
//    	Note:
//    	You may assume both ***s ***and ***t ***have the same length.
    	String s1 = "egg";
    	String t1 = "add";
    	String s2 = "foo";
    	String t2 = "bar";
    	String s3 = "paper";
    	String t3 = "title";
    	test(s1, t1);
    	test(s2, t2);
    	test(s3, t3);
    	
    	
    }
}
