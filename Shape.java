abstract class Shape
{
	abstract void NumberofSides();
}

class Rectangle extends Shape
{
	void NumberofSides()
	{
		System.out.println("Number of Sides is 2");
	}	
}

class Triangle extends Shape
{
	void NumberofSides()
	{
		System.out.println("Number of sides is 3");
	}
}

class Hexagon extends Shape
{
	void NumberofSides()
	{
		System.out.println("Number of sides is 6");
	}
}

class Main
{
	Scanner inp = new Scanner(System.in);
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Hexagon h = new Hexagon();
		Shape shape;
		shape = r;
		shape.NumberofSides();
		shape = t;
		shape.NumberofSides();
		shape = h;
		shape.NumberofSides();
	}

}