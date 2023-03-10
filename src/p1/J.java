package p1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class J  implements Cloneable{
public static void main(String[] args) throws CloneNotSupportedException {
	//By using new keyword
//	J j = new J();
//	System.out.println(j);//p1.J@cac736f
	//By using New Instance()
	try {
//		String  str= "p1.J";
//		Class c = Class.forName(str);
//		J j =(J)c.newInstance();
//		System.out.println(j);
//		
		String str="p1.J";
		Class c= Class.forName(str);
		J j1 = (J)c.newInstance();
		System.out.println(j1);
	} catch (Exception e) {
	System.out.println(e);
	}
	
	
	// By using Constructoe newInstance()
	Constructor<J>constructor;
	try {
		constructor = J.class.getConstructor();
		J j = constructor.newInstance();
		System.out.println(j);
	} catch (Exception e) {
		System.out.println(e);
		
	}
	//By using Clone Method
	J j2 = new J();
	try {
		J j3 =(J)j2.clone();
		System.out.println(j2);
		System.out.println(j3);
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
	private static final long serialVersionUID = 1L;
	private static String filepath;
	J(String a,String x){
	System.out.println(a+","+x);	
	}
	String  str="sample.txt";
	
	//public static void main(String[] args) {
		J b= new J("farooq","ABC");
		{
		try {
			//First we serialize a object
			
			FileOutputStream fileOutputStream= new FileOutputStream(filepath);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(b);
			objectOutputStream.flush();
			objectOutputStream.close();
			
			
			//Second Deserialize
			
			FileInputStream fileInputStream = new FileInputStream(filepath);
			ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
			B b1= (B)objectInputStream.readObject();
			objectInputStream.close();
		} catch (Exception e) {
		}
	}


}
}
