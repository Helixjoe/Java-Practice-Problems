import java.util.Scanner;

class parent
{
	
	int a=3;
	int b=0;
	
}
class child extends parent
{
		int x = 1 ;
		int y = b;	
		
		
}			

class inheritance
{
	public static void main(String[] args)
	{
		parent superob = new parent();
		System.out.println(superob.a);
		child subob1 = new child();
		System.out.println(subob1.x);
		
		
	}
}	