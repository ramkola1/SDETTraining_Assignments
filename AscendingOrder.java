package JavaAssignment1;

public class AscendingOrder {

	public void SortElementsInAscendingOrder()
	{
		int arr[] = {10,12,3,2,5};
		int temp;
		 //Displaying elements of original array    
        System.out.println("Original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
      
        System.out.println("Ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AscendingOrder obj = new AscendingOrder();
		obj.SortElementsInAscendingOrder();
	}

}
