package Janken3;

import java.util.Random;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("じゃんけんしよう！");

		Random r = new Random();
		String te[] = {"グー","チョキ","パー"};

		System.out.print("グー(0)・チョキ(1)・パー(2)から数字を選んでね ");

		int a =0;     //自分の勝ち数
		int b =0;     //CPの勝ち数

		while( a < 3 && b < 3) {

			int hand = input.nextInt();//自分の選択する手
			int number = r.nextInt(3); //ランダムに出る数値（0~2)


			if( hand == number )
				System.out.println("私は["+te[number]+"]あいこ");

			else if((hand==0  && number==1) || (hand==1  && number==2)||(hand==2  && number==0)) {
				System.out.println("私は["+te[number]+"]あなたの勝ち");
				a++;

			}
			else if((hand==1  && number==0) || (hand==2  && number==1)||(hand==0  && number==2)) {
				System.out.println("私は["+te[number]+"]あなたの負け");
				b++;
			}

		}
		if(a == 3)System.out.print("Congratulations!!");
		else if(b == 3)System.out.print("Sorry, you lost.");

	}

}
