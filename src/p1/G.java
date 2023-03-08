package p1;

public class G {
	static G h1;//null// static-variable 
	int x=10;//non static variable
	
public static void main(String[] args) {
	
	try {
		
		//NumberFormatException
//		String str="&%$#@";
//		int s=Integer.parseInt(str);
//		
//		System.out.println(s);
		//System.out.println("Welcome");
		//System.out.println(h1.x);//Null pointer exception
		System.out.println(100);
							try {
								int x[] = new  int[5];
								x[0]=10;
								x[0]=120;
								x[0]=102;
								x[0]=104;
								x[0]=50;
								x[0]=60;
								x[0]=80;
								System.out.println(x);
								
									//System.out.println(100/0);
							} catch (Exception e) {
								e.printStackTrace();
									System.out.println(e.toString());
									System.out.println("Child Catch");
							}
							finally {
								System.out.println("Child Finally block");
							}
	} catch (Exception e) {
		System.out.println(e.toString());
		e.printStackTrace();
	}
	finally {
		System.out.println("Parent finally block");
	}
}
}
