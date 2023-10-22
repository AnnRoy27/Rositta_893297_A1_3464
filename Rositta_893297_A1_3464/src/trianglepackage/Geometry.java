package trianglepackage;

import java.util.Scanner;



public class Geometry {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 for(int j=0;j<3;j++) {
		System.out.println("Enter the data for triangle "); 
		 double x[]=new double[3];
		 double y[]=new double[3];
		 for(int i=0;i<3;i++) {
			 System.out.println("enter value for x coordinate"); 
		  x[i]=scanner.nextDouble();
		  System.out.println("enter value for y coordinate "); 
		  y[i]=scanner.nextDouble();
		 }
		 Point point[]=new Point[3];
		 point[0]=new Point(x[0],y[0]);
		 point[1]=new Point(x[1],y[1]);
		 point[2]=new Point(x[2],y[2]);
		 
		 Triangle triangle =new Triangle();
		double side1= triangle.getPerimeter( point[0], point[1]);
		double side2= triangle.getPerimeter( point[1], point[2]);
		double side3= triangle.getPerimeter( point[2], point[1]);
		triangle.setType(side1, side2, side3);
		 triangle.getType();
		 double perimeter=triangle.calculatePerimeter(side1, side2, side3);
		 System.out.println(perimeter);
		 }
		 
	}

	

}
