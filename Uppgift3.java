import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Uppgift3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("ange Kvadraten area");
		Square square = new Square(in.nextInt());
		
		System.out.println("ange Trianglens bas");
		int triangleBase = in.nextInt();
		System.out.println("ange Trianglens höjd");
		int triangleHeight = in.nextInt();
		System.out.println("ange cirkelns area");
		Circle circle = new Circle(in.nextInt());
		Triangle triangle = new Triangle(triangleHeight, triangleBase);
		biggestArea(new Figure[] {square,circle,triangle});
		
		
	}
	
	
	public static void biggestArea(Figure ... figures){
		Figure max = figures[0];
		
		int i = 0;
		for (Figure n : figures) {
			if(n.getArea()>max.getArea()){
				max = n;
			}
			
		}
		
		System.out.println(max.getClass().getName() + " är störst med en area på " + max.getArea());
	}
	
	
	

}

class Figure {
	private int area;
	
	public Figure(){
		
	}
	
	public int getArea(){
		return area;
	}
	
	public void setArea(int area){
		this.area = area;
	}
		
}
	
class Circle extends Figure {
	private int radius;
	
	
	Circle(int radius) {
		super();
		this.radius = radius;
		setArea(calculateCircleArea());
		
	}
	
	private int calculateCircleArea(){
		return (int)3.14 * radius * radius;
	}
	
	
	
}

class Triangle extends Figure {
	private int height;
	private int base;
	
	Triangle(int height, int base) {
		super();
		this.height = height;
		this.base = base;
		setArea(calculateTriangleArea());
		
	}
	private int calculateTriangleArea() {
		return (base * height) /2;
	}
	
}

class Square extends Figure {
	private int side;
	Square(int side) {
		super();
		this.side = side;
		setArea(calculateSquareArea());
	}
	public int calculateSquareArea() {
		return side * side;
	}
	
}