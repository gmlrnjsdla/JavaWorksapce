package practice;

import java.util.Scanner;

public class Ex0388p11 {

	public static void main(String[] args) {
		int index =0;
		String before, after;
		Scanner sc = new Scanner(System.in);
		System.out.println(">>우리는 love Java Programming.");
		StringBuffer sb = new StringBuffer("우리는 love Java Programming.");
		System.out.print("명령 >> ");
		before =sc.next();
		after = sc.next();
		for(int i=0; i<sb.length(); i++)
			if(sb.equals(before))
				index = i;
		sb.replace(0,before.length(),after);
		System.out.println(sb);
	}

}
