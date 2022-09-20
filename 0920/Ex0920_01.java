class Sample {
   public int a;
   private int b;
   int c;
   
   public void setB(int n) {
	   b = n;
   }
   
}

public class Ex0920_01 {
   public static void main(String[] args) {
      Sample aClass = new Sample();
      aClass.a = 10;
//      aClass.b = 10;	//private멤버는 변경 불가
      aClass.setB(10);
      aClass.c = 10;
   }
}