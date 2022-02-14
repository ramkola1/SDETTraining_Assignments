package JavaAssignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapKeysConversiontoList {

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
		
		List<Character> objList=new ArrayList<Character>();
		for(Map.Entry<Character,Integer> keys:map.entrySet()) {
			objList.add(keys.getKey());
		}
		System.out.println("HashMap Keys converted to a List:");
		System.out.println(objList);
	}

}
