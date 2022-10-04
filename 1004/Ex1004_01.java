import java.io.FileReader;
import java.io.IOException;

public class Ex1004_01 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("c:\\Fileio\\employees.csv");
		int c;
		while((c=fr.read()) != -1)
			System.out.print((char)c);  // 한 문자씩 읽어오기
//		char str[] = new char[10];
//		while(fr.read(str) != -1) {
//			System.out.println(str);
//		}
		fr.close();
		System.out.println("프로그램 종료...");
	}

}
