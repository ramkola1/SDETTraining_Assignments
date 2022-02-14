package JavaAssignment2;

public class ReverseANumber {
	
	public void ReverseNumber(int n)
	{		
		int reverse=0;
		System.out.print("The reverse of the given number "+n+" is: ");
		while(n!=0)   
		{  
		int remainder = n % 10;  
		reverse = (reverse * 10) + remainder;  
		n = n/10;  
		}  
		System.out.print(reverse);  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseANumber obj= new ReverseANumber();
		obj.ReverseNumber(7442);
	}

}
