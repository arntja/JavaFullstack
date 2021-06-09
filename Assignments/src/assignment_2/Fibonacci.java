package assignment_2;

import java.io.*;

public class Fibonacci {

	public static void main(String[] args) throws IOException {
		BufferedReader teja = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Print the first 'n' Fibonacci number: ");
		
		int x = teja.read(); //DOUBT
		System.out.println(x);
		//int x = Integer.parseInt(number);
		int j=-1;
		int k=1;
		for (int i=0; i<x; ++i) {
			int sum = j+k;
			j = k;
			k= sum;
			System.out.print(sum + " ");
			
		}
		if (x<=0) System.out.println("Please enter the positive integer");
	}

}