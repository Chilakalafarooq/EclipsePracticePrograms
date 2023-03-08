package p1;

import java.util.Iterator;
import java.util.Scanner;

 public class H  {
//	String name;
//	H(String name){
//		this.name=name;	
//	}
//	@Override
//	public void run() {
//	
//		for (int i = 0; i < 1000; i++) {
//			System.out.println(this.name);
//			
//		}
//	}
// public static void main(String[] args) {
//	H h1= new H("Tom");
//	H h2= new H("Banana");
//	H h3= new H("King");
//	H h4= new H("City");
//	H h5= new H("Name");
//	h1.start();
//	h2.start();
//	h3.start();
//	h4.start();
//	h5.start();
	
		
//		String s1 = "xyz"; //new object created
//		String s2 = "xyz"; // String Constant pool
//		String s3 = "abc"; // no existing abc
//		String s4 = "abc"; // Because of String
//		System.out.println(s1==s2);
//		System.out.println(s3==s4);
//		System.out.println(s2.equals(s1));
//		System.out.println(s4.equals(s3));
		public static void main(String[] args) {
			
		String str="$***********%%%%%%%%%@@@@@????";
			
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a any letters or Symbols OR Brackets..." );
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
//		String str1=scan.next();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='$') {
				count1++;
			}
			else if(str.charAt(i)=='*') {
				count2++;
			}
			else if(str.charAt(i)=='%') {
				count3++;
			}
			else if(str.charAt(i)=='@') {
				count4++;
			}
			else if(str.charAt(i)=='?') {
				count5++;
			}
		}
//		if(count1==count2)
//			System.out.println("No Error");
//		else 
//			System.out.println("Error");
		System.out.println("$ letters...."+count1);
		System.out.println("* letters...."+count2);
		System.out.println("% letters...."+count3);
		System.out.println("@ letters...."+count4);
		System.out.println("? letters...."+count5);
		
		}}	



