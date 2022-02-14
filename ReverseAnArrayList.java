package JavaAssignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseAnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> obj=new ArrayList<Integer>();
	    obj.add(35);
	    obj.add(3);
	    obj.add(5);
	    obj.add(2);
	    obj.add(7);
	    obj.add(29);
	    obj.add(77);
	    obj.add(45);
	    System.out.println("Original Arraylist has Elements:");
System.out.println(obj);

System.out.println("Reverse Arraylist has Elements:");
Collections.reverse(obj);
System.out.println(obj);
/*List<Integer> obj2=new ArrayList<Integer>();

for(int i=(obj.size()-1);i>=0;i--)
{
	obj2.add(obj.get(i));
	
}
System.out.println(obj2);*/

	}

}
