package javaStudy;

public class Dog extends Animal {
	String[] playList = { "噛む", "嗅ぐ", "ボールで遊ぶ" };

	public void Dog() {
		System.out.println("ワンワン♪");
		System.out.println("名前を決めよう！");
	}

	public void zero() {
		System.out.println(animalName + "は噛んで遊んでいる");
	}

	public void one() {
		System.out.println(animalName + "は興味津々に嗅いでいる");
	}

	public void two() {
		System.out.println(animalName + " はボールを追いかけている");
	}

	public void getPlayList() {
		for (int i = 0; i < playList.length; i++)
			System.out.print(playList[i] + "<" + i + "> ");
	}

	public void plays(int i) {
		//		System.out.println(playList[i]);
		if (i == 0)
			zero();
		else if (i == 1)
			one();
		else
			two();
	}

}
