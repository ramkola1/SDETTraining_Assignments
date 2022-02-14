package JavaAssignment1;

public class EvenNumbers {
	
	public void EvenNumbersUptoValues(int n) {
		System.out.println("Even Numbers until "+n+" numbers are:");
		for(int i=1;i<=n;i++)
		{
			if (i%2==0)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenNumbers obj=new EvenNumbers();
		obj.EvenNumbersUptoValues(50);
	}

}
