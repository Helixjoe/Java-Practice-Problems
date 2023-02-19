import java.util.Scanner;

class Methods
{
	void numberformat(String k) throws NumberFormatException
	{
		
		int i = Integer.parseInt(k);
		
	}
	void checkAge(int a)
	{
		try
		{
			if(a<18)
				throw new ArithmeticException("Not Elligible. Age is below 18");	
		}	
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
				
	}
	void ArrayOutofBounds()
	{
		try
		{
			Scanner n = new Scanner(System.in);
			System.out.println("Enter size of array");
			int l = n.nextInt();
			int a[] = new int[l]; 
			int el;
			System.out.println("Enter the elements");
			int i,c;
			for(i = 0;i<=l;i++)
			{
				el = n.nextInt();
				a[i] = el;
				System.out.println("Keep Entering?(1/0)");
				c = n.nextInt();
				if(c== 0)
					break;
			}
			if(i>l)
				throw new ArrayIndexOutOfBoundsException("Array is out of bounds");
		}	
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Exception Handeld");
		}
	}
}

class ExceptionHandling
{
	public static void main(String args[])
	{	
		Scanner n = new Scanner(System.in);
		Methods m = new Methods();
		System.out.println("Enter Number");
		String snum = n.nextLine();
		try
		{
			m.numberformat(snum);
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Caught the exception");
			System.out.println("Exception Occured:" + ex);	
		}
		System.out.println("Enter age");
		int age = n.nextInt();
		m.checkAge(age);
		
		m.ArrayOutofBounds();
		
	}

		
}