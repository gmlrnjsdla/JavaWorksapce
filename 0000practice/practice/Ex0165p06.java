package practice;

import java.util.Scanner;

public class Ex0165p06 {

	public static void main(String[] args) {
		int money;
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >> ");
		money = sc.nextInt();
		
		for(int i=0; i<unit.length; i++) {
			int num = money/unit[i];
			money = money%unit[i];
			if(num != 0)
			System.out.println(unit[i]+"원 짜리 : "+num+"개");
		}
		
		sc.close();
	}

}
