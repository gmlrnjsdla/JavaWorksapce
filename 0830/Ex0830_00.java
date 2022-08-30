//사각형의 넓이 구하기
import java.util.Scanner;
public class Ex0830_00 {
	public static double area(double i, double j) {
		return i * j;
	}
	      
	public static void main(String[] args) {
		System.out.println("가로, 세로의 길이를 입력하세요 ");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("가로 : ");
	      int width = scanner.nextInt();
	    System.out.print("세로 : ");
	      int height = scanner.nextInt();
	      
	    System.out.println("가로는 " + width + "cm,세로는 " 
                  + height + "cm 입니다.");

	    double result = area(width,height);
	    System.out.println("넓이는 " + result + "입니다.");

	    scanner.close();
	}

}
