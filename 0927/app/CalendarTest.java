package app;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		String week[] = {"일요일", "월요일", "화요일","수요일", "목요일","금요일","토요일"};
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1);
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		System.out.println(now.get(Calendar.HOUR));
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));
		System.out.println(now.get(Calendar.AM_PM));
		System.out.println(week[now.get(Calendar.DAY_OF_WEEK)-1]);
		
	
		 
	}

}
