import java.util.Scanner;

class occurenceofaword
{
	public static void main (String[] args)
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter String");
		String s = inp.nextLine();
		System.out.println(s);
		String words[] = s.split(" ");
		int count = 0;
		System.out.println("Enter word to find occurence");
		String c = inp.nextLine();
		for(int i=0;i<words.length;i++)
		{
			if(c.equals(words[i]))
				count++;
		}
		System.out.print("The count of " + c + " is " + count);
	}
}