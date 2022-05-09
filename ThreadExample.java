package simplej;

public class ThreadExample {
	private static Object LOCK = new Object();
		public static void main(String[] args) throws InterruptedException {
			Thread.sleep(5000);
			System.out.println("Thread '"+Thread.currentThread().getName()+"' is woken after sleeping for 5 seconds");
			synchronized(LOCK) {
				LOCK.wait(5000);
				System.out.println("Object '"+LOCK+"' is woken after"+ " waiting for 5 seconds");
			}
		}
}
