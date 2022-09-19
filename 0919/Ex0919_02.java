
public class Ex0919_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Hap(10));
		int sum = Hap(10);
		System.out.println(sum);
	}

	private static int Hap(int num) {
		// TODO Auto-generated method stub
		int i, sum = 0;
		for(i=1; i<=num; i++)
			sum = sum + i;
		return sum;
	}

}
