package JavaAssignment4;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharsOccurencesHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mac="DevLabs Alliance Training";
		char chr;
		Map<Character,Integer> map=new HashMap();
		for(int i=0;i<mac.length();i++)
		{
			
			chr  = mac.charAt(i);
			if(map.containsKey(chr))
				map.put(chr, map.get(chr)+1);
			else
				map.put(chr, 1);
		}
		System.out.println("Given String '"+mac+"' has below character occurences:");
		System.out.println(map);
		System.out.println("Duplicate characters in given String '"+mac+"' are:");
		for (Map.Entry<Character,Integer> ele: map.entrySet()) {
			if(ele.getValue()>1)
				System.out.println(ele.getKey()+"="+ele.getValue());
		}
	}

}
