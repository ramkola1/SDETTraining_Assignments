package JavaAssignment2;

public class OddNumbers {
	
	public void RangeOfOddNumbers(int a, int b)
	{
		System.out.println("Odd Numbers from "+a+" to "+b+" are: " );
		for(int i=a;i<=b;i++) {
			if (i%2==1)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddNumbers obj = new OddNumbers();
		obj.RangeOfOddNumbers(79, 187);
	}

}
