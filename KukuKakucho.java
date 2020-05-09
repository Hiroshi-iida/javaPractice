package javaStudy;

public class KukuKakucho {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		int[] array  = new int[100];
		for(int i=0; i<100;i++) {
			array[i]=i+1;
		}

		for( int i : array ) {
			if(i%3 ==0 ) continue;
			System.out.print(i+" ");
		}
	}
}
