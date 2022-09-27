package app;

public class string {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello world");
//		String str = new String("hello world");
//		str = str.toUpperCase();
		sb.replace(0,5,"ThankYou");
		System.out.println(sb);
		
	}

}
