package javaPractice;

import java.util.ArrayList;
import java.util.Scanner;

import javaStudy.CDAccount;

public class PlayMoneybook {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean end =true ;
		while(end) {
			menu();
			int s = sc.nextInt();
			switch(s){
			case 0:
				income();
				break;
			case 1:
				expenses();
				break;
			case 2:
				incomeTotal();
				break;
			case 3:
				Moneybook inaggregate = new Moneybook();
				inaggregate.incomeAggregate();
				//収入各項目抽出
				break;
			case 4:
				expensesTotal();
				break;
			case 5:
				Moneybook exaggregate = new Moneybook();
				exaggregate.expensesAggregate();
				//支出各項目抽出
				break;
			case 6:
				balance();
				break;
			case 7:
				deposit();
				break;
			}
			System.out.println("終了しますか？");
			System.out.println("はい<0> いいえ<1>");
			int yes = sc.nextInt();
			if(yes==0) end=false;
			else end=true;
		}
			System.out.println("お疲れ様でした。");
	}

	public static void menu() {
		System.out.println("メニューからお選びください");
		System.out.println("0:入金入力");
		System.out.println("1:支出入力");
		System.out.println("2:今月の収入トータルを見る");
		System.out.println("3:今月の収入を項目ごとに見る");
		System.out.println("4:今月の支出を見る");
		System.out.println("5:今月の支出を項目ごとにを見る");
		System.out.println("6:今月の収支結果を見る");
		System.out.println("7:定期預金をする");
	}


	public static void income() throws Exception {
		//				0		1		2	   3		4
		String[] in = {"給与","副業","年金","配当所得","不動産所得"};
		System.out.println("入金の項目はなんですか？");
		for(int i = 0; i<in.length;i++) {
			System.out.print(in[i]+"<"+i+">\t");
		}
		Scanner A = new Scanner(System.in);
		int item = A.nextInt();
		System.out.println("金額はいくらですか？");
		int amount = A.nextInt();
		System.out.println(in[item]+"を"+amount+"円を入力しました。");

		switch(item) {
		case 0:
			Moneybook salary = new Moneybook();
			salary.income(amount, "salary");

		break;
		case 1:
			Moneybook sidejob = new Moneybook();
			sidejob.income(amount, "sidejob");

			break;
		case 2:
			Moneybook pension = new Moneybook();
			pension.income(amount, "pension");
			break;
		case 3:
			Moneybook dividend = new Moneybook();
			dividend.income(amount, "dividend");

			break;
		case 4:
			Moneybook rentIncome = new Moneybook();
			rentIncome.income(amount, "rentIncome");
			break;
		}

	}

	public static void expenses() throws Exception {
		//				0		1		2	   3		4		5
		String[] ex={"食費","日用品","交際費","水光熱","住宅","貯金"};

		System.out.println("支出の項目はなんですか？");
		for(int i = 0; i<ex.length;i++) {
			System.out.print(ex[i]+"<"+i+">\t");
		}
		Scanner A = new Scanner(System.in);
		int item = A.nextInt();
		System.out.println("金額はいくらですか？");
		int amount = A.nextInt();
		System.out.println(ex[item]+"を"+amount+"円を入力しました。");

		switch(item) {
		case 0:
			Moneybook foodExpenses = new Moneybook();
			foodExpenses.expenses(amount, "foodExpenses");

		break;
		case 1:
			Moneybook necessities = new Moneybook();
			necessities.expenses(amount, "necessities");

			break;
		case 2:
			Moneybook socializing = new Moneybook();
			socializing.expenses(amount, "socializing");
			break;
		case 3:
			Moneybook utility = new Moneybook();
			utility.expenses(amount, "utility");

			break;
		case 4:
			Moneybook housing = new Moneybook();
			housing.expenses(amount, "housing");
			break;
		case 5:
			Moneybook investment = new Moneybook();
			investment.expenses(amount, "investment");
			break;

		}
	}

	public static void incomeTotal() throws Exception {

	 		ArrayList<Integer> i = new ArrayList<Integer>();

			java.io.File A = new java.io.File("incomeAmount.txt");

			Scanner input = new Scanner(A);
			int totalAmount = 0;
			while (input.hasNext()) {
				totalAmount += input.nextInt();
				;
			}
			input.close();

			System.out.println("今月の収入トータルは、");
			System.out.println("["+totalAmount+"] 円です!");
	}

	public static void expensesTotal() throws Exception {

		ArrayList<Integer> i = new ArrayList<Integer>();

		java.io.File A = new java.io.File("expensesAmount.txt");

		Scanner input = new Scanner(A);
		int totalAmount = 0;
		while (input.hasNext()) {
			totalAmount += input.nextInt();
			;
		}
		input.close();

		System.out.println("今月の支出トータルは、");
		System.out.println("["+totalAmount+"] 円です!");
	}

	public static void balance() throws Exception {

		ArrayList<Integer> i = new ArrayList<Integer>();

		java.io.File A = new java.io.File("expensesAmount.txt");

		Scanner input = new Scanner(A);
		int expense = 0;
		while (input.hasNext()) {
			expense += input.nextInt();
			;
		}
		input.close();
		ArrayList<Integer> o = new ArrayList<Integer>();

		java.io.File B = new java.io.File("incomeAmount.txt");

		Scanner in = new Scanner(B);
		int income = 0;
		while (in.hasNext()) {
			income += in.nextInt();
			;
		}
		in.close();

		int balance=income-expense;

		System.out.println("今月の収支結果は、");
		System.out.println("["+balance+"] 円です!");

		if(balance<0)	{

			System.out.println("※使いすぎです※");
		}


	}
	public static void deposit() throws Exception {
		Scanner A = new Scanner(System.in);
		System.out.println("何か月預けますか？");
		int month = A.nextInt();
		System.out.println("金額はいくら預けますか？");
		int amount = A.nextInt();
		System.out.println("口座番号を入力してください");
		int id = A.nextInt();
		javaStudy.CDAccount c = new CDAccount(id,amount,month);

		System.out.println(id+":"+amount+"円"+month+"か月間の定期預金が振り込まれました。");
		System.out.println("利率は"+c.setCDAnnualInterestRate(month)+"%のため");
		System.out.printf("%.1f",c.getMatureBalance());
		System.out.println("円の受け取りが可能です。");

		Moneybook deposit = new Moneybook();
		deposit.expenses(amount, "deposit");

		System.out.println("家計簿にも支払いが自動で入力がされました。");

	}


}