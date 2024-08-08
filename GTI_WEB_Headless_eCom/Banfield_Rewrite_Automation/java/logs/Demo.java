package logs;

class deno2{
	float r =4.5f;
	static char  ch ='q';
	static void test() {
		System.out.println("test method...");
	}
	
	void end() {
		System.out.println("end method...");
	}
}

public class Demo {
	static void start() {
		System.out.println("Start method....");
	}
	byte r = 45;

	public static void main(String[] args) {
	System.out.println("r ="+  new Demo().r);
	start();
	System.out.println("ch ="+deno2.ch);
	deno2.test();
	deno2 d = new deno2();
	d.end();
	System.out.println("r ="+d.r);
	}

}
