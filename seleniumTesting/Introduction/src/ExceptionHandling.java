import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			int a=1/0;
			FileInputStream fi = new FileInputStream("/users/pa/dump.txt");
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("hello");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("hellooooo");
		}
		
		
		
		

	}

}
