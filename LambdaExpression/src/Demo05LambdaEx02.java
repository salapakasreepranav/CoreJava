
interface ICalc
{
	int add(int a, int b);
}

public class Demo05LambdaEx02 
{
	public static void main(String[] args) 
	{
		ICalc cal1 = (int n1, int n2) -> 
		{
			return n1+n2; 
		};
		System.out.println(cal1.add(16, 22));
		
		ICalc cal2 = (int a, int b) -> a + b; //no need to mention return statement
		System.out.println(cal2.add(18, 22));
		
		ICalc cal3 = (a, b) -> a + b;  //even no need of type of the arguments
		System.out.println(cal3.add(12, 10));
		
		//ISample is defined in Demo04 class
		ISample sample2 = n -> System.out.println(n * n); //if the method is accepting only one parameter then even no need of mentioning round brackets '(n)' and data type
	}
}
