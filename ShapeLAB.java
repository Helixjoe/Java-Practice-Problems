abstract class Shape
{
	abstract void numberOfSides();	
}

class Rectangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("Rectangle has 4 sides");
	}	
}
class Triangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("Triangle has 3 sides");
	}	
}
class Hexagon extends Shape
{
	void numberOfSides()
	{
		System.out.println("Hexagon has 6 sides");
	}	
}
class shapeDemo
{
	public static void main(String args[])
	{
		Rectangle robj=new Rectangle();
		Triangle tobj=new Triangle();
		Hexagon hobj=new Hexagon();
		Shape sobj;
		sobj=robj;	
		sobj.numberOfSides();
		sobj=tobj;
		sobj.numberOfSides();
		sobj=hobj;
		sobj.numberOfSides();
	}
}