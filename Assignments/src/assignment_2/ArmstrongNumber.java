package assignment_2;

import java.io.*;
// importing java.io package

public class ArmstrongNumber {

		public static void main(String[] args) throws IOException {
			
			BufferedReader teja = new BufferedReader(new InputStreamReader(System.in));
			System.out.print(": ");
			
			// taking input using buffer reader
			
			String number = teja.readLine();
			int x = Integer.parseInt(number);
			// wrapper class
			
			int c=0, a, temp;
			temp = x;
			while(x>0)  
			    {  
				// while loop entered
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