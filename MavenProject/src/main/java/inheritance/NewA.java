package inheritance;

public class NewA extends New {
	int sub;
	public void substraction() {
		sub=a-b;
		System.out.println(sub);
	}
	public static void main(String[] args) {
		NewA s=new NewA();
		s.add();
		s.substraction();
}
}
