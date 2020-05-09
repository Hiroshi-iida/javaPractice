package javaStudy;

public class Sosuu {

	public static void main(String[] args) {

		// 1~10,000までの素数を表示


		for(int i = 1; i <= 10000; i++)
			sosu(i);

		}


	static void sosu(int x) {

		int num = x;		 			 //numはmainで入力される数値
		int sqrt = (int)Math.sqrt(num);  //sqrt は ルートの値


		for(int a=2; a<=sqrt; a++) {
			if(num % a == 0  )return;
		}
			System.out.println(num+"は素数です");








	}

}
