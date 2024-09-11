
//in a class we can have variables, methods 
//and also we can have a class inside a class //why?
class Person
{
	public void displayName()
	{
		System.out.println("Pranav");
	}
	
	//what if we want to store the address of object
	//or may be we want to associate a Phone to Person
	//instead of creating a different class of Phone which is accessable by anyone in public
	//we can specify a Phone class only for the Person by creating a Phone class in Person class
	//whenever we want to access the Phone class we need to nefer it through Person object
	//we can't create Phone object directly (without Person class)
		
	class Phone
	{
		public void displayCompany()
		{
			System.out.println("Samsung");
		}
	}
	
	//if we want to restrict a particular class to another class, we can use inner classes
	//Phone class is member of Person class (inner class is member of outer class)
	//so, we can make inner class as static, not the outer class
	
	static class Bike
	{
		public void showNumber()
		{
			System.out.println("AP05SP2222");
		}
	}
}

public class Demo01InnerClass 
{
	public static void main(String[] args) 
	{	
		Person p = new Person();
		p.displayName();
		
		
		//calling methods of Phone class (non-static)
		Person.Phone ph = p.new Phone(); //if the inner class is non-static
		ph.displayCompany();
		
		//calling methods of Bike class (static)
		Person.Bike b = new Person.Bike(); //if the inner class is static
		b.showNumber();
	}
}
