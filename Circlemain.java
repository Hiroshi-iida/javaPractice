package javaStudy;

public class Circlemain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		  Circle en = new Circle(10);

		  System.out.printf("面積は%.2f㎡です\n",en.menseki());
		  System.out.printf("体積は%.2f㎥です\n",en.taiseki());

		  Circle A = new Circle(1);
		  System.out.print(A);
	}

}
