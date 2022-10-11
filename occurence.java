import java.util.Scanner;

public class occurence
{
	public static void main(String arg[])
	{
		Scanner inp = new Scanner(System.in);
	
		System.out.println("Enter String");
		String s; 
		s = inp.nextLine();
		int count = 0;
		System.out.println("Enter character to find occurence");
		char ch = inp.nextLine().charAt(0);
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i) == ch)
			{
				count++;
			}
		}
		System.out.println("Number of occurences is "+count);
	}
}