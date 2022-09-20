class Super{
	Super(){
		System.out.println("Super constructor");
	}
	Super(int n){
		System.out.println("Super constructor(n)");
	}
}
class Sub extends Super{
	Sub(){
		System.out.println("Sub constructor!!");
	}
	Sub(int n){
		super(n);
		System.out.println("Sub constructor!!(n)");
	}
}

public class Ex0920_05 {

	public static void main(String[] args) {
		Sub sub = new Sub(10);

	}

}
