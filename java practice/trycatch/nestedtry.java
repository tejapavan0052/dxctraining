package trycatch;

public class nestedtry {
	

		public static void main(String[] args) {

		try{
		int[] x={12,0,5};
		try{
		System.out.println("line 3 ---"+(10/2));
		}
		catch (NullPointerException e) {
		System.out.println("huh ? trying to div the num by zero ? which school bro ?");
		System.out.println(e);
		}
		System.out.println(x[0]);
		System.out.println("try ends");
		}
		catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		}
		catch (ArithmeticException e) {
		System.out.println("outer "+e);
		}


		System.out.println("Line 1");
		System.out.println("Line 2");
		}
		}
		 

		// exception Handling
		// try catch finally throw throws




