package threads;
//thread unsafe acting on the same object
public class Ex6 implements Runnable  {
 
	
	//avaliable berths are 1
	
	int avaliable = 1;
	int wanted;
	
	//accepts wanted berths at the runtime
	
	Ex6(int i){
		wanted = i;
	}
	
	public void run() {
		//display available berths
		System.out.println(" Avaliable berths is " +avaliable);
		// if available berth are more than wanted berths
		
		if(avaliable >= wanted) {
			String name = Thread.currentThread().getName();   
			//allot the berth to him
			System.out.println(wanted+ "Berths reserved for" +name);
			 try {
				 Thread.sleep(1000);
				 avaliable = avaliable-wanted;
			 }
			 catch(InterruptedException IE) {
				 IE.printStackTrace();
			 }
		          
		}
		
		else {
			System.out.println("Sorry, No berths");
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
