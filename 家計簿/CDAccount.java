package javaStudy;

public class CDAccount extends Account {
	private double CDannualInterestRate = 3.0;
	private int duration = 1;

	private void CDAccount() {
		setDuration(0);
		setCDAnnualInterestRate(3);
	}

	public CDAccount(int id, int balance, int duration) {
		super(id, balance);
		setDuration(duration);
		setCDAnnualInterestRate(duration);
	}

	void setDuration(int duration) {
		this.duration = duration;
	}

	public double setCDAnnualInterestRate(int month) {
		int a = month / 3;
		a *= 0.5 ;
		a += CDannualInterestRate;
		return a;

//		return CDannualInterestRate;
	}
	public double getCDAnnualInterestRate() {

		return CDannualInterestRate;
	}

	public double getMatureBalance() {
		double MatureBalance = balance;
		for (int i = 1; i <= duration; i++) {
			MatureBalance = (MatureBalance + (MatureBalance * CDannualInterestRate / 1200));
		}
		return MatureBalance;
	}

	public double getMatureInterest() {
		return balance * CDannualInterestRate / 1200;

	}

	void displayMonthlyInterests() {
		double MonthlyInterests = balance;
		for (int i = 1; i <= duration; i++) {
			MonthlyInterests = (MonthlyInterests + (MonthlyInterests * CDannualInterestRate / 1200));
			System.out.print(i + "か月目" + "\t");
			System.out.printf("%.2f", MonthlyInterests);
			System.out.println();
		}
	}

	public String toString() {
		String B = String.format("%.2f", getMatureBalance());

		return id + "\t" + balance + "\t" + B + "\t" + CDannualInterestRate + "\t" + getDateCreated();
	}

	void withdraw(int balance) {
		System.out.println("定期預金や! 引き出せへんで！");
	}

	void deposit(int balance) {
		System.out.println("定期預金やさかい入金できひん！");
	}

}