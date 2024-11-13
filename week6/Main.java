import SEE.Externals;
import java.util.Scanner;

class Main{
		public static void main(String args[]){
			int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("Name: Anirudh R");
			System.out.println("USN: 1BM23CS036");
			System.out.println("Enter the number of students \t");
			n= sc.nextInt();
			Externals e[] = new Externals[n];
			for(int i=0; i<n; i++){
				e[i] = new Externals();
				System.out.println("Enter the" +(i+1)+"th student details \n");
				e[i].inputStudentDetails();
				System.out.println("Enter the" +(i+1)+"th student's CIE marks\n");
				e[i].inputCIEmarks();
				System.out.println("Enter the" +(i+1)+"th student's SEE marks\n");
				e[i].inputSEEmarks();
				System.out.println("The details of the" +(i+1)+"th student is");
				e[i].displayStudentDetails();
				e[i].definefinalmarks();
				System.out.println("The final marks of the" +(i+1)+"th student is");
				e[i].displayfinalmarks();
			}
			
		}
}
