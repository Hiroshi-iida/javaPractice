package javaStudy1;

public class rennsyuu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ







		int[][]kuku = new int[9][9];

		for(int i =0; i<9;i++) {
			for(int z=0;z<9;z++) {
				kuku[i][z]=(z+1)*(i+1);
				System.out.print(kuku[i][z]+" ");
			}
			System.out.println();
		}

		System.out.print("\n");


		int[] array  = new int[100];
		for(int i=0; i<100;i++) {
			array[i]=i+1;
			System.out.print(array[i]+" ");

					}


	}

}
