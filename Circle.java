package javaStudy;

public class Circle {

	//メインで半径をいれる
	//１．球の体積　２．円の面積
	//　体積   4π×（半径）3乗　/3
	//　面積　（半径）2乗×π
	public int hanke;
	public Circle(int han) {
		hanke = han;
	}

	public double taiseki() {
		return 4*(Math.PI)*hanke*hanke*hanke/3;
	}

	public double menseki() {
		return hanke*hanke*Math.PI;
	}

	public String toString(){

		return String.format("半径は%2d 体積は%.2f 面積は%.2f",hanke,taiseki(),menseki());

	}
}
