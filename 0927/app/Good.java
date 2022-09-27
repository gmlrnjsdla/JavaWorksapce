package app;

public class Good {

	public static void main(String[] args) {
		int num;
		String iNum = "999";
		String dNum ="999.9";
		num = Integer.parseInt(iNum);	//중요!
		double fnum = Double.parseDouble(dNum);	//중요!
		System.out.println(dNum+10);
		System.out.println(num * 10);
		System.out.println(fnum * 10);
	}

}
