package JavaAssignment4;
import java.util.*;


public class GetSetViewOfKeysFromHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,String> ht = new Hashtable<String,String>();
	
	    ht.put("1", "One");
	    ht.put("2", "Two");
	    ht.put("3", "Three");

	    Set st = ht.keySet();

	    Iterator itr = st.iterator();
	    System.out.println("Elelments in HashTable:");
	    while (itr.hasNext()){
	      System.out.println(itr.next());
	    }
	    st.remove("2");
	    System.out.println("Elelments in HashTable after removing one element:");
	    Enumeration e = ht.keys();
	    while (e.hasMoreElements()){
	      System.out.println(e.nextElement());      
	    }
	}

}
