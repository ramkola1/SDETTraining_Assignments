package JavaAssignment2;

public class AverageOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		float sum =0;
		for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
		
	}
		System.out.println("Average of given numbers is: "+(sum/a.length));
	}
}
