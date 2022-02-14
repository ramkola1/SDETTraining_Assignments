package JavaAssignment1;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);    
		System.out.print("Enter Year - ");  
		int n= sc.nextInt();  
		if (n%4 == 0)
			System.out.println("Year "+n+" is a Leap Year");
		else
			System.out.println("Year "+n+" is Not a Leap Year");
		sc.close();
	}

}
