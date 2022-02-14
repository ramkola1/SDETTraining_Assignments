package JavaAssignment1;

public class PrimeNumbers {

	public void primeNumbersRange()
	{
		
		int i;
		int x=0;
		System.out.println("First 10 PrimeNumbers are:");
	    for (int j=1;j<=100;j++) {   
	    	int cnt = 0 ;
			for (i=1;i<=j;i++) {
		    	if (j%i==0) {
		    		cnt=cnt+1;
		    	}
		    }
			
			if (cnt==2) {
				System.out.println(j);
				x=x+1;
				if (x==10) {
					break;
				}	
			}
		
	    } 
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumbers obj = new PrimeNumbers();
		obj.primeNumbersRange();
	}

}
