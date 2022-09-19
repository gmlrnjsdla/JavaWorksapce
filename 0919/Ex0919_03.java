// factorial(5) ==> 5*4*3*2*1 반환하는 함수
public class Ex0919_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
		
	}

//	private static int factorial(int fac) {
//		int mul=1;
//		for(int i =fac; i>=1; i--) {
//			mul = mul * i;
//			if(i!=1)
//				System.out.print(i+" x ");
//			else
//				System.out.print(i+" = ");
//		}
//		return mul;
//		
//	}
	private static int factorial(int fac) { //재귀함수
		if(fac==1)
			return 1;
		else
			return fac * factorial(fac-1);
	}

}
