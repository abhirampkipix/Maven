package program;

public class Total extends Hra{
	double totalsalary;

	 public void TotalSalary() {
	        totalsalary = basicpay + hra - pf - deduction + bonus;
	    }

	    public void printSalarySlip() {
	        System.out.println("Salary Slip:");
	        System.out.println("Basic Pay: " + basicpay);
	        System.out.println("HRA: " + hra);
	        System.out.println("PF: " + pf);
	       System.out.println("Deduction: " + deduction);
	        System.out.println("Bonus: " + bonus);
	        System.out.println("Total Salary by Hand: " + totalsalary);
	    }

	    public static void main(String[] args) {
	        Total slip = new Total();
	        slip.bpay(); 
	       slip.calculate(); 
	        slip.TotalSalary();
	        slip.printSalarySlip();
	        	    }
	}

	
