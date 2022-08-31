import java.util.Scanner;

public class Ex0831_01 {

	public static void main(String[] args) {
		// 정수를 입력받아 짝수인지 홀수인지를 판별하시오
//		int num;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		num = sc.nextInt();
//		
//		if(num % 2 == 0) {
//			System.out.println("짝수");
//		}
////		if(num % 2 != 0) {
////			System.out.println("홀수");
////		}
//		else {
//			System.out.println("홀수");
//		}
//		sc.close();
		
		// 80점 이상 합격
		int grade;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		grade = sc.nextInt();
		
		if(grade >= 80) {
			System.out.println("합격");
		}

		else {
			System.out.println("불합격");
		}
		sc.close();
	}

}
