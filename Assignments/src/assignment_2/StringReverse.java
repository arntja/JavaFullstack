package assignment_2;
import java.io.*;

public class StringReverse {

	public static void main(String[] args) throws Exception{
		InputStreamReader in = new InputStreamReader(System.in);
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the String you want reverse: ");
		String str = in.readLine();
		System.out.println("Reversed string is: ");
		for(int i = (str.length()-1); i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}