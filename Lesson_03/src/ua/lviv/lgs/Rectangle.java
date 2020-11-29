package ua.lviv.lgs;

public class Rectangle {

	private int length;
	private int width;
	
	Rectangle (){
		this.length = 30;
		this.width = 20;
	}
	
	Rectangle (int length, int width){
		this.length = length;
		this.width = width;
	}
	
	public int square() {
		return length*width;
	}
	
	public int perimeter() {
		return length*2 + width*2;
	}
	
}
