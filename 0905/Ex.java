import java.util.Scanner;

public class Ex {
	
	public static void main(String[] args) {
		//가위바위보 게임
		
		int com,human,win=0,lose=0,draw=0,num;
		Scanner sc = new Scanner(System.in);
		System.out.print("판 수 입력 >> ");
		num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			System.out.print("1: 가위 2: 바위 3: 보 >> ");
			human = sc.nextInt();
			com = (int)(Math.random()*3)+1;
			switch(com) {
			case 1:
				System.out.println("computer >> 가위");
				break;
			case 2:
				System.out.println("computer >> 바위");
				break;
			default:
				System.out.println("computer >> 보");	
			}
			
			if(com==human) {
				System.out.println("비겼습니다.");
				draw = draw +1;
			}
			else if ((com ==1 && human ==2)||(com ==2 && human ==3)||(com ==3 && human ==1)) {
				System.out.println("이겼습니다.");
				win = win+1;
			}
			else {
				System.out.println("졌습니다.");
				lose = lose+1;
			}
		}
		System.out.println(num+"전 "+win+"승 "+lose+"패 "+draw+"무");
		sc.close();
		
	}

}
