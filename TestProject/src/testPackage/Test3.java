package testPackage;

public class Test3 {
	public static void main(String[]args) {
		Z obj = new Z(6);
		obj.show();
	}
}

class Z{
	private int x;
	public Z(int x) {
		this.x=x; // current instance (this keyword)
	}
	public void show() {
		System.out.println(x);
	}
}