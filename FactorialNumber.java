package JavaAssignment1;

public class FactorialNumber {
	
	public void FactorialOfNumber(int a)
	{
		int f=1;
		int i=1;
		while(i<=a)
		{
			f=i*f;
			i++;
		}
		System.out.println("Factorial of the Number "+a+" is: "+f);
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialNumber objFac = new FactorialNumber();
		objFac.FactorialOfNumber(6);
	}

}
