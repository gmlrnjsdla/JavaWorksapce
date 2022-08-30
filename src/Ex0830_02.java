import java.util.Scanner;

//두 정수를 입력받아 사각형의 넓이를 구하시오.
public class Ex0830_02 {

	public static void main(String[] args) {
		int width, height, result;
		System.out.println("가로, 세로의 길이를 입력하시오");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("가로 : ");
		width = scanner.nextInt();
		
		System.out.println("세로 : ");
		height = scanner.nextInt();
		
		result = width * height;
		System.out.println("사각형의 넓이 = " + result);
		result = width * height /2;
		System.out.println("삼각형의 넓이 = " + result);
		
		scanner.close();

	}

}
