package JavaAssignment1;

import java.util.*;

public class ReverseElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter No.Of Elements - ");  
		int n= sc.nextInt(); 
		int[] a=new int[n];
		int[] b=new int[n];
		int i;
		System.out.print("Enter Elements - "); 
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		 System.out.println("Original array: ");    
	        for (i = 0; i < a.length; i++) {     
	            System.out.print(a[i] + " ");    
	        }   
	        int j=0;
	        System.out.println();
	        System.out.println("Reversed array: ");  
	        for (i = a.length-1; i>=0; i--) {     
	           b[j]=a[i];    
	           j++;
	        } 
	        
	        for (i = 0; i < b.length; i++) {     
	            System.out.print(b[i] + " ");    
	        }   
		
		sc.close();
	}

}
