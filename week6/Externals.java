package SEE;
import CIE.*;
import java.util.Scanner;

public class Externals extends Internals{
				protected double seemarks[] = new double[5];
				protected double finalMarks[] = new double[5] ;
				
				public void inputSEEmarks() {
					Scanner sc = new Scanner(System.in);
					for(int i=0; i<5; i++){
						System.out.println("Enter the SEE marks of"+ (i+1)+"th subject");
						this.seemarks[i]= sc.nextDouble();
					}
				}
				
				public void definefinalmarks(){
					for(int i=0; i<5; i++){
						this.finalMarks[i] = ciemarks[i] + (seemarks[i]/2.0);
					}
		
				}
			
				public void displayfinalmarks(){
					System.out.println("The final marks of the student is \n");
					for(int i=0; i<5; i++){
						System.out.println("The marks of the" + (i+1)+"th subject is \t");
						System.out.println(this.finalMarks[i]);
					}

				}
}

