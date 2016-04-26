package j31;

public class j31 extends Thread {

	public void run(){
		
		System.out.println("Thread is running"+Thread.currentThread().getName());
		System.out.println("Thread Priority"+Thread.currentThread().getPriority());
	}
	
	public static void main(String args[]) {

		j31 j31 = new j31();
		j31.setPriority(MAX_PRIORITY);
		
		j31 j32 = new j31();
		j32.setPriority(NORM_PRIORITY);
		
		j31 j33 = new j31();
		j33.setPriority(MIN_PRIORITY);
		
		j31.start();
		try {
			j31.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		j32.start();
		try {
			j32.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		j33.start();
		
	}

}
