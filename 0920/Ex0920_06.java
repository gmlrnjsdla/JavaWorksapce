class Super1{
	int id;
}
class Sub1 extends Super1{
	String name;
}
public class Ex0920_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Sub1 sub1 = new Sub1();
//		sub1.name = "hello";
//		sub1.id = 10;
//		Super1 super1;
//		super1 = sub1;	// upcasting 부모 멤버만 접근 가능
//		super1.id = 20;
		
		Super1 super1 = new Sub1();	//Upcasting
		Sub1 sub;
		sub = (Sub1)super1; //Downcasting
		sub.id=10;
		sub.name = "hellp";
	}

}
