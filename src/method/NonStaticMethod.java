package method;

public class NonStaticMethod {

	public void addition() {
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
	}
	public void subtraction() {
		int a=20;
		int b=30;
		int c=a-b;
		System.out.println(c);
	}
	public void multiplication() {
		int a=20;
		int b=30;
		int c=a*b;
		System.out.println(c);
	}
	public void division() {
		double a=20;
		double b=30;
		double c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		NonStaticMethod var1 = new NonStaticMethod();
		
		var1.addition();
		var1.subtraction();
		var1.multiplication();
		var1.division();
		
	}
}
