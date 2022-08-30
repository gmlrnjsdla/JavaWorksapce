import java.util.Scanner;

//반지름이 5cm인 원의 넓이를 구하시오.
public class Ex0830_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름(cm)을 입력해주세요: ");
		int r = sc.nextInt();
		double area;
		final double PI = 3.14;
		
		area = r*r*PI;
		System.out.println("원의 넓이는 : " + area +"㎤");
		area = 2*r*PI;
		System.out.println("원의 둘레는 : " + area + "cm");
		
		sc.close();
	}

}
