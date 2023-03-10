package p1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class K implements Serializable{
public static void main(String[] args) {
	try {
		//Serializable
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\filehandlingsystem//test1.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		K k1 = new K();
		objectOutputStream.writeObject(k1);
		objectOutputStream.close();
		fileOutputStream.close();
		
		
		//DeSerializable
		
		FileInputStream fileInputStream =new FileInputStream("C:\\filehandlingsystem//test1.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		K k = (K)objectInputStream.readObject();
		objectInputStream.close();
		
	} catch (Exception e) {
		System.out.println(e);
		
	}finally {
		System.out.println("Finally block");
		
	}
}
}
