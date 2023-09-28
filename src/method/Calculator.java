package method;

public class Calculator {

	public static void addition() 
	{
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	}
	
	public static void subtraction() 
	{
		
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(c);
		
	}
	
	public static void multiplication() 
	{
		
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
		
	}
	
	public static void division() 
	{
		
		double a=10;
		double b=20;
		double c=a/b;
		System.out.println(c);
		
	}
	
	public static void welcome() {
		
		String src =("welcome to Java automation");
		System.out.println(src);
	}
	
	public static void main(String[] args) {
		
		addition();
		subtraction();
		multiplication();
		division();
		
	}
}
