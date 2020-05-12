package javaStudy;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Major B = new Major();
		B.setInstructorName("山田");
		B.addStudent("織田信長");
		B.addStudent("豊臣秀吉");
		B.addStudent("徳川家康");
		B.addStudent("上杉謙信");
		B.addStudent("武田信玄");
		B.addStudent("前田慶次");
		B.addStudent("明智光秀");
		B.addStudent("石田三成");
		B.addStudent("伊達政宗");
		B.addStudent("服部半蔵");
		B.addStudent("森蘭丸");
		B.addStudent("今川義元");
		B.addStudent("本田忠勝");
		B.addStudent("真田信繁");
		B.addStudent("黒田官兵衛");
		B.addStudent("竹中半兵衛");
		B.addStudent("毛利元就");
		B.addStudent("加藤清正");
		B.addStudent("柳生十兵衛");
		B.addStudent("柴田勝家");
		B.dropStudent("織田信長");
		B.dropStudent("徳川家康");
		B.dropStudent("柴田勝家");
		B.addStudent("徳川秀忠");
		B.addStudent("徳川家光");
		System.out.println("==============================================");

		//この人の専攻は〇〇です。


		System.out.println("==============================================");
		B.print();
		Major M = new Major();

		System.out.print("\n");

		B.allStudents();
		System.out.println("==============================================");

		Course A = new Course();
		A.print();

	}

}
