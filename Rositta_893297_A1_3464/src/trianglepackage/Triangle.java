package trianglepackage;

public class Triangle {
	enum triangletype {
		isoceles, equilateral, unknown
	}

	triangletype type;

	public double getPerimeter(Point pointone, Point pointtwo) {

		return Math.sqrt(Math.pow(pointtwo.getX() - pointone.getX(), 2) + Math.pow(pointtwo.getY() - pointone.getY(), 2));
	}

	public void setType(double perimeter1, double perimeter2, double perimeter3) {

		 if(perimeter1==perimeter2 &&perimeter3==perimeter2  ) {
		  type=triangletype.equilateral; }

		 else if (perimeter2 == perimeter3 || perimeter1 == perimeter2 || perimeter1 == perimeter3) {
			type = triangletype.isoceles;
		}
		
		 
		else {
			type = triangletype.unknown;
		}

	}
	
	public double calculatePerimeter(double side1, double side2, double side3)
	{
		double perimeter=side1+side2+side3;
		return perimeter;
	}

	public void getType() {
		System.out.println(type);
	}

}
