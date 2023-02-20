import java.util.Scanner;

abstract class Shape
{
	abstract void numberOfSides();
}                                

class Rectangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("4 Sides");
	}
}


class Triangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("3 Sides");		
	}	
}           

class Hexagon extends Shape
{

	void numberOfSides()
	{
		System.out.println("6 Sides");
	}
}

class MainShape 
{
	public static void main(String args[])
	{
		Rectangle robj = new Rectangle();
		robj.numberOfSides();
		Triangle tobj = new Triangle();
		tobj.numberOfSides();
	}
}