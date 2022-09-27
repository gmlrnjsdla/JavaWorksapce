package practice;

import java.util.Scanner;

public class Ex0168p14 {

	public static void main(String[] args) {
		int index=0, i;
		String user;
		String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score [] = {95, 88, 76, 62, 55};
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.print("과목이름 >> ");
			user = sc.next();
			
			if(user.equals("그만"))
				break;
			
			for(i=0; i<course.length; i++) {
				if(course[i].equals(user)) {
					index = i;
					break;
				}				
			}
			
			if(i==course.length)
				System.out.println("없는 과목입니다.");
			else
				System.out.println(course[index]+"의 점수는 "+score[index]);
		}
		
		
		
		
		
		
		
	}

}
