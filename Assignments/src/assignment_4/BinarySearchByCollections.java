package assignment_4;
import java.util.*;

public class BinarySearchByCollections {

	public static void main(String[] args) {
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(10);
		arrlist.add(20);
		arrlist.add(21);
		arrlist.add(30);
		arrlist.add(100);
		arrlist.add(-20);
		arrlist.add(40);
		arrlist.add(70);
		
		System.out.println("Provided list are: " + arrlist);
		
		System.out.print("Enter the int to be searched: ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		int index = Collections.binarySearch(arrlist, key);
		System.out.printf("index of %d available at position: %d" , key, index);
		sc.close();
	}

}
