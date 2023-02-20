class NewThread implements Runnable
{
	String name;
	Thread t;
	NewThread(String threadname)
	{
		name = threadname;
		t = new Thread(this,name);
		System.out.println("New Thread:"+i);
		t.start();
	}
		public void run()
		{
			try
			{
			for(int i =0;i<5;i++)
			{
				System.out.println(name + " " + i);
				Thread.sleep(1000);
			}
			}
			catch(InterruptedException e)
			{
				System.out.println("Main thread interrupted");
			}
				System.out.println(name+"exiting");
		}
	}	
}

class Thread 
{
	public static void main(String args[])
	{
		new NewThread("one");
		new NewThread("two");
		new NewThread("three");
		try
		{
			Thread.sleep(1000);			
		}
		catch(InterruptedException e)
		{	
			System.out.println(e);
		}
	}
}