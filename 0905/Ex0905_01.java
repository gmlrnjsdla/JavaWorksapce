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
//		int num, i ;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("수를 입력하세요 >> ");
//		num = sc.nextInt();
//		
//		for(i=1;i<=4;i++) {
//			
//			if(num%10 !=0 && num%10%3==0)
//				System.out.print("짝");
//			num = num /10;
//		}
//		sc.close();
		
//========================================================//
		//1부터 ?까지의 합 구하기
//		int i=1;
//		int sum =0;
//		while(true){
//			sum = sum +i;
//			System.out.println(i+"=> sum: "+sum);
//			if(sum>40000000)
//				break;
//			i++;	
//		}
//========================================================//
			
//		int i,sum1=0 ,sum2=0;
//		for(i=1;i<=100;i++) {
//			if(i%2 !=0)
//				sum1 = sum1+i;
//			else if (i%2 ==0)
//				sum2 = sum2+i;
//		}
//		System.out.println("홀수의 합: "+sum1+" 짝수의 합 : "+sum2);
//		System.out.println("둘의 합: "+(sum1+sum2));
		
//==========================================================//
		//팩토리얼
//		int num,sum=1,i;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("값을 입력하세요 >> ");
//		num = sc.nextInt();
//		
//		for(i=1;i<=num;i++)
//			sum = sum *i;
//		System.out.println(num+"! = "+sum);
//		
//		sc.close();
		
//=============================================================//
		
		//5명의 임의의 국어점수를 입력받아 총점과 평균
//		double sum=0;
//		int score,n;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("인원 수 >> ");
//		n= sc.nextInt();
//		
//		for(int i=1;i<=n;i++) {
//			
//			score = ((int)(Math.random()*101));
//			System.out.println("점수 >> " + score);
//			sum = score+sum;
//		}
//		System.out.println("총점은 : "+sum+" 평균은 : "+sum/n);
//			
//		sc.close();
		
//=================================================================//
		//로또 생성기(1~45 6개 추출,중복x)
		
//		for(int i=1;i<=6;i++) {
//			System.out.println((int)(Math.random()*45)+1);
//			//(int)(Math.random()*최대값-최소값+1)+최소값
//		}
//================================================================//
			//정수를 입력받아 이진수로 출력하시오.
			
//		int num;
//		String sBin="";
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 >> ");
//		num = sc.nextInt();
//		
//		while(true) {
//			sBin = num%2 + sBin;
//			System.out.print(num%2);
//			num = num/2;
//			if(num ==0) 
//				break;	
//		}
//		System.out.println(" >> "+sBin);
//		
//		sc.close();
		
//=============================================================//
		
		
	}
}