public class Ex0919_06 {

	public static void main(String[] args) {
		System.out.println(SayHello(args[0]));
		System.out.println(SayHello(args[1]));
	}

	private static String SayHello(String name) {
		return name+ "씨, 어서 오세요";
		
	}

}
