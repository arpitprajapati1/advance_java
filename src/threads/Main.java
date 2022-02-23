package threads;

public class Main {
		
	public static void main(String[] args)
	{
		System.out.println("MAin Class");
		Thread1 r = new Thread1();
		Thread t1 = new Thread(r);
		Thread2 s = new Thread2();
		Thread t2 = new Thread(s);
		t1.start();
		s.start();
	}
	
}
