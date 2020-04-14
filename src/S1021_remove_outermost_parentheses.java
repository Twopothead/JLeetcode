import java.util.Stack;

public class S1021_remove_outermost_parentheses {
    public String removeOuterParentheses(String S) {
    	Stack<Character> stack = new Stack<Character>();
    	int left_count = 0;
    	char c;
    	for (int i = 0; i < S.length(); i++) {
    		c = S.charAt(i);
    		if(c==')') {// )
    			if(stack.peek()=='(' && left_count >=3) {
    				stack.pop();
    			}else {
					stack.push(c);
				}
    			
    			
//    			if(stack.peek()=='(' && left_count>=2) {
//    					stack.pop();
//    			}else {
//					stack.push(c);
//				}
    		}else {// (
    			stack.push(c);
				left_count ++;
			}
		}
    	char[] cs = new char[stack.size()];
    	for (int i = stack.size()-1; i >= 0; i--) {
			cs[i] =  stack.pop();
		}
    	String result = new String(cs);
        return result;
    }
    private void test(String S) {		
		System.out.println("Input: " + S);
		System.out.println("Output: " + removeOuterParentheses(S));
	}
	public static void main(String[] args) {
// (()())
//()()()
		S1021_remove_outermost_parentheses  s = new S1021_remove_outermost_parentheses();
		s.testcases();
//		char[] C =  new char[5];
//		for (int i = 0; i < C.length; i++) {
//			C[i] ='H';
//		}
//		System.out.println(new String(C));
	}
	private void testcases() {
//		1021_remove-outermost-parentheses
//		A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation. For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
//
//		A valid parentheses string S is primitive if it is nonempty, and there does not exist a way to split it into S = A+B, with A and B nonempty valid parentheses strings.
//
//		Given a valid parentheses string S, consider its primitive decomposition: S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.
//
//		Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.
//
//		Example 1:
//
//		Input: "(()())(())"
//		Output: "()()()"
//		Explanation:
//		The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
//		After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
//
//		Example 2:
//
//		Input: "(()())(())(()(()))"
//		Output: "()()()()(())"
//		Explanation:
//		The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
//		After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
//
//		Example 3:
//
//		Input: "()()"
//		Output: ""
//		Explanation:
//		The input string is "()()", with primitive decomposition "()" + "()".
//		After removing outer parentheses of each part, this is "" + "" = "".
//
//		Note:
//
//		S.length <= 10000
//		S[i] is "(" or ")"
//		S is a valid parentheses string
		String S1 = new String("(()())(())");
		test(S1);
		
	}
}
