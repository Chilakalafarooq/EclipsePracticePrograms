package p1;

import java.util.StringTokenizer;

public class A implements Cloneable {
public static void main(String[] args) {
	
//	StringTokenizer str = new StringTokenizer("Welcome hello");
//	int count =0;
//	while (str.hasMoreElements()) {
//		System.out.println(str.nextToken());
//		count++;
//	}
//	System.out.println(count);
	
	A a= new A();
	
	try {
		
		A a1= (A)a.clone();
		System.out.println(a);
		System.out.println(a1);
		
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
	
}

}
