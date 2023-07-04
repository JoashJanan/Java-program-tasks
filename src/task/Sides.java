package task;
abstract class shape{
	abstract void numberOfSides();
}

class Trapezoid extends shape
{
	public void numberOfSides()
	{
		System.out.println("Number of sides of Trapezoid is: 4");
	}
}
class Triangle extends shape
{
 public void numberOfSides()
 {
	 System.out.println("Number of sides of Triangle is: 3 ");
 }
}
class Hexagon extends shape{
	public void numberOfSides()
	{
		System.out.println("Number of sides of Hexagon is: 6");
	}
}
public class Sides {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
shape obj= new Trapezoid();
obj.numberOfSides();
obj= new Triangle();
obj.numberOfSides();
obj= new Hexagon();
obj.numberOfSides();
	}

}
