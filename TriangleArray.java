package JavaAssignment1;

public class TriangleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a=new int[20][20];
		int i,j,rows;
		rows = a.length;
		int s=rows-1;
		for(i=0;i<rows;i++)
		{		
			for(j=0; j<i; j++) {			
					if(j==0 || j==i)
						a[i][j]=0;
					else
						a[i][j]=0;
				
			}
		}
			
		for(i=0;i<rows;i++)
		{		
			for(j=0;j<=s/2;j++)
	            System.out.print(" ");
	            
	            s--;
			for(j=0;j<i;j++)
				System.out.print(a[i][j]);
			System.out.println();
		}

}
}
