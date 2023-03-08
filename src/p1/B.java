package p1;

public class B implements Runnable {

long y;//non static variable
	
B( long y){//Parameterized constructor
	this.y=y;
}

@Override
public void run() {//user define thread
	for(long i=0;i<1000;i++) {
		System.out.println(this.y);
	}	
	}
public static void main(String ...x) {//Main thread
	B b1 = new B(80);
	Thread t1 = new Thread(b1);//Second thread
	t1.start();
	
	B b2 = new B(60);
	Thread t2 = new Thread(b2);
	t2.start();
	for (int i = 0; i < 1000; i++) {
		System.out.println("Main");
		
	}
}
}

