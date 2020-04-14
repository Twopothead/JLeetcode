import java.util.concurrent.Callable;

class MyThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		System.out.println("hello, mythread " + Thread.currentThread().getName());
	}
}
class MyRunnable implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hello, myRunnable " + Thread.currentThread().getName());
		
	}
}
class MyCallable implements Callable<String>{
	private String name;
	public MyCallable(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "call :" + name;
	}
}
public class S1114_print_in_order {
	public void S1114_print_in_order() {
		
	}
	private void testCallable() {
		MyCallable myCallable = new MyCallable("»’∏Á");
		String call = null;
		try {
			call = myCallable.call();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(call);
	}
	private void testThread() {
		Thread myThread = new MyThread();
		myThread.start();
		Runnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.start();
	}
	public static void main(String[] args) {
		S1114_print_in_order s = new S1114_print_in_order();
		s.testcases();

	}
	private void testcases() {
//		Input: [1,2,3]
//		Output: "firstsecondthird"
//		Input: [1,3,2]
//		Output: "firstsecondthird"
		
//		testThread();
//		testCallable();
		PrintFirst printFirst = new PrintFirst();
		PrintSecond printSecond = new PrintSecond();
		PrintThird printThird = new PrintThird();
//		try {
//			first(printFirst);
//			third(printThird);
//			second(printSecond);
//			
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Thread threada = new Thread(printFirst);
		Thread threadb = new Thread(printSecond);
		Thread threadc = new Thread(printThird);
		threada.start();
		threadb.start();
		threadc.start();
		

		
	}
    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
class PrintFirst implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("first");
	}
}
class PrintSecond implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("second");
	}
}
class PrintThird implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("third");
	}
}
