package ua.lviv.lgs;

public class Aplication {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		
		Rectangle r2 = new Rectangle(50, 50);
		
		Circle c1 = new Circle();
		
		System.out.println("����� ������������ = " + r1.square());
		System.out.println("�������� ������������ = " + r1.perimeter());
		
		System.out.println("����� ������������ = " + r2.square());
		System.out.println("�������� ������������ = " + r2.perimeter());

		c1.squareCircle(20);
		c1.lengthCircle(10);
		
	}

}
