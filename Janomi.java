package javaStudy;

import java.util.Random;
import java.util.Scanner;

public class Janomi {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("おみくじ引きたい？ はい(1) いいえ(2)");

		Scanner input = new Scanner(System.in);
		int a  = input.nextInt(); //手入力の数字はa
			if(a==1) {
				System.out.println("おみくじ引くにはじゃんけんに勝ってから！");
				System.out.println("じゃんけんしますか？ はい(1) いいえ(2)");
				int b  = input.nextInt();
				if(b==1) {
					//ここでjankenメソッド起動
					if(janken())omikuzi();		//勝っていればtrueで戻る → おみくじメソッド起動
					else{System.out.print("また遊んでね"); //もう一度チャレンジしますか？はい(1) いいえ(2)"
					}

				}

				else System.out.print("じゃんけんしたかった～");

			}
			else System.out.print("また遊ぼう！");
}


//じゃんけんゲームのメソッド-------------------------
	public static boolean janken() {

		System.out.println("じゃんけんゲームスタート！\n");
		System.out.println("3回勝つとおみくじが引けるよ");
		System.out.println("グー（０）チョキ（１）パー（２）から選んでね");

		String[] te = {"グー","チョキ","パー"};


		Scanner input = new Scanner(System.in);
		Random r = new Random();

		int a =0; //自分の勝ち数
		int b =0; //CPの勝ち数

			while(a<3 && b<3) {
				int hand  = input.nextInt();		//ユーザーが選ぶ手
				int cp = r.nextInt(3); //ランダムに出る数値（0~2)

				if(hand==cp) {
					System.out.println("私は"+te[cp]+"あいこ!");
				}
				else if( (hand==0 && cp==1) || (hand==1 && cp==2) || (hand==2 && cp==0) ) {
					System.out.println("私は"+te[cp]+"あなたの勝ち");
					a++;
				}
				else if( (hand==1 && cp==0) || (hand==2 && cp==1) || (hand==0 && cp==2) ) {
					System.out.println("私は"+te[cp]+"あなたの負け");
					b++;
				}
			}

			if(a==3) {
				System.out.println("おみくじが引けるよ");
				return true;
			}
			else if(b==3) {
				System.out.println("残念。");
				return false;
			}

			return false;
	}
//おみくじゲームのメソッド--------------------------------
	public static void omikuzi() {

		String[]omikuzi= {"大吉","吉","中吉","小吉","末吉","凶","大凶"};

		Random r = new Random();
		int hiku = r.nextInt(7);

		System.out.print("あなたの運勢は"+ omikuzi[hiku] );

	}
}
