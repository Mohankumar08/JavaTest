package base;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<Integer> s = new LinkedHashSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(10);
		s.add(20);
		
		int size = s.size();
		System.out.println(size);
		
		s.remove(30);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		boolean contains = s.contains(20);
		System.out.println(contains);
		
		for (Integer x : s) {
			System.out.println(x);
		}
	}

}
