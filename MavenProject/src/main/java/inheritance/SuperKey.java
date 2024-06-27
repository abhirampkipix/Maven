package inheritance;

public class SuperKey {
	int a=10;
	int b=20;
	int sum;	
	public void add() {
		sum=a+b;
	}

	public static void main(String[] args) {
SuperKey s=new SuperKey();
   s.add();
	}

}
