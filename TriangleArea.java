package JavaAssignment1;

import java.util.Scanner;

public class TriangleArea {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);    
		System.out.print("Enter Base - ");  
		int b= sc.nextInt(); 
		System.out.print("Enter Height - ");  
		int h= sc.nextInt(); 
		System.out.println("Area of a Triangle with Base "+b+" and Height "+h+" is: "+(0.5*b*h));
		sc.close();
	}

}
