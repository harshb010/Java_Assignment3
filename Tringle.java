package assignment3;

import java.util.Scanner;

public class Tringle {
	int s1;
	int s2;
	int s3;
	double Area, peri;

	public Tringle(int s1, int s2, int s3) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public double Area() {
		return (0.5 * s1 * s2 * s3);
	}

	public double peri() {
		return (s1 + s2 + s3);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tringle t1 = new Tringle(3, 4, 5);
		System.out.println("area of triangle" + t1.Area());
		System.out.println("perimeter of triangle" + t1.peri());

	}
}
