package Java_Assignments;

public class Static_Method {

	static void add() {
		int a = 10;
		int b = 12;
		int c = a + b;

		System.out.println(c);

	}

	static void sub() {
		int a = 30;
		int b = 12;
		int d = a - b;

		System.out.println(d);
	}

	static void mul() {
		int a = 30;
		int b = 12;
		int d = a * b;

		System.out.println(d);

	}

	static void div() {
		int a = 30;
		int b = 12;
		int d = a / b;

		System.out.println(d);
	}

	static void mod() {
		int a = 30;
		int b = 12;
		int d = a % b;

		System.out.println(d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Method sm = new Static_Method();
		sm.add();
		sm.sub();
		sm.mul();
		sm.div();
		sm.mod();

	}

}
