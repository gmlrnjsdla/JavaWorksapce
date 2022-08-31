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
		
//=====================================================//
		
		// 80점 이상 합격
//		int grade;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		grade = sc.nextInt();
//		
//		if(grade >= 80) {
//			System.out.println("합격");
//		}
//
//		else {
//			System.out.println("불합격");
//		}
//		sc.close();
		
//=====================================================//
		
		//정수를 입력받아 양수 음수 0?
//		int num;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		num = sc.nextInt();
//		
//		if(num > 0 ) {
//			System.out.println("양수");
//		}
//		else if(num < 0) {
//			System.out.println("음수");
//		}
//		else
//			System.out.println("0");
//	
//		sc.close();
		
//======================================================//
		
		//월을 입력받아 각 달의 마지막 날짜를 출력하시오
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요(1~12): ");
		month = sc.nextInt();
		
		if(month == 2) {
			System.out.println("28");
		}
		else if(month == 4 || month == 6 || month == 9|| month == 11) {
			System.out.println("30");
		}
		else
			System.out.println("31");
	
		sc.close();
	}

}
