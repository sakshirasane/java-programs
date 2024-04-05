package abstraction;

import java.util.Scanner;

abstract class Bank {
	public abstract double getRateOfInterest();

}

class Axis extends Bank {

	@Override
	public double getRateOfInterest() {
		// TODO Auto-generated method stub
		return 8.5;
	}

}

class Sbi extends Bank {
	@Override
	public double getRateOfInterest() {
		// TODO Auto-generated method stub
		return 6.2;
	}
}

public class TestBank 
{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double principleAmt, years, ratesbi, rateAxis;
		System.out.println("Enter principle Amount and no of years: ");
		principleAmt = sc.nextDouble();
		years = sc.nextDouble();

		Bank Bank;
		Bank = new Sbi();
		ratesbi = Bank.getRateOfInterest();

		Bank = new Axis();
		rateAxis = Bank.getRateOfInterest();

		double interestSbi = principleAmt * years * ratesbi;
		double interestAxis = principleAmt * years * rateAxis;

		System.out.println("Simple Interest of Sbi: " + interestSbi);
		System.out.println("Simple Interest of Axis: " + interestAxis);
	}
}
