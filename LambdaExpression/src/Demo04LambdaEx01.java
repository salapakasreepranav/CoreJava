
interface I
{
	void disp();
}


public class Demo04LambdaEx01 
{
	public static void main(String[] args) 
	{
		//instead of writing implementation in anonymous inner class, we have an interesting shortcut to do it
		I i1 = () -> 
		{
			System.out.println("Hello!");
			System.out.println("we are in lambda disp");
		};
		
		//since there is only one method in the interface, we no need to mention the method name, compiler will understand it, just make an arrow ->
		
		i1.disp();
		
		I i2 = () -> System.out.println("in shorter lambda disp");
		i2.disp();
		
		//since there is only 1 line, no need of { }
		
		//we can't use lambda expression for interface more than one method, 
		//that's why there is special name for interface with 1 abstract method -> it is Functional Interface (previously called as SAM Interface, Single Abstract Method Interface")
		//we declare that interface as FunctionalInterface, so it won't allow to add another method
		//to declare an Functional Interface we use annotation @FunctionalInterface
		
		//Note: we can have default methods(methods with implementation) in FunctionalInterface
		//Note: we can have Object class methods along with SingleAbstractMethod in FunctionalInterface, since the implementation is already given in object class, the class which is implementing the interface will extends Object class
	
		ISample sample = (int num) -> System.out.println(num*num);
		sample.square(4);
		sample.show();
		System.out.println(sample.toString());
	}
}

@FunctionalInterface
interface ISample
{
	void square(int num); //SAM
	default void show()
	{
		System.out.println("in default show");
	}
	String toString(); //object class method
}
