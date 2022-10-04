package practice;

import java.util.Calendar;
import java.util.Scanner;
class TenSeconds{
   private String name;
   private int seconds;
   public TenSeconds(String name) {
      this.name = name;
   }
   public String getName() {
      return name;
   }
   public int getSeconds() {
      return seconds; // 경과된 시간(초) 
   }
   public void GuessTime() {
      Scanner scanner = new Scanner(System.in);            
      System.out.print(name +" 시작 <Enter> 키>> ");
      scanner.nextLine();
      Calendar now = Calendar.getInstance();
      int startSeconds = now.get(Calendar.SECOND);
      System.out.println("현재 초 시간 = " + startSeconds);
      
      System.out.print("10초 예상 후 <Enter> 키>> ");
      scanner.nextLine();
      now = Calendar.getInstance();
      int endSeconds = now.get(Calendar.SECOND);
      System.out.println("현재 초 시간 = " + endSeconds);
      if(startSeconds > endSeconds)
         endSeconds = endSeconds + 60;
      this.seconds = (endSeconds-startSeconds);
   }
}
public class Ex0385p06 {
   public static void main(String[] args) {
      TenSeconds tenSeconds[] = new TenSeconds[5];
      String strNames[]= {"홍길동","김길동","황길동","이길동","최길동"};
      for(int i=0;i<strNames.length;i++) {
         tenSeconds[i] = new TenSeconds(strNames[i]);
         tenSeconds[i].GuessTime();
         System.out.println("경과된 시간: " + tenSeconds[i].getSeconds());
      }
      int minIdx = 0;
      for(int i=0;i<strNames.length;i++) 
         if(10-tenSeconds[i].getSeconds() < 10-tenSeconds[minIdx].getSeconds())
            minIdx = i;
      for(int i=0;i<strNames.length;i++) 
         System.out.println(tenSeconds[i].getName() + ":" + tenSeconds[i].getSeconds());
      System.out.println("승자는 " + tenSeconds[minIdx].getName());
   }
}
