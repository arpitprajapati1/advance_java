package enumeration;

public enum Fruits {
	APPLE(120,"SWEET"),
	MANGO(100,"TANGEEE"),
	BANANA(200,"CURD");
	
	final int sugarlevel;
	final String taste;
	
	Fruits(int sugarlevel,String taste)
	{
		this.sugarlevel = sugarlevel;
		this.taste = taste;
	}
}
