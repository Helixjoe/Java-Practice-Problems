import java.util.Scanner;

public class calculator
{
	public static void main (String args[])
	{
		int a,b;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter first operand");
		a = inp.nextInt();
		System.out.println("Enter second operand");
		b = inp.nextInt(); 
		System.out.println("Enter choice of operator");
		char c = inp.next().charAt(0);
		switch(c)
		{
			case '+':
			System.out.println(a + " + " + b + " = " + (a+b) );
			break;
			
			case '-':
			System.out.println(a + " - " + b + " = " + (a-b) );
			break;

			case '*':
			System.out.println(a + " * " + b + " = " + (a*b) );
			break;

			case '/':			
			if(b==0)
				System.out.println("Invalid");	
			else
				System.out.println(a + " / " + b + " = " + (a/b) );
			break;	
			
			default:
			System.out.println("Wrong operator");

		}
	}
}
		