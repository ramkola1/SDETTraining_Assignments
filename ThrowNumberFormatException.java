package JavaAssignment3;
import java.util.*;

public class ThrowNumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number;
	        Scanner sc = new Scanner(System.in);
	
	        while (true) {
	            System.out.println("Enter any valid Integer: ");
	 
	            // Try block to check if any exception occurs
	            try {	 
	                number = Integer.parseInt(sc.next());
	                System.out.println("You entered: "+ number);
	                break;
	            }
	 
	            // Catch block to handle NumberFormatException
	            catch (NumberFormatException e) {
	                System.out.println("NumberFormatException occured");
	            }
	        }
	        sc.close();
	}

}
