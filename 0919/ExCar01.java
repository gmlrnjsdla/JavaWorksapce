public class ExCar01{
	   public static void main(String[] args) {      
	      ExCar00 car = new ExCar00();
	      car.PrintInfo();
	      car.year = 2023;   //default 직접 접근 가능
	      car.money = 35000; //public 직접 접근 가능
	      car.company = "Hyundai"; //protected 직접 접근 가능
	      //car.speed = 100;  // private  직접 접근 불가능
	      car.speedDown();   car.speedDown();   car.speedDown();
	      car.PrintInfo();
	   }
	}