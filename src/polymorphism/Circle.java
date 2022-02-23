package polymorphism;

public class Circle implements Shape{
	
	int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double area()
	{
		return pi*radius*radius;
	}
}
