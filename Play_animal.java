package javaStudy;

import java.util.Scanner;

public class Play_animal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("犬<1> と 猫<2> どっちと遊ぶ？");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		boolean re;
		if (i == 1) {
			Dog A = new Dog();
			A.Dog();
			Scanner scan = new Scanner(System.in);
			A.setAnimalName(scan.next());
			do {
				A.top();
				int x = input.nextInt();
				A.plays(x);
				A.replay();
				int y = input.nextInt();
				if (y == 0)
					re = true;
				else
					re = false;

			} while (re);
			A.end();
		}

		else {
			Cat A = new Cat();
			A.Cat();
			Scanner scan = new Scanner(System.in);
			A.setAnimalName(scan.next());
			do {
				A.top();
				int x = input.nextInt();
				A.plays(x);
				A.replay();
				int y = input.nextInt();
				if (y == 0)
					re = true;
				else
					re = false;

			} while (re);
			A.end();
		}

	}

}
