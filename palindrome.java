import java.util.Scanner;

public class palindrome
{
	public static void main(String arg[])
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter string");
		String s = inp.nextLine();
		String p ="";
		for(int i = s.length(); i>0;i--)
		{
			p = p + s.charAt(i-1);
		}
		if(s.equalsIgnoreCase(p))
		{
			System.out.print(s+" is a Palindrome");
		}
		else
		{
			System.out.print(s+" is not a Palindrome");
		}
	}
}