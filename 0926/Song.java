public class Song {
   String title;
   String artist;
   int year;
   String country;
  
   public Song() {
      this.title = "무제";
      this.artist = "무명";
      this.year = 9999;
      this.country = "";
   }
   
   public Song(String title, String artist, int year, String country) {
      this.title = title;
      this.artist = artist;
      this.year = year;
      this.country = country;
   }
   
   public void show() {
      String temp = year + "년 " + country + "국적의 ";
      temp = temp + artist + "가 부른 " + title;
      System.out.println(temp);
   }

   public static void main(String[] args) {
      Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
      song.show();
   }

}