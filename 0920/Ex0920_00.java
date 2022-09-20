import java.util.Scanner;

// BMI 계산 후 판별(몸무게, 키) 몸무게/키의 제곱
public class Ex0920_00 {

	public static void main(String[] args) {
		double cm, kg;
		Scanner sc = new Scanner(System.in);
		System.out.print("키 입력(cm): ");
		cm = sc.nextDouble();
		System.out.print("몸무게 입력(kg): ");
		kg = sc.nextDouble();
		
		BmiCheck(cm,kg);
		
		sc.close();
		
		
	}

	private static void BmiCheck(double cm, double kg) {
		
		double bmi;
		
		bmi = kg/((cm/100)*(cm/100));
		System.out.println("BMI : "+bmi);
		
		if(bmi>30)
			System.out.println("비만입니다.");
		else if(bmi>=25)
			System.out.println("과체중입니다.");
		else if(bmi>=20)
			System.out.println("정상입니다.");
		else
			System.out.println("저체중입니다.");
	}
	
}
