package JavaAssignment1;

public class FibonacciSeries {
	
	public void FibonacciSeriesUptoValues(int n)
	{
		int x=0;
		int y=1;
		int f;
		System.out.println("Fibonacci Series Upto "+n+" Values is: ");
		System.out.print(x);
		for(int i=2; i<=n;i++)
		{
			f=x+y;
			System.out.print("    "+f);
			y=x;
			x=f;
			
			
		}
	}	
	
	/*
	public void FibonacciSeriesUsingArray(int n)
	{
		int[] a = new a[10];		
		a[0]=0;
		a[1]=1;
		System.out.println("Fibonacci Series Upto "+n+" Values is: ");
		System.out.print(a[0]+"   "+a[1]);
		for(int i=2; i<n;i++)
			System.out.print("    "+(a[i-1]+a[i-2]));		
	}	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeries objFib = new FibonacciSeries();
		objFib.FibonacciSeriesUptoValues(10);
		//objFib.FibonacciSeriesUsingArray(10);
	}

}
