package JavaAssignment2;

public class PrimeNumberOrNot {
	
	public void PrimeOrNot(int a) {
		int cnt=0;
		for(int i=1; i<=a;i++) {
			if (a%i==0)
				cnt++;	
		}
		if (cnt==2)
				System.out.println("Given Number "+a+" is a Prime Number" );
		else
			System.out.println("Given Number "+a+" is Not a Prime Number" );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumberOrNot obj=new PrimeNumberOrNot();
		obj.PrimeOrNot(15);
	}

}
