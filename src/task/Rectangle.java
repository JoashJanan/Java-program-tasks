package task;

public class Rectangle {
	
	int length;
	int breadth;
	
	public Rectangle()
	{
		length=0;
		breadth=0;
	}
	
	public Rectangle(int l,int b)
	{
	length=l;
	breadth=b;
	}
	public Rectangle(int n)
	{
		length=n;
		breadth=n;
	}
	public void calculate()
	{
		System.out.println("Area ="+(length*breadth));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Rectangle obj1=new Rectangle();
       Rectangle obj2=new Rectangle(5,5);
       Rectangle obj3=new Rectangle(5);
       
       obj1.calculate();
       obj2.calculate();
       obj3.calculate();
	}

}
