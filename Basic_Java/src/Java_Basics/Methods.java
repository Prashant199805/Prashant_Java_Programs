package Java_Basics;

public class Methods {
	
	void Method1() {
		System.out.println("This is method 1");
	}
	
	static void Method2() {
		System.out.println("This is method 2");
	}

	public static void main(String[] args) {
		Methods.Method2();
	
		Methods m = new Methods();
		m.Method1();
		// m.Method2();

	}

}
