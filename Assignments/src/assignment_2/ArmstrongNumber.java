package assignment_2;
import java.io.*;

public class ArmstrongNumber {
		public static void main(String[] args) throws IOException {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the number to check Armstrong number or Not: ");
			String number = in.readLine();
			int x = Integer.parseInt(number);
			int c=0, a, temp;
			temp = x;
			while(x>0)  
			    {
			    a=x%10;  
			    x=x/10;  
			    c=c+(a*a*a); 
			    }  
			    if(temp==c)  
			    System.out.println("armstrong number");   
			    else  
			        System.out.println("Not armstrong number");   
			   }  
}