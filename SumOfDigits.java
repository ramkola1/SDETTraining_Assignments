package JavaAssignment2;

public class SumOfDigits {

	public void DigitsSum(int n) {
		int sum=0;
		System.out.print("The sum of the given digits "+n+" is: ");
		while(n!=0)   
		{  
		int remainder = n % 10;  
		sum = sum + remainder;  
		n = n/10;  
		}  
		System.out.print(sum);  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigits obj = new SumOfDigits();
		obj.DigitsSum(7442);
	}

}
