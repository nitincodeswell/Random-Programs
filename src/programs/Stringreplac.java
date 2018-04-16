package top20;

import java.io.BufferedReader;

public class Stringreplac {
	public static String rep(String str,String from,String to){
		
		//str=str.replaceAll(s1, s2);
		
		
		 String[] arr = str.split(from);
	        StringBuilder output = new StringBuilder();

	        int i = 0;
	        for (int j = 0; j < arr.length-1; j++) {
				System.out.println(arr[i]);
				
			}
	        for (; i < arr.length - 1; i++)
	        	output.append(arr[i]).append(to);

	        	output.append(arr[i]);
	        if (str.substring(str.lastIndexOf(" ")).equalsIgnoreCase(" " + from))
	            output.append(to);

	        return output.toString();
	        
	        
//		String[] arr=str.split(s1);
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i] +arr[i].length());
//		}
//		
//		
//		
//		StringBuilder sb =new StringBuilder();
//		
//		for (String string : arr) {
//			
//			if (string.equals(" ")) {
//				sb.append(s2);
//			}else {
//				sb.append(string);
//			}
//		
//		}
//					
//		return sb.toString();
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rep("Akshay Aks a","Ak","Sams"));
		
	}

}
