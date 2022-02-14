package JavaAssignment4;

import java.util.HashMap;
import java.util.Map;

public class KeyExistsInHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,Integer> map=new HashMap();
		map.put('A', 65);
		map.put('B', 66);
		map.put('C', 67);
		map.put('D', 68);
		map.put('E', 69);
		System.out.println("Hasmap has elements:");
		System.out.println(map);
		char ch='C';
		//Search whether C key exists or not
		if (map.containsKey(ch)) 
			System.out.println(ch+" Key Exists");
		else
			System.out.println(ch+" Key NOT Exists");
	}

}
