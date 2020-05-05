package javaStudy;

public class Kukuarray {

	public static void main(String[] args) {

		System.out.println("多次元配列で九九を表示\n");

		int[][] kuku = new int[9][9];


		for(int a = 0; a<9;a++) {
			for(int b = 0; b<9; b++) {
				kuku[a][b]=(a+1)*(b+1);
				System.out.printf(" %2d",kuku[a][b]);
			}
				System.out.print("\n");
		}


	}

}
