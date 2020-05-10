package javaStudy;

import java.util.Random;
;

public class Car_race {

	public static void main(String[] args) {

		Random random = new Random();


		Car[] cars = {
			new Car(),
			new Car("Maserati", random.nextInt(100), "red"),
			new Car("Tesla", random.nextInt(100), "white"),
			new Car("BMW", random.nextInt(100), "silver"),
			new Car("Porsche", random.nextInt(100), "black"),
			new Car("Audi", random.nextInt(100), "blue")
		};

		cars = sort(cars);
		for(int i = 0; i<cars.length; i++)
		System.out.println(i+1+"位は "+cars[i].carName);
	}


	public static Car[] sort(Car[]car) {

		Car hozonA ;
		for(int i = 0; i<car.length; ++i)
			for(int a=i+1; a<car.length; a++)
				if(car[i].speed < car[a].speed) {
					hozonA = car[i];
					car[i]=car[a];
					car[a]=hozonA;
				}
		return car;


		}

}
