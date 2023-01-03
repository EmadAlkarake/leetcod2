package leetCode;

public class TestThread implements Runnable{

	public  void doSomething() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("doSomething");
            Thread.sleep(1000);
        }
    }

	@Override
	public void run() {
		try {
			doSomething();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
