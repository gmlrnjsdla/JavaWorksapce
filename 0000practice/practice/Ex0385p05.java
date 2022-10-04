package practice;

import java.util.Calendar;

public class Ex0385p05 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.println("현재 시간은 "+now.get(Calendar.HOUR)+"시 "
							+now.get(Calendar.MINUTE)+"분입니다.");
		if(now.get(Calendar.HOUR)>4 && now.get(Calendar.HOUR)<12 
				&& now.get(Calendar.AM_PM)==0)
			System.out.println("GOOD MORNING");
		else if(now.get(Calendar.HOUR)<18 && now.get(Calendar.AM_PM)==1)
			System.out.println("GOOD AFTERNOON");
		else if(now.get(Calendar.HOUR)<22 && now.get(Calendar.AM_PM)==1)
			System.out.println("GOOD EVENING");
		else
			System.out.println("GOOD NIGHT");
	}

}
