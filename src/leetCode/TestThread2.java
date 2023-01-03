package leetCode;

public class TestThread2 extends Thread {

	public  void doSomethingTwo() throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            System.out.println("doSomethingTwo");
            Thread.sleep(1);
        }
    }
	
	@Override
	public void run() {
		try {
			doSomethingTwo();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
