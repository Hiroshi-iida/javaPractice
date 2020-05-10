package javaStudy;

public class Car {

	public String carName;
	public int speed;
	public String carColor;

	public Car() {
		carName = "prius";
		speed = 5;
		carColor = "red";
		printCar();
	}

	public Car(String Name, int accele, String Color) {
		carName = Name;
		speed = accele;
		carColor = Color;
		printCar();
	}

	public void printCar() {
		System.out.println("あなたの車種は" + carName + "です");
		System.out.println("加速度は" + speed + "km/s" + "です");
		System.out.println("色は" + carColor + "です");
		System.out.println();
	}

}
