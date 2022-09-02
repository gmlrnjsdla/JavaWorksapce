
import java.util.Scanner;

public class ScannerEx2 {

   public static void main(String[] args) {
      
      System.out.println("이름과 나이, 몸무게를 입력하시오");
      
      Scanner scanner = new Scanner(System.in);
      System.out.print("이름: ");
      String name = scanner.next();
      
      System.out.print("나이: ");
      int age = scanner.nextInt();
      
      System.out.print("체중: ");
      double weight = scanner.nextDouble();
      
      System.out.println("이름은 " + name + "이고, 나이는 " 
                     + age + " 이고 체중은 " + weight + "입니다." );
      
      
      scanner.close();

   }
}
