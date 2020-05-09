package javaStudy;

public class MethodPractice {

	public static void main(String[] args) {

		int[] array = {2,4,8,3,10,1,0,9};


		array=sort(array);
		for(int i=0; i<array.length; i++) {
			System.out.println((array[i]));
		}

	}

	public static int[] sort(int[]number) {

		int hozonA = 0;
		for(int i = 0; i<number.length; ++i)
			for(int a=i+1; a<number.length; a++)
				if(number[i] > number[a]) {
					hozonA = number[i];
					number[i]=number[a];
					number[a]=hozonA;
				}
		return number;


	}

}
