
@FunctionalInterface
interface ILength
{
	void findLength(String name);
}

public class Demo06LambdaEx03 {

	public static void main(String[] args)
	{
		ILength l = name -> System.out.println("Length of your name is " + name.length());
		l.findLength("SalapakaSreepranav");
	}
}
