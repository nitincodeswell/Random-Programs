package top20;

import java.util.LinkedList;
import java.util.ListIterator;

public class linrev {
	public static void main(String[] args) {
		LinkedList<Integer> a =new LinkedList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			a.add(i);
		}
		//ListIterator<Integer> x= a.listIterator();
		for (int i = 0; i < a.size()/2; i++) {
			int temp=a.get(i);                     
			a.set(i,a.get(a.size()-i-1));
			a.set(a.size()-1-i,temp);
			
		}
		for (Integer integer : a) {
			System.out.println(integer);
		}
		
		
	}
}
