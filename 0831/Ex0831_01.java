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
//		int month;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("월을 입력하세요(1~12): ");
//		month = sc.nextInt();
//		
//		if(month == 2) {
//			System.out.println("28");
//		}
//		else if(month == 4 || month == 6 || month == 9|| month == 11) {
//			System.out.println("30");
//		}
//		else
//			System.out.println("31");
//	
//		sc.close();
		
//================================================================//
		
		//점수를 입력받아 성적부여
//		int score;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수 입력(0~100): ");
//		score = sc.nextInt();
//		
//		if(score>=90)
//			System.out.println("A");
//		else if(score>=80)
//			System.out.println("B");
//		else if(score>=70)
//			System.out.println("C");
//		else if(score>=60)
//			System.out.println("D");
//		else
//			System.out.println("F");
//		
//		sc.close();
		
//============================================================//
		
		//두 정수를 입력받아 최대값을 출력하시오
//		int a,b;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("2개의 정수 입력: ");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		
//		if(a>b)
//			System.out.println(a);
//		else
//			System.out.println(b);
//		
//		sc.close();
		
//===============================================================//
		
		//화씨 => 섭씨 ? 섭씨 => 화씨 ? 선택후 출력
		double c,f;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨 -> 섭씨  1 입력, 섭씨 -> 화씨 2입력 : ");
		num = sc.nextInt();
		
		if(num ==1) {
			System.out.print("화씨 입력: ");
			f = sc.nextDouble();
			c = (double)5/9 * (f - 32);
			System.out.println("화씨"+f+"도는 섭씨 "+c+"도");
		}
		
		else {
			System.out.print("섭씨 입력: ");
			c = sc.nextDouble();
			f = (double)9/5*c + 32;
			System.out.println("섭씨"+c+"도는 화씨 "+f+"도");
		}
		 
		sc.close();
	}
}
