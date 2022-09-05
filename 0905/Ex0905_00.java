import java.util.Scanner;

public class Ex0905_00 {

	public static void main(String[] args) {
//		int i=1;
//		while(i<=10) {
//			System.out.println(i);
//			i=i+1;
//			}
		
//=====================================================//

//		int i=1;
//		do {
//			System.out.println(i);
//			i=i+1;
//		}
//		while(i<=10);

//======================================================//
//		for(int i=1; i<=10 ; i++) 
//			System.out.println(i);
//		int i, num, max = -1;
//		
//=======================================================///
		
//		Scanner sc = new Scanner(System.in);	
//		for(i=1; i<=5; i++) {
//			System.out.print("점수 입력: ");
//			num =sc.nextInt();
//			max = max>num?max:num;
//		}
//		System.out.println("최대값은 "+max);
//		
//		sc.close();
		
//=========================================================//
		
//		int i =1, num, max = -1;
//		
//		Scanner sc = new Scanner(System.in);	
//		while( i<=5) {
//			System.out.print("점수 입력: ");
//			num =sc.nextInt();
//			max = max>num?max:num;
//			i++;
//		}
//		System.out.println("최대값은 "+max);
//		
//		sc.close();
//	
//==================================================================//
		
		int i =1, num, max = -1;
		
		Scanner sc = new Scanner(System.in);	
		do {
			System.out.print("점수 입력: ");
			num =sc.nextInt();
			max = max>num?max:num;
			i++;
		}while(i<=5);
		System.out.println("최대값은 "+max);
		
		sc.close();
	}	
}
