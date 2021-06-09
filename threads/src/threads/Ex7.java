package threads;
//thread unsafe acting on the same object
public class Ex7 implements Runnable  {
   	//avaliable berths are 1
	int avaliable = 1;
	int wanted;
	
	//accepts wanted berths at the runtime
	Ex7(int i){
		wanted = i;
	}
	
	public void run() {
		//display available berths
		synchronized(this) {
			
		System.out.println(" Avaliable berths is " +avaliable);
		// if available berth are more than wanted berths
		
		if(avaliable >= wanted) {
			String name = Thread.currentThread().getName();   
			//allot the berth to him
			System.out.println(wanted+ "Berths reserved for" +name);
			 try {
				 Thread.sleep(2000);
				 avaliable = avaliable-wanted;
				 System.out.println("inside the try body"+avaliable);
			 }
			 catch(InterruptedException IE) {
				 IE.printStackTrace();
			 }
		}
		else {
			System.out.println("Sorry, No berths");
		}
		}                                                                      
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex6 e = new Ex6(1);
		
		Thread t1 = new Thread(e);
		Thread t2 = new Thread(e);
		
		t1.setName("sandeep");
		t2.setName("kishore");
		
		t1.start();
		t2.start();
	}
}