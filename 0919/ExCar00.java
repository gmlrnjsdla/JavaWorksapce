class Car {
   int year;
   protected String company;
   public double money;
   private int speed;
   
   public Car() { // 생성자(클래스 이름과 같은) 메소드
	   year=2022; company="kia"; money = 30000; speed=0;
   }
   public void speedUp() {
      speed = speed + 10;
   }
   public void speedDown() {
      speed = speed - 5;
   }
   public void PrintInfo() {
      System.out.println("생산연도: " + year + "년");
      System.out.println("제조사: " + company);
      System.out.println("가격: $" + money);
      System.out.println("현재 속력: " + speed + " km/h");
   }   

}

public class ExCar00{
	   public static void main(String[] args) {      
	      Car car = new Car();
	      car.PrintInfo();
	      car.year = 2023;   //default 직접 접근 가능
	      car.money = 35000; //public 직접 접근 가능
	      car.company = "Hyundai"; //protected 직접 접근 가능
//	      car.speed = 100;  // private  직접 접근 불가능
	      car.speedDown();   car.speedDown();   car.speedDown();
	      car.PrintInfo();
	   }
	}