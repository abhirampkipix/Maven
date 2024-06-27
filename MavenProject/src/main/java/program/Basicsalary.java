package program;

import java.util.Scanner;

public class Basicsalary {
double basicpay;
double deduction;
double bonus;
public void bpay() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter basic pay: ");
    basicpay = scanner.nextDouble();
    System.out.print("Eter deduction: ");
    deduction = scanner.nextDouble();
    System.out.print("Enter bonus: ");
    bonus = scanner.nextDouble();
    scanner.close();
}
public void printDetails() {
    System.out.println("Basic Pay: " + basicpay);
    System.out.println("Deduction: " + deduction);
    System.out.println("Bonus: " + bonus);
}

public static void main(String[] args) {
   Basicsalary employee = new Basicsalary();
 employee.bpay();
  employee.printDetails();
}
}

