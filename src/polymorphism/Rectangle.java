package polymorphism;

public class Rectangle implements Shape{
	int lenght;
	int breadth;
	
	public int getLenght() {
		return lenght;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setdimension(int lenght,int breadth) {
		this.lenght = lenght;
		this.breadth = breadth;
	}
	
	public int calArea()
	{
		return lenght*breadth;
	}
}
