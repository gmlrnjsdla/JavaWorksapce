import java.util.Scanner;

// 정수 2이상 를 입력받아 소수인지 아닌지 판별하는 프로그램작성하시오.
//소수: 1과 자기자신으로만 나누어 떨어지는 수 (%==)
//2 3 5 7 11
public class Ex0919_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,N;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수(N) 입력: ");
		N = sc.nextInt();
		for(num =2; num<=N;num++) 
			if(isPrime(num))
				System.out.print(num + " ");
							
		sc.close();
		}
	

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		boolean bPrime = true;
		 //true 소수 false 소수아님
		for(int i=2 ; i< num; i++) {
			if( num % i ==0) {
				bPrime = false;	
				break;
			}
		}
		return bPrime;
			
	}
}
