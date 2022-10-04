package practice;

import java.util.Scanner;

public class Ex0386p08 {

	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 >> ");
		name = sc.nextLine();
		
		for(int i=0; i<name.length(); i++) {
			System.out.print(name.substring(i));
			System.out.println(name.substring(0, i));
			
		}
	}

}
