package javaStudy;

public class Student {

	public static int ID = 0;
	public String name;
	public int japanese;
	public int math;
	public int english;
	public int sciense;
	public int social;

	public Student() {
		ID = 0;
		name = "山田";
		japanese = 10;
		math = 10;
		english = 10;
		sciense = 10;
		social = 10;

		printStudent();
	}

	public Student(String name, int ja, int ma, int en, int sc, int so) {
		ID++;
		this.name = name;
		japanese = ja;
		math = ma;
		english = en;
		sciense = sc;
		social = so;

		printStudent();
	}

	public void printStudent() {
		System.out.println("名前は"+name+"です");
		System.out.println("学籍番号は"+ID+"番です");
		System.out.println("国語の点数は"+japanese+"点です");
		System.out.println("数学の点数は"+math+"点です");
		System.out.println("英語の点数は"+english+"点です");
		System.out.println("理科の点数は"+sciense+"点です");
		System.out.println("社会の点数は"+social+"点です");

		System.out.print("\n");
	}

	public void printAdd(){
		System.out.println(name+"くんの合計点数は"+(japanese+math+english+sciense+social)+"点でした。");
	}
	public int add(){
		return (japanese+math+english+sciense+social);
	}

	public void grade() {
		if(japanese >= 80) 	System.out.println(name+"の国語の評価は「S」です");
		else if (japanese >=70)  System.out.println(name+"の国語の評価は「A」です");
		else if (japanese >=60)  System.out.println(name+"の国語の評価は「B」です");
		else if (japanese >=40)  System.out.println(name+"の国語の評価は「C」です");
		else  System.out.println(name+"の国語は「追試」が必要です");

		if(math >=80)  System.out.println(name+"の数学の評価は「S」です");
		else if (math >=70)  System.out.println(name+"の数学の評価は「A」です");
		else if (math >=60)  System.out.println(name+"の数学の評価は「B」です");
		else if (math >=40)  System.out.println(name+"の数学の評価は「C」です");
		else  System.out.println(name+"の数学は「追試」が必要です");

		if(english >= 80) 	System.out.println(name+"の英語の評価は「S」です");
		else if (english >=70)  System.out.println(name+"の英語の評価は「A」です");
		else if (english >=60)  System.out.println(name+"の英語の評価は「B」です");
		else if (english >=40)  System.out.println(name+"の英語の評価は「C」です");
		else System.out.println(name+"の英語は「追試」が必要です");

		if(sciense >= 80) 	System.out.println(name+"の理科の評価は「S」です");
		else if (sciense >=70)  System.out.println(name+"の理科の評価は「A」です");
		else if (sciense >=60)  System.out.println(name+"の理科の評価は「B」です");
		else if (sciense >=40)  System.out.println(name+"の理科の評価は「C」です");
		else System.out.println(name+"の理科は「追試」が必要です");

		if(social >= 80) 	System.out.println(name+"の社会の評価は「S」です");
		else if (social >=70)  System.out.println(name+"の社会の評価は「A」です");
		else if (social >=60)  System.out.println(name+"の社会の評価は「B」です");
		else if (social >=40)  System.out.println(name+"の社会の評価は「C」です");
		else System.out.println(name+"の社会は「追試」が必要です");

		System.out.print("\n");
	}

	public boolean[] tuisi() {
		boolean[] retest = new boolean[5];

		retest[0] = (japanese <40);
		retest[1] = (math <40);
		retest[2] = (english <40);
		retest[3] = (sciense <40);
		retest[4] = (social <40);

		return retest;
	}


	public  void printAverage() {
		System.out.println(name+"くんの5教科の平均は"+(add()/5)+"点でした！");
	}

	public  int average() {
		return (add()/5);
	}

	public static Student[] sort(Student[]student){
		Student hozonA ;
		for(int i = 0; i<student.length; i++)
			for(int a = i+1; a<student.length; a++)
				if(student[i].average() < student[a].average()) {
					hozonA = student[i];
					student[i]=student[a];
					student[a]=hozonA;
				}
		return student;
		}

}
