import java.io.FileWriter;
import java.io.IOException;

public class Ex1004_00 {

	public static void main(String[] args) {
		try {
			for(int i=1; i<=18; i++) {
				FileWriter fw = new FileWriter("C:\\Fileio\\"+i+"단.txt");
				for(int j=1; j<=18; j++) {
					fw.write(i+"x"+j+"="+i*j+"\n");			
				}
				fw.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
	}
		
		System.out.println("프로그램 종료...");

	}
}
