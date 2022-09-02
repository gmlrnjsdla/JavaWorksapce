import java.util.Scanner;

public class Ex {
   
   public static double area(double i, double j) {
      return i * j;
   }
    
   public static void main(String[] args) {
      double result;
      
      System.out.println("사각형의 가로, 세로의 길이를 입력하세요.");
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("가로 : ");
      double width = scanner.nextDouble();
      
      System.out.print("세로 : ");
      double height = scanner.nextDouble();
      
      System.out.println("가로는 " + width + "cm,세로는 " 
                           + height + "cm 입니다.");
      
      result = area(width,height);
      System.out.println("넓이는 " + result + "입니다.");
      
      scanner.close();
   }
}