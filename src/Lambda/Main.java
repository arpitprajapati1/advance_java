package Lambda;

@FunctionalInterface
interface Dog{
	void bark();
}


interface Tree{
	void TreeType();
	void Treecolor();
}


class Mango implements Tree{

	@Override
	public void TreeType() {
		// TODO Auto-generated method stub
		System.out.println("It is a fruit tree !");
	}

	@Override
	public void Treecolor() {
		// TODO Auto-generated method stub
		System.out.println("It is green in color !");
	}
	
}


abstract class Car{
	abstract void carType();
}
//
//class Sedan extends Car{
//	@Override
//	public void carType()
//	{
//		System.out.println("This is not sedan !");
//	}
//}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car() {

			@Override
			void carType() {
				// TODO Auto-generated method stub
				System.out.println("Car Is of Sedan Type !");
			}
			
		};
		c.carType();
		
		
		// type 1  -- Most Easy
		
		Annnoy a = ()->{
			System.out.println("Hello Lambda");
		};
		
		a.work();
		
		// type 2  -- Some what Typical
		
		Dog tommy = new Dog() {
			@Override
			public void bark()
			{
				System.out.println("Hello this is Tommy!");
			}
		};
		
		tommy.bark();
		
		//type 3  -- most complex and not a Lambda expression example 
		Tree t = new Mango();
		t.TreeType();
		t.Treecolor();	
	}
}
