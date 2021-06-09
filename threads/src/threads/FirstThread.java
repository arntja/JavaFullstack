package threads;

public class FirstThread extends Thread {
	int array[]= {1,2,3,4,5};
	public void run() {
		for (int i=0; i<array.length; i++) {
			array[i]= array[i]*2;
			System.out.print(array[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		//FirstThread e = new FirstThread();
		//Thread t1 = new Thread(e);
		Thread t1 = new FirstThread();
		t1.start();
	}
}