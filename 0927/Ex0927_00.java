import java.util.Scanner;

class Dictionary {
   private static String [] kor = {"사랑", "아기","돈", "미래","희망"};
   private static String [] eng = {"love", "baby","money", "future","hope"};
   public static String kor2Eng(String word) {
      int index = 0, i;
      for(i=0; i<kor.length; i++)
         if(word.equals(kor[i])) {
            index = i;
            break;
         }
      if(i == kor.length)
         return "저의 사전에 없습니다.";
      else
         return eng[index];
   }
}
public class Ex0927_00 {
   public static void main(String[] args) {      
      Scanner scanner = new Scanner(System.in);
      System.out.println("한영 단어 검색 프로그램입니다.");
      while(true) {
         System.out.print("한글 단어?");
         String word = scanner.next();
         if(word.equals("그만")) 
            break;
         else
            System.out.println(Dictionary.kor2Eng(word));
      }
   }
}
