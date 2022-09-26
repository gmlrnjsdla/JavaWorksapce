import java.util.Scanner;

class Phone{
	String name;
	String tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName(){
		return name;
	}
	
	public void show() {
		System.out.println(name+"의 번호는 "+tel+" 입니다.");
	}
}
public class Phonebook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수>>");
		int i,num = sc.nextInt();
		Phone a [] = new Phone[num];
		
		for(i =0; i<a.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = sc.next();
			String tel = sc.next();
			a[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
		
		while (true) {			
			
			System.out.println("검색할 이름>>");
			String search = sc.next();
			
			if(search.equals("그만"))
					break;
			for(i=0; i<a.length; i++) {
				if(a[i].getName().equals(search)){
					a[i].show();	
					break;
				}						
			}
			if(i==a.length)
		            System.out.println(search + " 이 없습니다");			
		}
	}

}
