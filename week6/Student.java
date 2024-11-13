package CIE;
import java.util.Scanner;

public class Student {
		protected String usn = new String(); 
		protected String name = new String(); 
		protected int sem;
		
		public void inputStudentDetails(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the name of the student \n");
			this.name=sc.nextLine();
			System.out.println("Enter the USN of the student \n");
			this.usn=sc.nextLine();
			System.out.println("Enter the semester the student is studying in \n");
			this.sem=sc.nextInt();
		}
 
		public void displayStudentDetails(){
			System.out.println("Name: " + this.name);
			System.out.println("USN: " +this.usn);
			System.out.println("Semester: " +this.sem);
		}
}
