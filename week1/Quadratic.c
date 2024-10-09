import java.util.Scanner;
import java.lang.Math;
class Quadratic{

 public static void main(String args[]){

     int a,b,c;
     double d,r1,r2;
     Scanner s= new Scanner(System.in);

     System.out.println("Enter the coefficient a");
     a=s.nextInt();
	
     System.out.println("Enter the coefficient b");
     b=s.nextInt();

     System.out.println("Enter the coefficient c");
     c=s.nextInt();

     while(a==0){

      System.out.println("Not a quadratic , enter non-zero value of a");
      a=s.nextInt();

}
      d=b*b-4*a*c;
      if(d>0){

       System.out.println("The equation has real and distinct roots");
       r1=((-b)/(2*a)+(Math.sqrt(d))/(2*a));
       r2=((-b)/(2*a)-(Math.sqrt(d))/(2*a));
       System.out.println("The roots are");
       System.out.println("r1="+r1);
       System.out.println("r2="+r2);
     }
 
      else if(d==0){

	System.out.println("The equation has real and equal roots");
 	r1=((-b)/(2*a));
	System.out.println("The root is "+r1);


}
else{
      System.out.println("The equation doesn't have real roots");


}

System.out.println("Name:Anirudh");
System.out.println("USN:1BM23CS036");
}

}
