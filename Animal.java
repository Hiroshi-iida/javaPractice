package javaStudy;

public class Animal {

	public String animalName;
	public int age;
	public String race;
	String[] playList = { "噛", "嗅", "ボールで遊ぶ" };

	public void Animal() {

	}

	public void top() {
		System.out.println("何して遊ぶ？");
		getPlayList();

	}

	public void getPlayList() {
		for (int i = 0; i < playList.length; i++)
			System.out.print(playList[i] + "<" + i + "> ");
	}

	public void replay() {
		System.out.println("まだ遊びますか？");
		System.out.println("はい＜0＞　いいえ＜1＞");
	}

	public void setAnimalName(String animalName) {
		System.out.println(animalName + "だね！");
		this.animalName = animalName;

	}

	public void end() {
		System.out.println("また" + animalName + "と遊んであげてね！");
	}

}
