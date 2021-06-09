package threads;
import java.util.*; 

//public class Arrayli {
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<String> alist=new ArrayList<String>();  
	      alist.add("Steve");
	      alist.add("Tim");
	      alist.add("Lucy");
	      alist.add("Pat");
	      alist.add("Angela");
	      alist.add("Tom");
	  
	      System.out.println(alist);
	 
	      alist.add(3, "Steve");
	      System.out.println(alist);
	      
	      alist.remove("Steve");
	      System.out.println(alist);
	      System.out.println("Number of elements in ArrayList: "+ alist.size());
	   }  
	}