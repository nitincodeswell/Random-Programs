package top20;

import java.util.Arrays;

//How to check if two Strings are anagrams of each other? (solution)

public class anagram {
	
	public static Boolean CheckAnagram(String str1, String str2){
		
		str1=str1.replaceAll("\\s","").toLowerCase();
		str2=str2.replaceAll("\\s","").toLowerCase();
		char ch1[]= str1.toCharArray();
		char ch2[]= str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		//aaac
		//aaac	
		for (int i = 0; i < ch1.length-1; i++) {
				if(ch1[i]==ch2[i]){			
			}
				else{
					return false;
				}
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(CheckAnagram("Akshay k umar", "Kum ar Akshay  "));
	}

}
