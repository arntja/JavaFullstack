package testPackage;
public class Test5 {
	public static void main(String[] args) {
		Abcd obj = new Abcd();
		if(obj instanceof Ii)
			obj.show();
		else
			System.out.println("No permission");
	}
}

class Abcd implements Ii{
	public void show() {
		System.out.println("in show Abcd");
	}
}
interface Ii{
	
}