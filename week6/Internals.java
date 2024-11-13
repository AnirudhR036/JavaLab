package CIE;
import java.util.Scanner;

public class Internals extends Student {
		protected double ciemarks[] = new double[5];
		Scanner sc= new Scanner(System.in);
		public void inputCIEmarks(){
			for(int i=0; i<5; i++){
				System.out.println("Enter the CIE marks of"+ (i+1)+"th subject");
				this.ciemarks[i]= sc.nextDouble();
			}
		}
}
