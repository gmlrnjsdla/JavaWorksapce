package app;

import java.util.Random;

public class math {

	public static void main(String[] args) {
		System.out.println(Math.cos(30*Math.PI/180));
		System.out.println(Math.cos(60*Math.PI/180));
		Random random = new Random();
		System.out.println(random.nextInt(45)+1);
	}

}
