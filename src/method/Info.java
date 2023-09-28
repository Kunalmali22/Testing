package method;

public class Info {
	
	public void s1() {
		String FN="Kunal";
		String MN=" Vinayak";
		String LN=" Mali";
		String Name= "Your Full Name is : "+ FN+MN+LN;
		System.out.println(Name);
	}
	public static void main(String[] args) {
		Info details = new Info();
		details.s1();
	}
}
