package javaStudy1;

public class fibonacci {

public static void main(String[] args) {

		System.out.print("0 1 ");
		int hozonA = 0;
		int hozonB = 1;
		for(hozonA=0; hozonA+hozonB <= 100; )
		{
			System.out.print(hozonA+hozonB + " ");
			hozonB = hozonB+hozonA;
			hozonA = hozonB-hozonA;
				}

}
}

