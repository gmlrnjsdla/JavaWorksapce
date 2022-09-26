import java.util.Scanner;

public class Ex00 {

	public static void main(String[] args) {
		String course [] = {"JAVA", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score [] = {95, 88, 76, 62, 55};
		int i=0;
		Scanner sc = new Scanner(System.in);
		String name;
		
		
		while(true) {
			System.out.print("과목 이름>>");
			name = sc.next();
			
			if(name.equals("그만")){
				break;
			}
			for(i=0; i<course.length; i++) {
				if(course[i].equals(name)) {					
					break;
				}		
			}
			
			try {
			System.out.println(name+"의 점수는 "+score[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("없는 과목입니다.");
			}
		}
	}

}
