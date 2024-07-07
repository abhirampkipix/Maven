package exception;

public class ExceptionHandling {
	int a=5,div;
	public void add() {
		try {
		div=a/0;
		System.out.println("division:"+div);
		
	}
		catch(ArithmeticException e) {
			
			System.out.println("Division by Zero is not possible"+ e);
			
		}
	}

	public static void main(String[] args) {
ExceptionHandling obj=new ExceptionHandling();
obj.add();
	}
	}

