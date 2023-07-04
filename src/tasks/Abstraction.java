package tasks;

abstract class Animals{
	public abstract void animal();
	public void sleep()
	{
		System.out.println("animals is sleeping");
	}
}

 class Dog extends Animals{
	public void animal()
	{
		System.out.println("inside animal");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj=new Dog();
		obj.animal();
		obj.sleep();
	}

}
