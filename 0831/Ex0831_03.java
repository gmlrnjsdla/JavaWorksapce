// switch문 >> if문 가능   if문 >> switch문 안될수도있다.
import java.util.Scanner;

public class Ex0831_03 {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("무슨 커피 드릴까요? ");
//		String order = scanner.next();
//		int price=0;
//		switch (order) {
//			case "에스프레소":
//			case "카푸치노":
//			case "카페라떼":
//				price = 3500;
//				break;
//			case "아메리카노" :
//				price = 2000;
//				break;
//			default:
//				System.out.println("메뉴에 없습니다!");
//		}
//		if(price != 0)
//			System.out.print(order + "는 " + price + "원입니다");
//		scanner.close();
		
//===============================================================//
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		switch(num%2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
		}
	}
}