package JavaAssignment1;

public class NaturalNumbersSum {
	
	public void SumOfNaturalNumbers(int n)
	{
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of first "+n+" Natural numbers is: "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NaturalNumbersSum obj = new NaturalNumbersSum();
		obj.SumOfNaturalNumbers(20);
	}

}
