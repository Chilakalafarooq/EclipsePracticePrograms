package p1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P {
public static void main(String[] args) throws IOException {
	File f= new File("C:\\filehandlingsystem//test1.txt");
//	try {
//		boolean value = f.createNewFile();
//		System.out.println(value);
//	} catch (Exception e) {
//		System.out.println(e);
//	}
//	
//	boolean val= f.exists();
//	System.out.println(val);
//	boolean delete = f.delete();
//	System.out.println(delete);
	
//	boolean folder = f.mkdir();
//	System.out.println(folder);
//	long length = f.length();
//	System.out.println(length);
//	
//	FileReader fr = new FileReader(f);
//	for (int i = 0; i < f.length(); i++) {
//		System.out.print((char)fr.read());
		try {
			FileWriter fw = new FileWriter(f,true);
			BufferedWriter br = new BufferedWriter(fw);
					
//			char [] ch = {'a','p','z'};
//			fw.write(ch);
		
			fw.write(800);
			fw.write("Chilakala farooq\n");
			fw.write("90");
			fw.close();
			} catch (Exception e) {
			e.printStackTrace();
			}

	
}
}
