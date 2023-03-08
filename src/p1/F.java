package p1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class F {
public static void main(String[] args) throws IOException {
	
	File file = new File("C:\\file\\test2.txt");
	//boolean value = file.exists();
	//boolean value = file.delete();
//	boolean value = file.mkdir();
//	System.out.println(value);
//	try {
//		boolean value = file.createNewFile();
//		System.out.println(value);
//	} catch (Exception e) {
//		System.out.println(e);
//	}
	
//	long length =file.length();
//	System.out.println(length);
//	String [] str = file.list();
//	for (String string : str) {
//		System.out.println(string);
//		
//	}
//	System.out.println(str.length);
//	FileReader fr = new FileReader(file);
//	for (int i = 0; i < file.length(); i++) {
//		System.out.println((char)fr.read());
//	}
	
//	FileReader fr = new FileReader(f);
//	for (int i = 0; i<f.length(); i++) {
//	System.out.print((char)fr.read());
 try {
	 FileWriter fw = new FileWriter(file,true);
	 fw.write(1000);
	 fw.write("Farooq");
	 fw.write('a');
	
} catch (Exception e) {
	System.out.println(e);
}
}
}
