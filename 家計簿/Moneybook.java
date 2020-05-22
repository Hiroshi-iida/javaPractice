package javaPractice;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Moneybook {

	public static void incomeAggregate() throws Exception {
		System.out.println("調べたい項目の集計を選んでください");
		String[] in = { "給与", "副業", "年金", "配当所得", "不動産所得", "すべて" };
		String[] en = { "salary", "sidejob", "pension", "dividend", "rentIncome" };
		for (int i = 0; i < in.length; i++) {
			System.out.print(in[i] + "<" + i + ">\t");
		}
		Scanner A = new Scanner(System.in);
		int item = A.nextInt();

		int incomeTotal = 0;

		if (item == 5) {
			for(int t = 0; t < in.length-1 ; t++) {
				incomeTotal += getItemAggregate(en[t], "income");
			}
			System.out.println("収入合計"+incomeTotal+"円");
			for (int i = 0; i < in.length-1 ; i++) {
				System.out.print(in[i]+"\t");
				System.out.print(getItemAggregate(en[i],"income")+"\t");
				double ag = getItemAggregate(en[i], "income");
				double to = incomeTotal;
				double proportion = ag/to*100;
				System.out.printf("%.1f",proportion);
				System.out.print("%");
				System.out.println();
			}

		} else {
			System.out.print(in[item]);
			System.out.println(getItemAggregate(en[item], "income")+"円です");
		}

	}

	public static void expensesAggregate() throws Exception {
		System.out.println("調べたい項目の集計を選んでください");
		String[] in = { "食費", "日用品", "交際費", "水光熱", "住宅", "貯金", "定期預金","すべて" };
		String[] en = { "foodExpenses", "necessities", "socializing", "utility", "housing", "investment","deposit" };
		for (int i = 0; i < in.length; i++) {
			System.out.print(in[i] + "<" + i + ">\t");
		}
		Scanner A = new Scanner(System.in);
		int item = A.nextInt();
		int expensesTotal = 0;

		if (item == 7) {
			for(int t = 0; t < in.length-1 ; t++) {
				expensesTotal += getItemAggregate(en[t], "expenses");
			}
			System.out.println("支出合計"+expensesTotal+"円");
			for (int i = 0; i < in.length-1 ; i++) {
				System.out.print(in[i]+"\t");
				System.out.print(getItemAggregate(en[i],"expenses")+"\t");
				double ag = getItemAggregate(en[i], "expenses");
				double to = expensesTotal;
				double proportion = ag/to*100;
				System.out.printf("%.1f",proportion);
				System.out.print("%");
				System.out.println();
		}
		} else {
			System.out.print(in[item]);
			System.out.println(getItemAggregate(en[item], "expenses"));
		}

	}

	public static int getItemAggregate(String item, String file) throws Exception {

		int itemSum = 0;

		ArrayList<String> itemlist = new ArrayList<String>();
		java.io.File A = new java.io.File(file + "Item.txt");
		Scanner inputItem = new Scanner(A);

		ArrayList<Integer> amountlist = new ArrayList<Integer>();
		java.io.File B = new java.io.File(file + "Amount.txt");
		Scanner inputAmount = new Scanner(B);

		int amount = 0;
		while (inputAmount.hasNext()) {
			amount = inputAmount.nextInt();
			amountlist.add(amount);
		} //incomeAmountにあるデータlist書き出し完了

		String y = null;
		while (inputItem.hasNext()) {
			y = inputItem.next();
			itemlist.add(y);
		} //incomeItemにあるデータ書き出し完了

		for (int i = 0; i < itemlist.size(); i++) {
			if (itemlist.get(i).equals(item)) {
				itemSum += amountlist.get(i);
			}
		}
		inputItem.close();
		inputAmount.close();

		return itemSum;

	}


	public static int itemAggregates(String item, String file) throws Exception {

		int itemSum = 0;

		ArrayList<String> itemlist = new ArrayList<String>();
		java.io.File A = new java.io.File(file + "Item.txt");
		Scanner inputItem = new Scanner(A);

		ArrayList<Integer> amountlist = new ArrayList<Integer>();
		java.io.File B = new java.io.File(file + "Amount.txt");
		Scanner inputAmount = new Scanner(B);

		int amount = 0;
		while (inputAmount.hasNext()) {
			amount = inputAmount.nextInt();
			amountlist.add(amount);
		} //incomeAmountにあるデータlist書き出し完了

		String y = null;
		while (inputItem.hasNext()) {
			y = inputItem.next();
			itemlist.add(y);
		} //incomeItemにあるデータ書き出し完了

		for (int i = 0; i < itemlist.size(); i++) {
			if (itemlist.get(i).equals(item)) {
				itemSum += amountlist.get(i);
			}
		}
		inputItem.close();
		inputAmount.close();

		return itemSum;

	}

	public static void income(int amount, String itemName) throws Exception {
		ArrayList<Integer> i = new ArrayList<Integer>();

		java.io.File A = new java.io.File("incomeAmount.txt");

		Scanner input = new Scanner(A);
		int x = 0;
		while (input.hasNext()) {
			x = input.nextInt();
			i.add(x);
		} //ファイルにあるデータを一旦Listにすべて保存

		i.add(amount); //今回入力されたデータをlistに追加

		java.io.PrintWriter output = new java.io.PrintWriter(A);
		try {
			System.out.println();
		} catch (Exception ex) {
		}

		for (int y = 0; y < i.size(); y++) {
			output.println(i.get(y));
		} //listにあるデータをファイルに保存。
		input.close();
		output.close();

		//============
		ArrayList<String> s = new ArrayList<String>();

		java.io.File B = new java.io.File("incomeItem.txt");

		Scanner input1 = new Scanner(B);
		String y = null;
		while (input1.hasNext()) {
			y = input1.next();
			s.add(y);
		} //ファイルにあるデータを一旦Listにすべて保存

		s.add(itemName); //今回入力されたデータをlistに追加

		java.io.PrintWriter output1 = new java.io.PrintWriter(B);
		try {
			System.out.println();
		} catch (Exception ex) {
		}

		for (int z = 0; z < s.size(); z++) {
			output1.println(s.get(z));
		} //listにzあるデータをファイルに保存。
		input1.close();
		output1.close();

		//=====================================================

		Date porocessingDate = new Date();

		ArrayList<String> date = new ArrayList<String>();

		java.io.File C = new java.io.File("incomeDate.txt");

		Scanner input2 = new Scanner(C);
		String z = null;
		while (input2.hasNext()) {
			z = input2.next();
			date.add(z);
		} //ファイルにあるデータを一旦Listにすべて保存

		String str = new SimpleDateFormat("yyyy-MM-dd").format(porocessingDate);
		date.add(str); //今回入力されたデータをlistに追加

		java.io.PrintWriter output2 = new java.io.PrintWriter(C);
		try {
			System.out.println();
		} catch (Exception ex) {
		}

		for (int da = 0; da < date.size(); da++) {
			output2.println(date.get(da));
		} //listにzあるデータをファイルに保存。

		input2.close();
		output2.close();

	}

	public static void expenses(int amount, String itemName) throws Exception {
		ArrayList<Integer> i = new ArrayList<Integer>();

		java.io.File A = new java.io.File("expensesAmount.txt");

		Scanner input = new Scanner(A);
		int x = 0;
		while (input.hasNext()) {
			x = input.nextInt();
			i.add(x);
		} //ファイルにあるデータを一旦Listにすべて保存

		i.add(amount); //今回入力されたデータをlistに追加

		java.io.PrintWriter output = new java.io.PrintWriter(A);
		try {
			System.out.println();
		} catch (Exception ex) {
		}

		for (int y = 0; y < i.size(); y++) {
			output.println(i.get(y));
		} //listにあるデータをファイルに保存。
		input.close();
		output.close();

		//============
		ArrayList<String> s = new ArrayList<String>();

		java.io.File B = new java.io.File("expensesItem.txt");

		Scanner input1 = new Scanner(B);
		String y = null;
		while (input1.hasNext()) {
			y = input1.next();
			s.add(y);
		} //ファイルにあるデータを一旦Listにすべて保存

		s.add(itemName); //今回入力されたデータをlistに追加

		java.io.PrintWriter output1 = new java.io.PrintWriter(B);
		try {
			System.out.println();
		} catch (Exception ex) {
		}

		for (int z = 0; z < s.size(); z++) {
			output1.println(s.get(z));
		} //listにzあるデータをファイルに保存。
		input1.close();
		output1.close();

		//==============================================

		Date porocessingDate = new Date();

		ArrayList<String> date = new ArrayList<String>();

		java.io.File C = new java.io.File("expensesDate.txt");

		Scanner input2 = new Scanner(C);
		String z = null;
		while (input2.hasNext()) {
			z = input2.next();
			date.add(z);
		} //ファイルにあるデータを一旦Listにすべて保存

		String str = new SimpleDateFormat("yyyy-MM-dd").format(porocessingDate);
		date.add(str); //今回入力されたデータをlistに追加

		java.io.PrintWriter output2 = new java.io.PrintWriter(C);
		try {
			System.out.println();
		} catch (Exception ex) {
		}

		for (int da = 0; da < date.size(); da++) {
			output2.println(date.get(da));
		} //listにzあるデータをファイルに保存。

		input2.close();
		output2.close();

	}

}
