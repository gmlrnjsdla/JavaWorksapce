class Maths{
	public static int Max(int a, int b) {
		if(a>b)
			return a;
		else
			return b;
	}
}
public class Ex0920_02 {

	public static void main(String[] args) {
		int max = Maths.Max(10, 20);		//Math.random() 
		System.out.println("최댓값은 : "+max);

//		Maths max = new Maths();
//		System.out.println("최댓값은 : "+Maths.Max(10, 20));  //static 사용 안할  경우.
	}

}
