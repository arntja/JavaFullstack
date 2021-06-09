package testPackage; // JAVA 8 concepts

public class Test4 {

	public static void main(String[] args) {
//		Ab obj = new Ab();
//		obj.show();
		
		Abc.show();
		
	}
}

interface Abc{
	
	static void show() {
		System.out.println("hello");
	}
	
//	default void show() {
//		System.out.println("hello");
//	}
}

//class Ab implements Abc{
//	
//}