import java.util.Scanner;

class Circle{
	private double x, y;
	private int radius;
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double area() {
		return radius * radius * 3.14;
	}
	
	public void show() {
//		System.out.println("(" + x + "," + y + ")" + radius);
		System.out.println("가장 면적이 큰 원은 "+"(" + x + "," + y + ")" + radius);
		System.out.println("넓이는: "+area());
	}
}
public class CircleManager {

	public static void main(String[] args) {
		double max = -1; 
		int index = 0;
		Scanner sc = new Scanner(System.in);
		Circle c [] = new Circle[3];
		for(int i =0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = sc.nextDouble();
			Double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x,y,radius);
		}
		
		for(int i = 0; i<c.length; i++) {			
			if(max<c[i].area()) {
				max = c[i].area();
				index = i;
			}
		}
		c[index].show();
	}

}
