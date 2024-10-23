import java.util.Scanner;
import java.lang.Math;
abstract class Shape  {
	double a;
	double b;
	abstract void printArea();
}
class Rectangle extends Shape{
	double l; 
	double br;
  Rectangle(double a, double b){
	l=a;
	br=b;
}

	void printArea(){
		System.out.println("The Area of the rectangle is: "+l*br);
}
}
class Triangle extends Shape{
	double h; 
	double b;
	Triangle(double a, double b){
		h=a;
		this.b=b;
	}
	void printArea(){
		System.out.println("The Area of the Rectangle is: "+(h*b)/2.0);
	}
}
class Circle extends Shape{
	double r;
	Circle(double r){
		this.r=r;
	}
	void printArea(){
		System.out.println("The area of the Circle is: "+ Math.PI*r*r);	
	
	}
}
class ShapeDemo{
	public static void main(String args[]){
		Rectangle r = new Rectangle(2,5);
		Triangle t = new Triangle(2,5);
		Circle c = new Circle(5);

		r.printArea();
		t.printArea();
		c.printArea();
		System.out.println("Name:Anirudh R");
		System.out.println("USN:1BM23CS036");
	}
}
