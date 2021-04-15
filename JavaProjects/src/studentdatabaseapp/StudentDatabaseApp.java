package studentdatabaseapp;
import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {		
		//Ask how many new users we want to add
		System.out.print("Enter number of new students to enroll: ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		//Creat n number of new users
		for (int n=0; n<numOfStudents; n++) {
			students[n] = new Student(); //To create an array of objects
			students[n].enroll();
			students[n].payTuition();
		}
		for (int n=0; n<numOfStudents; n++) {
			System.out.println(students[n].toString());
		}
	}
}