
//overriding concept
class A
{
	public void show()
	{
		System.out.println("in A show()");
	}
}

//the main reason of class B is to override the method show()
class B extends A
{
	@Override
	public void show() 
	{
		System.out.println("in B show");
	}
}

public class Demo02 
{
	public static void main(String[] args)
	{
//		A obj = new A();
//		obj.show();
//		
//		A obj2 = new B();
//		obj2.show();
		
		//if we want to change the behavior of a particular method, then why to create a separate class
		//if can do something like this, which is an anonymous inner class 
		A a = new A() 
				{
			//this is an another class
					@Override
					public void show()
					{
						System.out.println("in new show");
					}
					
					public void getData()
					{
						System.out.println("new data");
					}
				};
		a.show();
				
		//the draw back of this inner class is this can be useful only to one object
		//if there is an specialized method (new method which is not in class), we can't call that method
		//a.getData(); //not accessible 
		
		//anonymous object
		new B().show();
		
		//anonymous abject of anonymous inner class
		new A() 
		{
			@Override
			public void show()
			{
				System.out.println("in new show");
			}
			
			public void getData()
			{
				System.out.println("new data");
			}
		}.getData();
		//by this syntax we can call specialized method
		
	}
}
