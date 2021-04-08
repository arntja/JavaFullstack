package exceptionHandling;
public class Exception {
	public static void main(String[] args) {
		//open the files
		try {
				System.out.println(" files opened");			
				int n = args.length;
				System.out.println("No of arguments: "+n);
				int a = 45/n;
				System.out.println("value of a: " +a);
				int p[] = {10,20,30};
				System.out.println(p[15]);	
			}
		catch(ArrayIndexOutOfBoundsException ab) {
			System.out.println(ab);	
			}	
		catch(ArithmeticException obj) {			
			System.out.println("exp:: " +obj);
		}
		finally
		{
				//close the files
				System.out.println("CLOSE");
		}		
	}
}