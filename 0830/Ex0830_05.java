import java.util.Scanner;

public class Ex0830_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.(초) : ");
		int num = sc.nextInt();
		//hour? min? sec?
		
		int sec = num % 60;
		int min = (num / 60) % 60;
		int hour = (num / 60) / 60 % 60;
		
		System.out.println(hour + "시간 " + min + "분 " + sec +"초" );

		sc.close();
	}

}
