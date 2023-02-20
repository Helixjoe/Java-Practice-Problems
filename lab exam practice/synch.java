class Example
{
	
	void display()
	{	
		Thread g = Thread.currentThread();
		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{
				try
				{
					Thread.sleep(1000);
					System.out.println(g.getName()+" "+i+"Priority:"+g.getPriority());
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}
			}
		}
	}

}

class T extends Thread
{
	Example e;
	T(Example ex)
	{
		this.e = ex;
	}
	public void run()
	{
		e.display();
	}

}



class TSynch 
{
	public static void main(String args[])
	{
		Example ex = new Example();
		T t1 = new T(ex);	
		T t2 = new T(ex);	
		t1.start();
		t2.start();
	}
}