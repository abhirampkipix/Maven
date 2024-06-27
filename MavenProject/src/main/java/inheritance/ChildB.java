package inheritance;

public class ChildB extends ChildA {
	public void distribution3() {
		System.out.println("this is child b");
	}

	public static void main(String[] args) {
ChildB dis=new ChildB();
dis.distribution3();
dis.distribution2();
dis.distribution1();



	}

}
