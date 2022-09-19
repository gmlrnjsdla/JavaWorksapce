import java.util.Scanner;

public class Ex0919_00 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      Scanner scanner = new Scanner(System.in);
   
       System.out.print("연도 입력:");
       int year = scanner.nextInt();
       ShowAnimal(year);
    
   }


   private static void ShowAnimal(int year) {
      String Animal[] = {"원숭이","닭","개","돼지","쥐","소",
               "호랑이","토끼","용","뱀","말","양"};
      System.out.println(year +"년도는 " + Animal[year%12]);
   }
}   