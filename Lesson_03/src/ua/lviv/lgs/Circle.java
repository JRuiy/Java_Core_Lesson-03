package ua.lviv.lgs;

public class Circle {
	
	private double radius;
	private double diameter;
	
	public void squareCircle(double diameter) {
		System.out.println("Площа кола = " + (3.14/4)*(diameter*diameter));
	}
	
	public void lengthCircle(double radius) {
		System.out.println("Довжина кола = " + 2 * 3.14 * radius);
	}

}
