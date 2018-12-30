 package Hw2;

public class hw6 {
	
	
      private void add() {
    	  int a = 5;
    	  int b = 10;
    	  int c = a+b;
    	  System.out.println(c);
      }
      public void sub() {
    	  int a = 10; 
    	  int b = 15;
    	  int c = a-b;
    	  System.out.println(c);
      }
      
      protected void mul() {
    	  int a = 15;
    	  int b = 20;
    	  int c = a*b;
    	  System.out.println(c);
      }
      
       void div() {
    	  int a = 20;
    	  int b = 25;
    	  int c = a%b;
    	  System.out.println(c);
      }
	public static void main(String[] args) {
		
		
hw6 x = new hw6();
x.add();
x.sub();
x.mul();
x.div();
	}

}
