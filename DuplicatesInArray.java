package JavaAssignment2;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {12, 32, 12, 45, 65, 93, 0, 23, 45, 6};
		System.out.println("Duplicates in given array are:");
		int cnt=0;
		for(int i=0;i<a.length;i++) {
			for (int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				cnt++;
			}
			if (cnt>0)
			{
				System.out.println(a[i]);
				cnt=0;
			}
	}
	}

}
