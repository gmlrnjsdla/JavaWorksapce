import java.io.FileWriter;
import java.io.IOException;

public class JuminFileWrite {
	public static void main(String[] args) throws IOException {
	   FileWriter fw = new FileWriter("C:\\Fileio\\주민.txt");
	   for(int i =0; i<10; i++) {
    	  Check(fw);	  
	   }
	   fw.close();
}

	private static void Check(FileWriter fw) throws IOException {
		int lastDay[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int Jumin[] = new int[13];
	    int i, year1=0;
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
	    	fw.write(Integer.toString(Jumin[i]));
	    	if(i==5)
	    		fw.write("-");
	    }
	    fw.write("\n");
	    
   }

}