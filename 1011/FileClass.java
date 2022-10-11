import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) throws IOException {
		File src = new File("c:/Fileio/연예인.jpg");
		File dest = new File("c:/Fileio/그림.jpg");
		
		int c;
		FileInputStream fi = new FileInputStream(src);
		FileOutputStream fo = new FileOutputStream(dest);
		
		while((c=fi.read())!=-1) {
			fo.write((byte)c);
		}
		
		fi.close();
		fo.close();
	}

}
