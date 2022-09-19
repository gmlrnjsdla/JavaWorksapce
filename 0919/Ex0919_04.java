
public class Ex0919_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("최대값은"+Maximum(10,50));
		System.out.println("최소값은"+Minimum(10,50));
	}

	private static int Minimum(int su1, int su2) {
		// TODO Auto-generated method stub
		if(su1>su2)
			return su2;
		else
			return su1;	
	}

	private static int Maximum(int su1, int su2) {
		// TODO Auto-generated method stub
		if(su1>su2)
			return su1;
		else
			return su2;	
	}

}
