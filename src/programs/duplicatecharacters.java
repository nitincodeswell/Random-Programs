package top20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;




// Print duplicate characters from String

public class duplicatecharacters {
	
	public static String DupChars(String str ){
		char[] ch=str.toCharArray();
		HashMap<Character, Integer> map =new HashMap<Character, Integer>();
		
		for (char c : ch) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
				
			} else {
				
				map.put(c, map.get(c)+1); 
			}
		}	
		
		
		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		
		for (Map.Entry<Character, Integer> entry : entrySet) 
			{ if (entry.getValue() > 1) { 
			System.out.printf("%s : %d %n", entry.getKey(), entry.getValue()); 
			} 
		}

		return " ";
	}

	public static void main(String[] args) {
		
		System.out.println(DupChars("ppakshay kkuumamrr"));
	}

}
