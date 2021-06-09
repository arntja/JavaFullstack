package testPackage;

public class Test1 {
	static int x =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,3,1,6,4,3,6,4};
		int b[][] = new int[a.length][2];
		a=sort(a);
		
		b[x][0]=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]==a[i-1]) {
				b[x][1]=b[x][1]+1;
			}
			else {
				x++;
				b[x][0]=a[i];
			}
		}
		}
	public static int[] sort(int a[]) {
		for (int i=0; i<a.length; i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					int t;
					t = a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}return a;
	}
}