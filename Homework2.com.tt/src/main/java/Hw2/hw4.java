package Hw2;

public class hw4{
	int fun1(int a, int b) {
		int add = a+b;
		return add;
	
	}
	int fun2(int a, int b) {
		int sub = a-b;
		return sub;
		
	}
    
	public static void main(String[] args) {
	
	hw4 x = new hw4();//creating object
	 int o;
	 o=x.fun1(10,5);
	 System.out.println(o);
	 

		hw4 y = new hw4();//creating object
		 int c;
		 c=y.fun2(5,10);
		 System.out.println(c);
		 
		 
		 if (o>c) {
			 System.out.println("o is greater than c");
			 
		 }
		 else { System.out.println("c is greter than o");
		 
		 }
	}

}//end of class
