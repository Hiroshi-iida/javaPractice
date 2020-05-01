package javaStudy1;

public class mosaicArt {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		int siro=5;
		int kuro=1;

		for(int a=1;a<=6;a++) {

			for(int i =1; i<=siro ; i++){
				System.out.print("□");
			}
			for(int i =1;i<=kuro;i++) {
				System.out.print("■");
			}
			for(int i =1; i<=siro ; i++){
				System.out.print("□");
			}
			siro--;
			kuro+=2;


			System.out.print("\n");

		}

		 siro=1;
		 kuro=9;

		for(int a=1;a<=5;a++) {

			for(int i =1; i<=siro ; i++){
				System.out.print("□");
			}
			for(int i =1;i<=kuro;i++) {
				System.out.print("■");
			}
			for(int i =1; i<=siro ; i++){
				System.out.print("□");
			}
			siro++;
			kuro-=2;

			System.out.print("\n");

		}


//		System.out.println("□□□□□■□□□□□");
//		System.out.println("□□□□■■■□□□□");
//		System.out.println("□□□■■■■■□□□");
//		System.out.println("□□■■■■■■■□□");
//		System.out.println("□■■■■■■■■■□");
//		System.out.println("■■■■■■■■■■■");
//		System.out.println("□■■■■■■■■■□");
//		System.out.println("□□■■■■■■■□□");
//		System.out.println("□□□■■■■■□□□");
//		System.out.println("□□□□■■■□□□□");
//		System.out.println("□□□□□■□□□□□");



}}
