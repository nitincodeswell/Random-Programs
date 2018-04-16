package top20;

import java.util.HashMap;

public class countoccurrencecharString {
	
	public static String CharOccurInString(String str, char ch){
		
		char [] temp = str.replaceAll("//s","").toCharArray();
		HashMap<Character, Integer> hm=new HashMap<>();
		for (char k:temp) {
			if(hm.containsKey(k)){
				hm.put(k, hm.get(k)+1);
			}
			else{
				hm.put(k, 1);
			}
			
		}
		
		
		if (hm.containsKey(ch)) {
			System.out.println( ch +" :"+hm.get(ch));
			
		} else {
			System.out.println("not exists");

		}
		
		
		return"";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CharOccurInString("akshaykumar",'a'));
	}

}
