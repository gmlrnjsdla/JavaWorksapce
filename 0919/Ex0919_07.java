// 주민번호 13자리
// 220919 - 311111?
// 234567892345
public class Ex0919_07 {
   public static void main(String[] args) {
      for(int i =0; i<100; i++) {
    	  Check();
      	  System.out.println("");
      }
   }

private static void Check() {
	int lastDay[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	int Jumin[] = new int[13];
    int Temp[]  = {2,3,4,5,6,7,8,9,2,3,4,5}, i, sum=0, year1=0;
    int year=0;         
    int day;
    
  
    // 7번째 자리수가 1,2일때 19** , 3,4일때 20**
    Jumin[6] = (int)(Math.random()*4)+1; // 성별   
    if(Jumin[6]== 1 || Jumin[6] == 2) {
    	year = (int)(Math.random()*99);
    	year1 = year + 1900;
    }
    else if(Jumin[6]== 3 || Jumin[6] == 4) {
    	year = (int)(Math.random()*22);
    	year1 = year + 2000;
    }
    
    
    
    int month = (int)(Math.random()*12)+1; //월
    //윤년 계산 , 일
    if(month == 2) {
    	if(year1%4==0 && year1%100!=0 || year1%400==0) //2월, 윤년일때
        	day = (int)(Math.random()*++lastDay[month-1])+1;
        else //2월, 윤년 아닐때
        	day = (int)(Math.random()*lastDay[month-1])+1;
    }
    else {//2월이 아닐때
    	 day = (int)(Math.random()*lastDay[month-1])+1;
    }
    
        
    Jumin[0] = year/10;
    Jumin[1] = year%10;   
    Jumin[2] = month/10;
    Jumin[3] = month%10;  
    Jumin[4] = day/10;
    Jumin[5] = day%10; 
    
    for(i=7;i<12;i++)  // 성별 이후~
       Jumin[i] = (int)(Math.random()*10);
    
    for(i=0; i<13; i++) {
    	System.out.print(Jumin[i]);
    	if(i==5)
    		System.out.print("-");
    }
    for(i=0 ; i < Temp.length ; i++)
       sum = sum + Jumin[i]*Temp[i];
    sum = (11 - sum % 11) % 10;
    System.out.println("\n체크디지트는 " + sum);      
    if(sum == Jumin[12])
       System.out.println("주민번호 일치");
    else
       System.out.println("주민번호 불일치");
	
     	
	}
}
