package Hw2;

public class hw7extArithmetic {
	void mul() {
		int a = 10;
		int b = 15;
		int c = a*b;
		System.out.println(c);
	}
	void sub() {
		int a = 2;
		int b = 10;
		int c = a%b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		hw7extArithmetic x = new hw7extArithmetic();
			x.mul();
			x.sub();

			hw7basicarithmetic y = new hw7basicarithmetic();
			y.add();
			y.sub();
				
		

	}

}
