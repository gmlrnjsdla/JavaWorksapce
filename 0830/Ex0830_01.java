import java.util.Scanner;

public class Ex0830_01 {

	public static void main(String[] args) {
		  int su1, su2;
	      int result; // 변수 선언
	      Scanner scanner = new Scanner(System.in);
	      su1 = scanner.nextInt(); // 변수 초기화
	      su2 = scanner.nextInt(); // 변수 초기화
	      result = su1 + su2;
	      System.out.println(su1 + "+" + su2 + "=" + result); //10+20=30출력
	      result = su1 - su2;
	      System.out.println(su1 + "-" + su2 + "=" + result);
	      result = su1 * su2;
	      System.out.println(su1 + "*" + su2 + "=" + result); //10+20=30출력
	      result = su1 / su2; // 정수/정수=정수
	      System.out.println(su1 + "/" + su2 + "=" + result);
	      result = su1 % su2; 
	      System.out.println(su1 + "%" + su2 + "=" + result);

	      scanner.close();
	}

}
