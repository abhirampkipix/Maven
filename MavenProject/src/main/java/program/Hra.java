package program;

public class Hra extends Basicsalary{
	 double hra;
	    double pf;


public void calculate() {
    hra = 0.05 * basicpay;
    pf = 0.20 * basicpay;
}

public void printHRA() {
    System.out.println("HRA: " + hra);
}

public void printPF() {
    System.out.println("PF: " + pf);
}
}