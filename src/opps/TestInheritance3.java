package opps;
class Animal3{  
void eat(){System.out.println("eating...");}  

}  
class Dog2 extends Animal3{  
//void bark(){System.out.println("barking...");}  
void eat(){System.out.println("eating...");}
}  
class Cat extends Animal{  
void meow(){System.out.println("meowing...");}  
} 
public class TestInheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();  
		c.meow();  
		c.eat();  
		//c.bark();//C.T.Error  
	}

}
