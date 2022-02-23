package polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello to area program !");
		Rectangle rect = new Rectangle();
		Circle cir = new Circle();
		
		rect.setdimension(10,20);
		System.out.println(rect.calArea());
		
		cir.setRadius(7);
		System.out.println(cir.area());
	}

}
