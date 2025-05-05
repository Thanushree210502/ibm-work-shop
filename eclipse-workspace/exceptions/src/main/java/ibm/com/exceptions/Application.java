package ibm.com.exceptions;

public class Application {

	public static void main( String[] args ){
		System.out.println("start");
		try {
			System.out.println(args[0]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Run the program 2 number");
		}catch(ArithmeticException ex) {
			System.out.println("you cannot divide by zero");
		}catch(NumberFormatException ex) {
			System.out.println("please provide valid number");
		}
		System.out.println("end");
		}
}