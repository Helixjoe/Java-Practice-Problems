import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		String s;	
		System.out.println("Enter the string");
		s = obj.nextLine();
		System.out.println("Enter the character to find occurrence for");
		char c = obj.nextLine().charAt(0);
		int count = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == c)
			{
				count++;
			}
		}
		System.out.println("The number of occurence of "+c+ " are :" + count);
	}
}