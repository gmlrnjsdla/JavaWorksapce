import java.util.Scanner;

public class Ex0905_01 {

	public static void main(String[] args) {
		//2의 배수이거나 3의 배수만 출력
//		for(int i=1;i<=10;i++) {
//			if(i%2==0 || i%3==0)
//				System.out.println(i);
//		}

//================================================//
		//6부터 출력 continue
//		for(int i=1;i<=10;i++) {
//			if(i<6)
//				continue;
//			System.out.println(i);
//		}
		
//=================================================//
		//월을 입력받아 그 월의 달력을 출력하시오.
//		int month ,day,i;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("월을 입력하세요 >>");
//		month = sc.nextInt();
//		
//		if(month ==2) 
//			day = 28;
//		else if (month ==4 || month ==6 || month ==9 || month ==11) 
//			day = 30;
//		else 
//			day = 31;
//			
//		for(i=1;i<=day;i++) {
//			System.out.print(i+" ");
//			if(i%7==0)
//				System.out.println();
//		}
//		sc.close();
		
//==================================================//
		//윤년 계산
//		int year,i;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("년도를 입력하시오 >> ");
//		year = sc.nextInt();
//		
//		if(year % 4 ==0 && year % 100 !=0 || year % 400==0)
//			System.out.println("윤년입니다.");
//		else
//			System.out.println("윤년이 아닙니다.");
//	
//		sc.close();
		
//======================================================//
		//369게임
		int num, i ;
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 >> ");
		num = sc.nextInt();
		
		for(i=1;i<=4;i++) {
			
			if(num%10 !=0 && num%10%3==0)
				System.out.print("짝");
			num = num /10;
		}
		sc.close();
	}
}