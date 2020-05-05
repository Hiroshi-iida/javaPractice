package javaStudy;

import java.util.Random;

public class Diet {

  public static void main(String[] args) {

	  // 70kgスタート　trueの場合+1kg　falseの場合-1.1kg
	  // 60kgになるまで何日かかるか？

	  double weight = 70;
	  int a =0;


	  Random r = new Random();

		while(weight > 60) {
			Boolean no = r.nextBoolean();
			if(no==true) weight+=1;
			else if(no==false)weight-=1.1;
			System.out.printf("今日の体重は%.1f",weight);
			System.out.print("\n");
			a++;
		}
		System.out.println(a+"日かかりました");


}
}
