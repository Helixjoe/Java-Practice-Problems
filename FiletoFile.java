import java.io.*;

class Filecopy
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream f1 = null;
		FileOutputStream f2 = null;
		try
		{
			f1 = new FileInputStream("file4.txt");
			f2 = new FileOutputStream("file3.txt");
			int c;	
			do
			{
				c = f1.read();
				if(c!=-1)
				{
					f2.write(c);
					System.out.print((char)c);
				}
			}while(c!=-1);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		finally
		{
			f1.close();
		}
	}


}