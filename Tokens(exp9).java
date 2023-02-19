import java.util.*;

class Tokens
{
	public static void main(String args[])
	{
			int sum=0;
			Scanner inp = new Scanner(System.in);
			String str = inp.nextLine();		
			StringTokenizer st = new StringTokenizer(str," ");
			int n=0;
			while(st.hasMoreTokens())
		
				String key = st.nextToken();
				System.out.println(key);
				try
				{
				n = Integer.parseInt(key);
				sum = sum + n;
				}
				catch(NumberFormatException e)
				{
					System.out.println("Caught an Exception");
					System.out.println("Exception occured:"+e);
					
				}	
			}  
			System.out.println("Sum is " +sum);
		
		
	}

}