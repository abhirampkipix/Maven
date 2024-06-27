package inheritance;

public class NewB extends New{
		int mul;
		public void multiple() {
			mul=a*b;
			System.out.println(mul);
		}


			public static void main(String[] args) {
				NewB s=new NewB();
				s.multiple();
				s.add();

			}


	}


