package threads;

public class Thread2 extends Thread{
	public void run()
	{

		for(int i =0;i<10;i++)
		{
			System.out.println("Thread of second case "+i);
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println("Got an exception !");
			}
		}
	}
}
