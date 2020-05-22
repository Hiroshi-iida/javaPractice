package javaStudy;

import java.util.Date;

public class Account {

	protected int id =0;//口座番号
	protected  String name ;		//口座番号
	protected int balance = 0;		//預金残高
	protected double annuallnterestRate = 3.0;//年利%表示
	protected Date dateCreated;
	Account[] account = new Account[5];

	protected void Account(){
		id ++;
		balance =0;
	}
	public Account(int id,int balance){
		this.id=id;
		this.balance=balance;
	}

	void setId(int id) {
		this.id= id;
	}
	int getId() {
		return id;
	}
	void setBalance(int balance) {
		this.balance= balance;
	}
	int getBalance() {
		return balance;
	}
	void setAnnuallnterestRate(double annuallnterestRate) {
		this.annuallnterestRate= annuallnterestRate;
	}
	double getAnnuallnterestRate() {
		return annuallnterestRate;
	}
	double getMonthlyInterestRate() {
		return annuallnterestRate/1200;	//月利
	}
	double getMonthlyInterest() {
		return balance * annuallnterestRate/1200; //月利息
	}
	Date getDateCreated() {
		Date date = new Date();
		return date;
	}
	void withdraw(int balance) {
		this.balance-=balance;
		System.out.println(id+":　"+balance+"円 引き出されました");
		System.out.println("残金は"+this.balance+"円です");
	}
	void deposit(int balance) {
		this.balance+=balance;
		System.out.println(id+":　"+balance+"円 入金されました");
		System.out.println("残金は"+this.balance+"円です");
	}





}