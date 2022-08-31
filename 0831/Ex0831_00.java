import java.util.Scanner;

public class Ex0831_00 {

	public static void main(String[] args) {
		//나이를 입력받아 출력
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		if(age > 19)
			System.out.println("OK");
		else
			System.out.println("NO");
		
		sc.close();
	}

}
