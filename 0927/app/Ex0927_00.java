package app;


public class Ex0927_00 {

	public static void main(String[] args) {
		String strNum = new String("987");
		
		System.out.println(Str2Int(strNum)*100);
	}

	private static int Str2Int(String strNum) {
		// TODO Auto-generated method stub
		int length = strNum.length(), sum =0 , weight = 1;
		for(int i = length-1; i>=0; i--) {
//			System.out.println(strNum.charAt(i));
//			sum = sum + strNum.charAt(i);
			sum = sum + (strNum.charAt(i)-'0')*weight;
			weight = weight * 10;
		}
		return sum;
	}

}
