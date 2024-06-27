package inheritance;

public class Child extends Parent {
	int sub;
public void substraction() {
	sub=a-b;
	System.out.println(sub);
}


	public static void main(String[] args) {
		Child s=new Child();
		s.substraction();
		s.add();

	}

}
