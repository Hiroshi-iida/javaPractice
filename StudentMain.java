package javaStudy;

import java.util.Random;

public class StudentMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Random r = new Random();
		System.out.println("-------------生徒情報--------");
		Student[] students  = {
			new Student(),
			new Student("ピカチュウ",r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(100)),
		 	new Student("ヒトカゲ",r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(100)),
			new Student("ゼニガメ",r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(100)),
			new Student("フシギダネ",r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(100)),
			new Student("ニャース",r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(100))
		};

		System.out.println("-------------通知簿--------");
		for(int i=0; i<students.length; i++)
			students[i].grade();

		System.out.println("-------------5教科の合計点数--------");
		for(int i=0; i<students.length; i++)
			students[i].printAdd();
		System.out.print("\n");


		System.out.println("-------------追試のみ抽出--------");

		String[] array = new String[] {"国語","数学","英語","理科","社会"};
		for(int i =0; i<students.length; i++) {
			System.out.print(students[i].name+" : ");
			for(int a = 0; a<5 ; a++) {
				if(students[i].tuisi()[a]) {
					System.out.print(array[a]+" ");
				}
			}

			if(students[i].tuisi()[0] == false && students[i].tuisi()[1] ==
				false && students[i].tuisi()[2] == false &&
				students[i].tuisi()[3] == false && students[i].tuisi()[4] == false ){
				System.out.print("congratulation!!");
			}
			System.out.print("\n");
		}


		System.out.print("\n");
		System.out.println("-------------全教科で順位付け--------");

		students = Student.sort(students);

		for(int i =0; i<students.length; i++)
			System.out.println((i+1)+"位は平均点が"+students[i].average()+"点の"+students[i].name);

	}


}
