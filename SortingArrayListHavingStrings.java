package JavaAssignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayListHavingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> obj=new ArrayList<String>();
	    obj.add("Sohan");
	    obj.add("Atul");
	    obj.add("Bholu");
	    obj.add("Priyanka");
	    obj.add("Ranjit");
	    obj.add("Armaan");
	    System.out.println("ArrayList with Strings:");
	    System.out.println(obj);
	    Collections.sort(obj);
	    System.out.println("Sorted ArrayList in Alphabetical Order:");
	    System.out.println(obj);
	}

}
