

abstract class P
{
	abstract void show();
}

class R extends P
{
	public void show()
	{
		System.out.println("in R show");
	}
}

interface Sample
{
	void disp();
	void show();
}

public class Demo03 
{
	public static void main(String[] args) 
	{
		P p = new R();
		p.show();
		
		//the pure purpose of class R is to define abstract class, instead we create an anonymous inner class
		
		P pp = new P()
				{
					@Override
					void show()
					{
						System.out.println("in new show");
					}
				};
		pp.show();
		
		//similarly we can do this for an interface
		Sample i = new Sample()
				{
					@Override
					public void disp() 
					{
						System.out.println("in I disp");
					}
					
					@Override
					public void show() 
					{
						System.out.println("in I show");
					}
				};
				
		i.disp();
		i.show();
	}
}
