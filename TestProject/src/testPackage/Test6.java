package testPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test6 {
	
	public static void main (String[]args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 4;
		int j = Integer.parseInt(br.readLine());
		
		int k = i/j;
		System.out.println(k);
		
	}

}
