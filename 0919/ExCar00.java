class ExCar00 {
   int year;
   protected String company;
   public double money;
   private int speed;
   
   public ExCar00() { // 생성자(클래스 이름과 같은) 메소드
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

