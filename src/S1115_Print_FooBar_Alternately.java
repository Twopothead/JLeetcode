
public class S1115_Print_FooBar_Alternately {
    private int n;

    public S1115_Print_FooBar_Alternately(int n) {
        this.n = n;
    }
    public static void main(String[] args) {
    	int n1 = 1,n2 = 2;
    	S1115_Print_FooBar_Alternately s1 = new S1115_Print_FooBar_Alternately(n1);
    	S1115_Print_FooBar_Alternately s2 = new S1115_Print_FooBar_Alternately(n2);
    	s1.test();
    	s2.test();
	}
    private void test() {
    	System.out.print("Input: " + n + " Output: ");
    	PrintFoo printFoo = new PrintFoo();
    	PrintBar printBar = new PrintBar();
    	try {
			foo(printFoo);
			bar(printBar);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("");
    }
    private void testcases() {
//    	1115_Print FooBar Alternately
//    	Suppose you are given the following code:
//
//    	class FooBar {
//    	  public void foo() {
//    	    for (int i = 0; i < n; i++) {
//    	      print("foo");
//    	    }
//    	  }
//
//    	  public void bar() {
//    	    for (int i = 0; i < n; i++) {
//    	      print("bar");
//    	    }
//    	  }
//    	}
//    	The same instance of FooBar will be passed to two different threads. Thread A will call foo() while thread B will call bar(). Modify the given program to output "foobar" n times.
//
//    	Example 1:
//
//    	**Input:** n = 1
//    	**Output:** "foobar"
//    	**Explanation:** There are two threads being fired asynchronously. One of them calls foo(), while the other calls bar(). "foobar" is being output 1 time.
//    	Example 2:
//
//    	**Input:** n = 2
//    	**Output:** "foobarfoobar"
//    	**Explanation:** "foobar" is being output 2 times.
    
    	
    	
	}

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
        }
    }
}
class PrintFoo implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("foo");
	}
}
class PrintBar implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("bar");
	}
}