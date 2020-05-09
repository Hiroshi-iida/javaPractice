package javaStudy;

public class Nijo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//1~10の2乗を表示

		for(int i =1; i<=10; i++) {
			int b = nijo(i);
			System.out.print(b+" ");

		}

	}

	public static int nijo(int a) {
		int x =a*a;
		return x;
	}
}
