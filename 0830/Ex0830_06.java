import java.util.Scanner;
public class Ex0830_06 {

	public static void main(String[] args) {
		//비교연산자(관계연산자) >, <, >=, <=, ==, != true/false
//		System.out.println(10 > 3);
//		System.out.println(10 < 3);
//		System.out.println(10 >= 3);
//		System.out.println(10 <= 3);
//		System.out.println(10 == 3);
//		System.out.println(10 != 3);
		
		//논리연산자 : &&(and), ||(or), !(not)
//		System.out.println(10 > 3 && 10 > 3);
//		System.out.println(10 > 3 && 10 < 3);
//		System.out.println(10 < 3 && 10 > 3);
//		System.out.println(10 < 3 && 10 < 3);
		
//		System.out.println(10 > 3 || 10 > 3);
//		System.out.println(10 > 3 || 10 < 3);
//		System.out.println(10 < 3 || 10 > 3);
//		System.out.println(10 < 3 || 10 < 3);
		
//		System.out.println(!(10 > 3));
//		System.out.println(!(10 < 3));
		
		//a ? b : c ==> if~else
		Scanner sc = new Scanner(System.in);
		System.out.println("세 숫자를 입력하세요. : ");
		int max;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		max = a > b ? a : b;
		max = max > c ? max : c;
		System.out.println("최대값은 " + max + "입니다.");
		
		sc.close();
	
	}

}
