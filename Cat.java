package javaStudy;

public class Cat extends Animal {

	String[] playList = { "ひっかく", "伸びる", "猫じゃらしで遊ぶ" };

	public void Cat() {
		System.out.println("ニャーニャー♪");
		System.out.println("名前を決めよう！");
	}

	public void zero() {
		System.out.println(animalName + "はひっかいて遊んでいる");
	}

	public void one() {
		System.out.println(animalName + "は全力で伸びている");
	}

	public void two() {
		System.out.println(animalName + "は猫じゃらしに夢中");
	}

	public void getPlayList() {
		for (int i = 0; i < playList.length; i++)
			System.out.print(playList[i] + "<" + i + "> ");
	}

	public void plays(int i) {
		System.out.println(playList[i]);
		if (i == 0)
			zero();
		else if (i == 1)
			one();
		else
			two();
	}

}
