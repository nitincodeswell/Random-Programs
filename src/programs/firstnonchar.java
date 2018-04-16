package top20;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class firstnonchar {
	
	//How to program to print first non repeated character from String
	public static String FirstNonRepeated(String s){
		HashMap<Character, Integer> hashmap = new HashMap<Character,Integer>();
		char []c=s.replaceAll("\\s", "").toLowerCase().toCharArray();
		for(char ch: c){
			if (hashmap.containsKey(ch)) {
				hashmap.put(ch,hashmap.get(ch) +1);
			} else {
				hashmap.put(ch,1);
			}
		}
		
		System.out.println(hashmap);
		
//		Set<Map.Entry<Character, Integer>> se=hashmap.entrySet();
//		for (Map.Entry<Character, Integer> entry : se) {
//			if (entry.getValue()==1) {
//				System.out.println(entry.getKey());
//				break;
//			}
//		}
		
		for (char d : c) {
			if (hashmap.get(d)==1) {
				System.out.println(d);
				break;
			}
		}
		
		//System.out.println(hashmap);
		return " ";
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FirstNonRepeated("Akshayr kumar aksh"));

	}

}
